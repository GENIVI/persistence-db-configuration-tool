/*******************************************************************************
 * Persistence Configuration Tool UI
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
package com.xse.optstack.persconftool.ui.handlers;

import java.io.File;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;

import com.xse.eclipseui.SettingsException;
import com.xse.eclipseui.dialog.DialogSettingsUtil;
import com.xse.eclipseui.util.Logger;
import com.xse.optstack.persconftool.base.ConfigurationResource;
import com.xse.optstack.persconftool.base.persistence.PersConfImport;
import com.xse.optstack.persconftool.ui.Activator;

public class OpenHandler {

    private static final String OPEN_FOLDER_DIALOG_SETTINGS_KEY = "openFolderDialogSettingsKey";
    private static final String LAST_USED_FOLDER_SETTINGS_KEY = "lastUsedFolderSettingsKey";

    @Execute
    public void execute(final MApplication application) {
        final DirectoryDialog dirDialog = new DirectoryDialog(Display.getDefault().getActiveShell(), SWT.OPEN);
        dirDialog.setMessage("Select the folder to import the configuration from:");

        try {
            final DialogSettingsUtil settingsUtil = DialogSettingsUtil.createInstance(Activator.getDefault(),
                    OPEN_FOLDER_DIALOG_SETTINGS_KEY);
            if (settingsUtil.isSectionAvailable(OPEN_FOLDER_DIALOG_SETTINGS_KEY)) {
                final String lastUsedFolderLocation = settingsUtil.getSetting(OPEN_FOLDER_DIALOG_SETTINGS_KEY,
                        LAST_USED_FOLDER_SETTINGS_KEY);
                if (lastUsedFolderLocation != null) {
                    final File folder = new File(lastUsedFolderLocation);
                    if (folder.exists() && folder.canExecute()) {
                        dirDialog.setFilterPath(lastUsedFolderLocation);
                    }
                }
            }
        } catch (final SettingsException | NumberFormatException e) {
            Logger.debug(Activator.PLUGIN_ID, "Unable to restore last used folder!", e);
        }

        final String path = dirDialog.open();
        if ((path != null) && (path.length() > 2)) {
            try {
                final DialogSettingsUtil settingsUtil = DialogSettingsUtil.createInstance(Activator.getDefault(),
                        OPEN_FOLDER_DIALOG_SETTINGS_KEY);
                settingsUtil.setSetting(OPEN_FOLDER_DIALOG_SETTINGS_KEY, LAST_USED_FOLDER_SETTINGS_KEY, path);
            } catch (final SettingsException e) {
                Logger.debug(Activator.PLUGIN_ID, "Unable to store last used folder location!", e);
            }

            final URI fileURI = URI.createFileURI(path);
            final ConfigurationResource configResource = ConfigurationResource.createResource(fileURI);
            final PersConfImport persConfImport = new PersConfImport(path, configResource);
            final IStatus status = persConfImport.importConfig();
            String msg = null;
            switch (status.getSeverity()) {
            case IStatus.OK:
            case IStatus.INFO:
                application.getContext().set(Resource.class, configResource.getResource());
                break;
            case IStatus.WARNING:
                msg = status.getMessage();
                application.getContext().set(Resource.class, configResource.getResource());
                break;
            case IStatus.ERROR:
                msg = status.getMessage();
                MessageDialog.openError(Display.getDefault().getActiveShell(), "Error loading configuration", msg);
                break;
            case IStatus.CANCEL:
                msg = "The specified configuration could not be loaded: " + status.getMessage();
                MessageDialog.openError(Display.getDefault().getActiveShell(), "Error loading configuration", msg);
                break;
            default:
                msg = status.getMessage();
                break;
            }
            if (msg != null) {
                Logger.submitMulti(Activator.PLUGIN_ID, configResource, msg);
            }
        }
    }

}
