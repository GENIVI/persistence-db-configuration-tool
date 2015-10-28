/*******************************************************************************
 * Persistence Configuration Tool Base
 *
 * Copyright (c) 2015 Mentor Graphics and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Mentor Graphics - initial API and implementation
 ******************************************************************************/
package com.xse.optstack.persconftool.base.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.xse.eclipseui.util.Logger;
import com.xse.eclipseui.util.StringUtils;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.EDefaultDataType;
import com.xse.optstack.persconf.EGroupType;
import com.xse.optstack.persconf.EInstallException;
import com.xse.optstack.persconf.EInstallRule;
import com.xse.optstack.persconf.EPermission;
import com.xse.optstack.persconf.EPolicy;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.EStorage;
import com.xse.optstack.persconf.PersconfFactory;
import com.xse.optstack.persconf.PersconfPackage;
import com.xse.optstack.persconftool.base.Activator;
import com.xse.optstack.persconftool.base.ConfigurationResource;

/**
 * Utility class fully handling the import from filesystem procedure of persconf configurations.
 *
 * @author philipb
 *
 */
public class PersConfImport {

    private final File rootFolder;

    private final ConfigurationResource configResource;

    /**
     *
     * @param targetPath
     *            fully qualified path to the folder a configuration should be imported from
     * @param configResource
     *            {@link ConfigurationResource} instance where the persconf configuration should be imported to
     */
    public PersConfImport(final String targetPath, final ConfigurationResource configResource) {
        this.configResource = configResource;
        this.rootFolder = new File(targetPath);
    }

