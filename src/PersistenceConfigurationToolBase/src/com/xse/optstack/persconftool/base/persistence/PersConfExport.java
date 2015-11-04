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

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.xse.eclipseui.util.Logger;
import com.xse.eclipseui.util.StringUtils;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.EDefaultDataType;
import com.xse.optstack.persconf.EPolicy;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.EStorage;
import com.xse.optstack.persconf.impl.EApplicationImpl;
import com.xse.optstack.persconf.impl.EConfigurationImpl;
import com.xse.optstack.persconf.impl.EDefaultDataImpl;
import com.xse.optstack.persconftool.base.Activator;

/**
 * Utility class fully handling the export procedure of persconf configurations.
 *
 * @author philipb
 *
 */
public class PersConfExport {

    private final File rootFolder;

    /**
     *
     * @param targetPath
     *            fully qualified path to the folder a configuration should be exported to
     */
    public PersConfExport(final String targetPath) {
        this.rootFolder = new File(targetPath);
    }

    /**
     * Actually starts the exporting of the specified {@link Resource} to the location assigned on construction of this
     * exporter instance.
     *
     * @param resource
     *            persconf resource that should be exported
     * @return true if the export did fully succeed, false if there have been errors and the configuration probably
     *         hasn't been fully exported
     */
    public boolean export(final Resource resource) {
        final File resourceFolder = new File(this.rootFolder.getAbsolutePath() + File.separator + PersConfDefinitions.RESOURCE_FOLDER_NAME);
        try {
            resourceFolder.mkdir();
        } catch (final SecurityException e) {
            Logger.error(Activator.PLUGIN_ID, "Not allowed to create resource folder: " + resourceFolder.getAbsolutePath(), e);
            return false;
        }

        boolean persistStatus = true;
        for (final EObject eObject : resource.getContents()) {
            if (eObject instanceof EApplicationGroup) {
                final boolean status = this.persistGroup(resourceFolder, (EApplicationGroup) eObject);
                if (!status) {
                    persistStatus = false;
                }
            }
        }

        this.exportAppSizes(resource);

        return persistStatus;
    }

    private void exportCHeader(final EApplication application) {
        if (application.getResources().size() > 0) {
            final File headerFolder = new File(this.rootFolder + File.separator + "header");
            try {
                headerFolder.mkdir();
            } catch (final SecurityException e) {
                Logger.error(Activator.PLUGIN_ID, "Not allowed to create header folder: " + headerFolder.getAbsolutePath(), e);
            }
            if (headerFolder.exists() && headerFolder.canExecute()) {
                final String lineSeparator = System.getProperty("line.separator");
                try (final FileWriter fileWriter = new FileWriter(headerFolder + File.separator + application.getName() + ".h")) {
                    for (final EResource eResource : application.getResources()) {
                        fileWriter.write("#define ");
                        fileWriter.write(application.getName().toUpperCase() + "_" + eResource.getName().toUpperCase());
                        fileWriter.write(" " + eResource.getName() + lineSeparator);
                    }
                } catch (final IOException e) {
                    Logger.error(Activator.PLUGIN_ID, "Unable to create header file for " + application.getName() + ".", e);
                }
            } else {
                Logger.error(Activator.PLUGIN_ID, "Unable to read header folder: " + headerFolder.getAbsolutePath());
            }
        }
    }

    private void exportAppSizes(final Resource resource) {
        final String lineSeparator = System.getProperty("line.separator");

        final StringBuilder outputBuilder = new StringBuilder();
        for (final EObject eObject : resource.getContents()) {
            if (eObject instanceof EApplicationGroup) {
                final EApplicationGroup group = (EApplicationGroup) eObject;
                for (final EApplication application : group.getApplications()) {
                    if (application.getSize() != null) {
                        outputBuilder.append(application.getName() + " ");
                        outputBuilder.append(application.getSize().toString() + lineSeparator);
                    }
                }
            }
        }

        if (outputBuilder.length() > 1) {
            final File file = new File(this.rootFolder.getAbsolutePath() + File.separator + PersConfDefinitions.APP_SIZES_FILE_NAME);

            try (final FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(outputBuilder.toString());
            } catch (final IOException e) {
                Logger.error(Activator.PLUGIN_ID, "Unable to create application size config file " + file.getAbsolutePath() + ".", e);
            }
        }
    }

    private static GsonBuilder createGsonBuilder() {
        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setExclusionStrategies(new EmfExclusionStrategy());
        gsonBuilder.setPrettyPrinting();

        return gsonBuilder;
    }