    /**
     * Actually starts the import of the persconf configuration at the location specified on construction of this
     * importer instance.
     *
     * @return OK_STATUS if the import did fully succeed, any other {@link IStatus} instance if there have been errors
     *         or warnings or the import had to be cancelled due to serious problems.
     */
    public IStatus importConfig() {
        final File resourceFolder = new File(this.rootFolder.getAbsolutePath() + File.separator + PersConfDefinitions.RESOURCE_FOLDER_NAME);
        if (resourceFolder.exists() && resourceFolder.canExecute()) {
            final Resource resource = this.configResource.getResource();

            final Map<String, EApplication> applicationMap = new HashMap<>();

            boolean hasRootItems = false;
            boolean hasWarnings = false;
            boolean hasErrors = false;
            for (final EGroupType groupType : EGroupType.values()) {
                final File groupFile = new File(resourceFolder.getAbsolutePath() + File.separator + groupType.getLiteral().toLowerCase());
                if (groupFile.exists() && groupFile.canExecute()) {
                    hasRootItems = true;

                    final EApplicationGroup applicationGroup = PersconfFactory.eINSTANCE.createEApplicationGroup();
                    applicationGroup.setType(groupType);
                    resource.getContents().add(applicationGroup);

                    final Map<String, EInstallRule> installRulesMapping = new HashMap<>();
                    final File installRulesFile = new File(groupFile + File.separator + PersConfDefinitions.INSTALL_RULES_FILE);
                    if (installRulesFile.exists() && installRulesFile.canRead()) {
                        final GsonBuilder gsonBuilder = new GsonBuilder();
                        final Gson gson = gsonBuilder.create();
                        try (final FileReader reader = new FileReader(installRulesFile.getAbsolutePath())) {
                            final JsonObject fromJson = gson.fromJson(reader, JsonObject.class);
                            for (final Entry<String, JsonElement> entry : fromJson.entrySet()) {
                                final EInstallRule installRule = EInstallRule.get(entry.getValue().getAsString()
                                        .substring(PersConfDefinitions.INSTALL_RULE_PREFIX.length()));
                                if (installRule != null) {
                                    installRulesMapping.put(entry.getKey(), installRule);
                                } else {
                                    Logger.warn(Activator.PLUGIN_ID, "Invalid installation rule definition '"
                                            + entry.getValue().getAsString() + "' in group " + groupType + " group.");
                                    hasWarnings = true;
                                }
                            }
                        } catch (final Exception e) {
                            Logger.error(Activator.PLUGIN_ID, "Error parsing " + installRulesFile.getName() + " of " + groupType
                                    + " group. Does that file contain valid JSON (e.g. no trailing commas)?", e);
                            hasErrors = true;
                        }
                    }

                    final File[] groupFiles = groupFile.listFiles((FileFilter) DirectoryFileFilter.INSTANCE);
                    if (groupFiles != null) {
                        for (final File appFolder : groupFiles) {
                            if (appFolder.exists() && appFolder.canExecute()) {
                                final EApplication application = PersconfFactory.eINSTANCE.createEApplication();
                                application.setName(appFolder.getName());
                                applicationMap.put(application.getName(), application);
                                if (installRulesMapping.containsKey(appFolder.getName())) {
                                    application.setInstallRule(installRulesMapping.get(appFolder.getName()));
                                }
                                applicationGroup.getApplications().add(application);

                                final Map<String, EResource> resources = new HashMap<>();

                                final File installExceptionsFile = new File(appFolder.getAbsolutePath() + File.separator
                                        + PersConfDefinitions.INSTALL_EXCEPTIONS_FILE);
                                if (installExceptionsFile.exists() && installExceptionsFile.canRead()) {
                                    final GsonBuilder gsonBuilder = new GsonBuilder();
                                    final Gson gson = gsonBuilder.create();
                                    try (final FileReader reader = new FileReader(installExceptionsFile.getAbsolutePath())) {
                                        final JsonObject fromJson = gson.fromJson(reader, JsonObject.class);
                                        for (final Entry<String, JsonElement> entry : fromJson.entrySet()) {
                                            final EInstallException installException = EInstallException.get(entry.getValue().getAsString()
                                                    .substring(PersConfDefinitions.INSTALL_EXCEPTION_PREFIX.length()));
                                            if (installException != null) {
                                                final EResource res = createResource(entry.getKey());
                                                res.setInstallException(installException);
                                                application.getResources().add(res);
                                                resources.put(entry.getKey(), res);
                                            } else {
                                                Logger.warn(Activator.PLUGIN_ID, "Invalid installation exception definition: "
                                                        + entry.getValue().getAsString() + " of application '" + application.getName()
                                                        + "'.");
                                                hasWarnings = true;
                                            }
                                        }
                                    } catch (final Exception e) {
                                        Logger.error(Activator.PLUGIN_ID,
                                                "Error parsing install exceptions file '" + installExceptionsFile.getName()
                                                + "' of application '" + application.getName()
                                                + "'. Does that file contain valid JSON (e.g. no trailing commas)?", e);
                                        hasErrors = true;
                                    }
                                }

                                final File resouceConfigurationFile = new File(appFolder.getAbsolutePath() + File.separator
                                        + PersConfDefinitions.RESOURCE_CONFIGURATION_FILE);
                                if (resouceConfigurationFile.exists() && resouceConfigurationFile.canRead()) {
                                    final GsonBuilder gsonBuilder = new GsonBuilder();
                                    final Gson gson = gsonBuilder.create();
                                    try (final FileReader reader = new FileReader(resouceConfigurationFile.getAbsolutePath())) {
                                        final JsonObject fromJson = gson.fromJson(reader, JsonObject.class);
                                        final JsonElement resourcesNode = fromJson.get(PersConfDefinitions.RESOURCES_KEY_NAME);
                                        final JsonElement versionElement = fromJson.get(PersConfDefinitions.VERSION_KEY_NAME);
                                        if (versionElement != null) {
                                            application.setVersion(versionElement.getAsString());
                                        }
                                        if (resourcesNode != null) {
                                            for (final Entry<String, JsonElement> entry : resourcesNode.getAsJsonObject().entrySet()) {
                                                if (!resources.containsKey(entry.getKey())) {
                                                    final EResource res = createResource(entry.getKey());
                                                    resources.put(entry.getKey(), res);
                                                    application.getResources().add(res);
                                                }
                                                final EResource res = resources.get(entry.getKey());

                                                if (PersConfImport.handleConfigEntries(entry, res)) {
                                                    hasWarnings = true;
                                                }
                                            }
                                        }
                                    } catch (final Exception e) {
                                        Logger.error(Activator.PLUGIN_ID,
                                                "Error parsing resource configuration file of application '" + application.getName()
                                                + "'. Does that file contain valid JSON (e.g. no trailing commas)?", e);
                                        hasErrors = true;
                                    }
                                } else {
                                    Logger.warn(Activator.PLUGIN_ID, "Unable to read resource configuration file: "
                                            + resouceConfigurationFile.getName());
                                    hasWarnings = true;
                                }

                                final File configDefaultFile = new File(appFolder.getAbsolutePath() + File.separator
                                        + PersConfDefinitions.KEY_FOLDER + File.separator + PersConfDefinitions.CONFIGURABLE_DEFAULTS_FILE);
                                if (PersConfImport.handleDefaultDataEntry(configDefaultFile,
                                        PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT, resources, application)) {
                                    hasWarnings = true;
                                }

                                final File factoryDefaultFile = new File(appFolder.getAbsolutePath() + File.separator
                                        + PersConfDefinitions.KEY_FOLDER + File.separator + PersConfDefinitions.FACTORY_DEFAULTS_FILE);
                                if (PersConfImport.handleDefaultDataEntry(factoryDefaultFile,
                                        PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT, resources, application)) {
                                    hasWarnings = true;
                                }
                            }
                        }
                    }
                } else {
                    // add missing application groups
                    final EApplicationGroup applicationGroup = PersconfFactory.eINSTANCE.createEApplicationGroup();
                    applicationGroup.setType(groupType);
                    resource.getContents().add(applicationGroup);
                    Logger.warn(Activator.PLUGIN_ID, "No configuration items for " + groupType + ".");
                    hasWarnings = true;
                }
            }

            if (!hasRootItems) {
                return new Status(IStatus.CANCEL, Activator.PLUGIN_ID,
                        "Directory does not contain a valid persistency configuration structure.");
            }

            this.importAppSizes(applicationMap);

            if (hasErrors) {
                return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The configuration " + this.rootFolder + " contains errors.");
            } else if (hasWarnings) {
                return new Status(IStatus.WARNING, Activator.PLUGIN_ID, "The configuration " + this.rootFolder + " contains warnings.");
            } else {
                return Status.OK_STATUS;
            }
        } else {
            return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Directory does not contain a '"
                    + PersConfDefinitions.RESOURCE_FOLDER_NAME + "' folder.");
        }
    }

    private void importAppSizes(final Map<String, EApplication> applications) {
        final File sizesFile = new File(this.rootFolder.getAbsolutePath() + File.separator + PersConfDefinitions.APP_SIZES_FILE_NAME);
        if (sizesFile.exists()) {
            if (sizesFile.canRead()) {
                try (FileReader reader = new FileReader(sizesFile); final BufferedReader bufferedReader = new BufferedReader(reader)) {
                    String line = null;
                    final Pattern pattern = Pattern.compile("(.*) ([0-9]+)");
                    while ((line = bufferedReader.readLine()) != null) {
                        if (!StringUtils.isEmpty(line)) {
                            final Matcher matcher = pattern.matcher(line);
                            if (matcher.find()) {
                                final String appName = matcher.group(1);
                                if (applications.containsKey(appName)) {
                                    final String sizeValue = matcher.group(2);
                                    if (!StringUtils.isEmpty(sizeValue)) {
                                        try {
                                            final Integer size = Integer.valueOf(sizeValue);
                                            applications.get(appName).setSize(size);
                                        } catch (final NumberFormatException e) {
                                            Logger.warn(Activator.PLUGIN_ID, "Invalid application app size for: " + line + ".", e);
                                        }
                                    }
                                } else {
                                    Logger.warn(Activator.PLUGIN_ID, "No application for app size definition '" + appName + "'.");
                                }
                            } else {
                                Logger.warn(Activator.PLUGIN_ID, "Invalid syntax in app sizes file for line: " + line);
                            }
                        }
                    }
                } catch (final FileNotFoundException e) {
                    Logger.warn(Activator.PLUGIN_ID, "App sizes file (" + sizesFile.getAbsolutePath() + ") cannot be read!", e);
                } catch (final IOException e) {
                    Logger.warn(Activator.PLUGIN_ID, "App sizes file (" + sizesFile.getAbsolutePath() + ") cannot be read!", e);
                }
            } else {
                Logger.warn(Activator.PLUGIN_ID, "App sizes file (" + sizesFile.getAbsolutePath() + ") cannot be read!");
            }
        }
    }

    private static boolean handleDefaultDataEntry(final File defaultDataFile, final int featureId, final Map<String, EResource> resources,
            final EApplication application) {
        boolean hasWarnings = false;

        if (defaultDataFile.exists()) {
            if (defaultDataFile.canRead()) {
                final GsonBuilder gsonBuilder = new GsonBuilder();
                final Gson gson = gsonBuilder.create();
                try (final FileReader reader = new FileReader(defaultDataFile.getAbsolutePath())) {
                    final JsonObject fromJson = gson.fromJson(reader, JsonObject.class);
                    final JsonElement resourcesNode = fromJson.get(PersConfDefinitions.RESOURCES_KEY_NAME);
                    if (resourcesNode != null) {
                        for (final Entry<String, JsonElement> entry : resourcesNode.getAsJsonObject().entrySet()) {
                            if (!resources.containsKey(entry.getKey())) {
                                Logger.warn(Activator.PLUGIN_ID, "No resource for config default data key '" + entry.getKey() + "' in "
                                        + defaultDataFile.getName() + " of application '" + application.getName() + "'.");
                                hasWarnings = true;
                                continue;
                            }
                            final EResource res = resources.get(entry.getKey());
                            final EDefaultData defaultData = (EDefaultData) res.getConfiguration().eGet(
                                    res.getConfiguration().eClass().getEStructuralFeature(featureId));
                            for (final Entry<String, JsonElement> configEntry : entry.getValue().getAsJsonObject().entrySet()) {
                                if (configEntry.getKey().equals(PersconfPackage.Literals.EDEFAULT_DATA__SIZE.getName())) {
                                    defaultData.setSize(configEntry.getValue().getAsString());
                                } else if (configEntry.getKey().equals(PersconfPackage.Literals.EDEFAULT_DATA__DATA.getName())) {
                                    defaultData.setData(configEntry.getValue().getAsString());
                                } else {
                                    Logger.warn(Activator.PLUGIN_ID, "Unsupported config default data entry '" + configEntry.getKey()
                                    + "' in " + defaultDataFile.getName() + " of application '" + application.getName() + "'.");
                                    hasWarnings = true;
                                }
                            }
                        }
                    }
                } catch (final JsonSyntaxException e) {
                    Logger.warn(Activator.PLUGIN_ID, "Invalid JSON syntax for " + defaultDataFile.getName() + " of application '"
                            + application.getName() + "'.", e);
                    hasWarnings = true;
                } catch (final IOException | JsonIOException e) {
                    Logger.warn(Activator.PLUGIN_ID, "Error reading default data configuration file " + defaultDataFile.getName()
                    + " of application '" + application.getName() + "'.", e);
                    hasWarnings = true;
                }
            } else {
                Logger.warn(Activator.PLUGIN_ID, "Unable to read configurable default data from " + defaultDataFile.getName()
                + " of application '" + application.getName() + "'.");
                hasWarnings = true;
            }
        }

        return hasWarnings;
    }

    private static boolean handleConfigEntries(final Entry<String, JsonElement> entry, final EResource resource) {
        final EConfiguration configuration = resource.getConfiguration();
        boolean hasWarnings = false;

        for (final Entry<String, JsonElement> configEntry : entry.getValue().getAsJsonObject().entrySet()) {
            if (configEntry.getKey().equals(PersconfPackage.Literals.ECONFIGURATION__POLICY.getName())) {
                final EPolicy policy = EPolicy.get(configEntry.getValue().getAsString());
                if (policy != null) {
                    configuration.setPolicy(policy);
                } else {
                    Logger.warn(Activator.PLUGIN_ID, "Unsupported policy: " + configEntry.getValue().getAsString());
                    hasWarnings = true;
                }
            } else if (configEntry.getKey().equals(PersconfPackage.Literals.ECONFIGURATION__PERMISSION.getName())) {
                final EPermission permission = EPermission.get(configEntry.getValue().getAsString());
                if (permission != null) {
                    configuration.setPermission(permission);
                } else {
                    Logger.warn(Activator.PLUGIN_ID, "Unsupported permission: " + configEntry.getValue().getAsString());
                    hasWarnings = true;
                }
            } else if (configEntry.getKey().equals(PersconfPackage.Literals.ECONFIGURATION__STORAGE.getName())) {
                final EStorage storage = EStorage.get(configEntry.getValue().getAsString());
                if (storage != null) {
                    configuration.setStorage(storage);
                } else {
                    Logger.warn(Activator.PLUGIN_ID, "Unsupported storage: " + configEntry.getValue().getAsString());
                    hasWarnings = true;
                }
            } else if (configEntry.getKey().equals(PersconfPackage.Literals.ECONFIGURATION__MAX_SIZE.getName())) {
                configuration.setMax_size(configEntry.getValue().getAsString());
            } else if (configEntry.getKey().equals(PersconfPackage.Literals.ECONFIGURATION__RESPONSIBLE.getName())) {
                configuration.setResponsible(configEntry.getValue().getAsString());
            } else if (configEntry.getKey().equals(PersconfPackage.Literals.ECONFIGURATION__CUSTOM_NAME.getName())) {
                configuration.setCustom_name(configEntry.getValue().getAsString());
            } else if (configEntry.getKey().equals(PersconfPackage.Literals.ECONFIGURATION__TYPE.getName())) {
                final EDefaultDataType type = EDefaultDataType.get(configEntry.getValue().getAsString());
                if (type != null) {
                    configuration.setType(type);
                } else {
                    Logger.warn(Activator.PLUGIN_ID, "Unsupported configuration default data type: " + configEntry.getValue().getAsString());
                    hasWarnings = true;
                }
            } else if (configEntry.getKey().equals(PersconfPackage.Literals.ECONFIGURATION__CUSTOM_ID.getName())) {
                configuration.setCustomID(configEntry.getValue().getAsString());
            } else {
                Logger.warn(Activator.PLUGIN_ID, "Unsupported configuration entry: " + configEntry.getKey());
                hasWarnings = true;
            }
        }

        return hasWarnings;
    }

    private static EResource createResource(final String name) {
        final EResource resource = PersconfFactory.eINSTANCE.createEResource();
        resource.setName(name);

        final EConfiguration configuration = PersconfFactory.eINSTANCE.createEConfiguration();
        resource.setConfiguration(configuration);

        final EDefaultData factoryDefaultData = PersconfFactory.eINSTANCE.createEDefaultData();
        configuration.setFactoryDefault(factoryDefaultData);
        final EDefaultData configDefaultData = PersconfFactory.eINSTANCE.createEDefaultData();
        configuration.setConfigDefault(configDefaultData);

        return resource;
    }

}