    private boolean persistGroup(final File resourceFolder, final EApplicationGroup group) {
        final boolean persistStatus = true;

        final File groupFolder = new File(resourceFolder.getAbsolutePath() + File.separator + group.getType().getLiteral().toLowerCase());
        try {
            groupFolder.mkdir();
        } catch (final SecurityException e) {
            Logger.error(Activator.PLUGIN_ID, "Not allowed to create group folder: " + groupFolder.getAbsolutePath(), e);
            return false;
        }

        final Set<String> appNames = new HashSet<>();

        // ################ Installation Rules
        final Gson installRulesJson = PersConfExport.createGsonBuilder().create();
        final JsonObject obj = new JsonObject();
        for (final EApplication eApplication : group.getApplications()) {
            if (eApplication.getInstallRule() != null) {
                obj.add(eApplication.getName(), new JsonPrimitive(PersConfDefinitions.INSTALL_RULE_PREFIX
                        + eApplication.getInstallRule().getLiteral()));
            }
        }
        try (final FileWriter fileWriter = new FileWriter(new File(groupFolder.getAbsolutePath() + File.separator
                + PersConfDefinitions.INSTALL_RULES_FILE))) {
            fileWriter.write(installRulesJson.toJson(obj));
        } catch (final IOException e) {
            Logger.error(Activator.PLUGIN_ID, "Error writing install rules configuration file!", e);
        }

        for (final EApplication eApplication : group.getApplications()) {
            final File applicationFolder = new File(groupFolder + File.separator + eApplication.getName());
            applicationFolder.mkdir();

            this.exportCHeader(eApplication);

            // ################ Resource Configuration
            final GsonBuilder resourceConfigJsonBuilder = PersConfExport.createGsonBuilder();
            resourceConfigJsonBuilder.registerTypeAdapter(EApplicationImpl.class, new ResouceConfigurationApplicationTypeAdapter());
            resourceConfigJsonBuilder.registerTypeAdapter(EConfigurationImpl.class, new ResourceConfigurationConfigurationTypeAdapter());
            resourceConfigJsonBuilder.registerTypeAdapter(EPolicy.class, new ResouceConfigurationTypeAdapter());
            resourceConfigJsonBuilder.registerTypeAdapter(EStorage.class, new ResouceConfigurationTypeAdapter());
            resourceConfigJsonBuilder.registerTypeAdapter(EDefaultDataType.class, new ResouceConfigurationTypeAdapter());
            resourceConfigJsonBuilder.setExclusionStrategies(new ExclusionStrategy() {
                @Override
                public boolean shouldSkipField(final FieldAttributes fieldAttributes) {
                    return false;
                }

                @Override
                public boolean shouldSkipClass(final Class<?> clazz) {
                    return clazz.isAssignableFrom(EDefaultData.class);
                }
            });
            final Gson gson = resourceConfigJsonBuilder.create();
            try (final FileWriter fileWriter = new FileWriter(new File(applicationFolder.getAbsolutePath() + File.separator
                    + PersConfDefinitions.RESOURCE_CONFIGURATION_FILE))) {
                fileWriter.write(gson.toJson(eApplication));
            } catch (final IOException e) {
                Logger.error(Activator.PLUGIN_ID, "Error writing resource configuration file!", e);
            }

            // ################ Install Exceptions
            final Gson installExceptionsGson = PersConfExport.createGsonBuilder().create();
            final JsonObject installExceptionsObj = new JsonObject();
            for (final EResource resource : eApplication.getResources()) {
                if (resource.getInstallException() != null) {
                    installExceptionsObj.add(resource.getName(), new JsonPrimitive(PersConfDefinitions.INSTALL_EXCEPTION_PREFIX
                            + resource.getInstallException().getLiteral()));
                }
            }
            try (final FileWriter fileWriter = new FileWriter(new File(applicationFolder.getAbsolutePath() + File.separator
                    + PersConfDefinitions.INSTALL_EXCEPTIONS_FILE))) {
                fileWriter.write(installExceptionsGson.toJson(installExceptionsObj));
            } catch (final IOException e) {
                Logger.error(Activator.PLUGIN_ID, "Error writing install exceptions configuration file!", e);
            }

            final File fileFolder = new File(applicationFolder + File.separator + PersConfDefinitions.FILE_FOLDER);
            fileFolder.mkdir();
            final File configDefaultFileFolder = new File(fileFolder + File.separator
                    + PersConfDefinitions.CONFIGURABLE_DEFAULT_DATA_FOLDER);
            configDefaultFileFolder.mkdir();
            final File defaultFileFolder = new File(fileFolder + File.separator + PersConfDefinitions.DEFAULT_DATA_FOLDER);
            defaultFileFolder.mkdir();

            // ################ Default Data
            final File keyFolder = new File(applicationFolder + File.separator + PersConfDefinitions.KEY_FOLDER);
            keyFolder.mkdir();

            // ################ Factory Default
            //            boolean hasDefaultKeyData = false;
            //            for (final EResource eResource : eApplication.getResources()) {
            //                if (DefaultDataApplicationTypeAdapter.hasDefaultDataValue(eResource.getConfiguration().getFactoryDefault())) {
            //                    hasDefaultKeyData = true;
            //                    break;
            //                }
            //            }

            PersConfExport.copyDefaultDataFiles(defaultFileFolder, eApplication, EConfiguration::getFactoryDefault);

            final File factoryDefaultsFile = new File(keyFolder.getAbsolutePath() + File.separator
                    + PersConfDefinitions.FACTORY_DEFAULTS_FILE);
            final GsonBuilder factoryDefaultGsonBuilder = PersConfExport.createGsonBuilder();
            factoryDefaultGsonBuilder.registerTypeAdapter(EApplicationImpl.class, new DefaultDataApplicationTypeAdapter(true));
            factoryDefaultGsonBuilder.registerTypeAdapter(EDefaultDataImpl.class, new DefaultDataTypeAdapter());
            final Gson factoryDefaultGson = factoryDefaultGsonBuilder.create();
            try (final FileWriter fileWriter = new FileWriter(factoryDefaultsFile)) {
                fileWriter.write(factoryDefaultGson.toJson(eApplication));
            } catch (final IOException e) {
                e.printStackTrace();
            }

            // ################ Configurable Default
            //            hasDefaultKeyData = false;
            //            for (final EResource eResource : eApplication.getResources()) {
            //                if (DefaultDataApplicationTypeAdapter.hasDefaultDataValue(eResource.getConfiguration().getConfigDefault())) {
            //                    hasDefaultKeyData = true;
            //                    break;
            //                }
            //            }

            PersConfExport.copyDefaultDataFiles(configDefaultFileFolder, eApplication, EConfiguration::getConfigDefault);

            final File configDefaultsFile = new File(keyFolder.getAbsolutePath() + File.separator
                    + PersConfDefinitions.CONFIGURABLE_DEFAULTS_FILE);
            final GsonBuilder configurableDefaultGsonBuilder = PersConfExport.createGsonBuilder();
            configurableDefaultGsonBuilder.registerTypeAdapter(EApplicationImpl.class, new DefaultDataApplicationTypeAdapter(false));
            configurableDefaultGsonBuilder.registerTypeAdapter(EDefaultDataImpl.class, new DefaultDataTypeAdapter());
            final Gson configurableDefaultGson = configurableDefaultGsonBuilder.create();
            try (final FileWriter fileWriter = new FileWriter(configDefaultsFile)) {
                fileWriter.write(configurableDefaultGson.toJson(eApplication));
            } catch (final IOException e) {
                e.printStackTrace();
            }

            appNames.add(eApplication.getName());
        }

        final File[] groupFiles = groupFolder.listFiles((FileFilter) DirectoryFileFilter.INSTANCE);
        // remove all application folders not part of the current configuration anymore
        if (groupFiles != null) {
            for (final File appFolder : groupFiles) {
                if (!appNames.contains(appFolder.getName())) {
                    try {
                        FileUtils.deleteDirectory(appFolder);
                    } catch (final IOException e) {
                        Logger.error(Activator.PLUGIN_ID, "Unable to delete removed application directory: " + appFolder.getName(), e);
                    }
                }
            }
        }

        return persistStatus;
    }

    private static void copyDefaultDataFiles(final File targetBaseFolder, final EApplication application,
            final Function<EConfiguration, EDefaultData> defaultDataProvider) {
        for (final EResource eResource : application.getResources()) {
            // copy default data files in case we have a file-based default data configuration with new file refs
            if (eResource.getConfiguration().getType() == EDefaultDataType.FILE) {
                final EDefaultData factoryDefaultData = defaultDataProvider.apply(eResource.getConfiguration());
                if (!StringUtils.isEmpty(factoryDefaultData.getLocalResourcePath())) {
                    final File dataFile = new File(factoryDefaultData.getLocalResourcePath());
                    if (dataFile.exists() && dataFile.canRead()) {
                        try {
                            final Path source = Paths.get(dataFile.toURI());
                            final Path target = Paths.get(new File(targetBaseFolder.getAbsolutePath() + File.separator
                                    + eResource.getName()).toURI());
                            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
                        } catch (final IOException | IllegalArgumentException | SecurityException e) {
                            Logger.error(Activator.PLUGIN_ID,
                                    "Error copying factory default file to target location: " + eResource.getName(), e);
                        }
                    } else {
                        Logger.warn(Activator.PLUGIN_ID, "Invalid factory default data path!");
                    }
                }
            }
        }
    }

}
