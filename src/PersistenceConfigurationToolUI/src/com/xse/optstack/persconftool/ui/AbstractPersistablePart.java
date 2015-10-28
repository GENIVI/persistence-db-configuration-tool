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
package com.xse.optstack.persconftool.ui;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;

import com.xse.optstack.persconftool.base.persistence.PersConfExport;

/**
 * Base class for all view parts needing to provide persistence functionality.
 *
 * @author philipb
 *
 */
public abstract class AbstractPersistablePart {

    public static final String APPLICATION_TITLE = "Persistence Configuration Tool";

    @Persist
    public void exportToFiles(final MWindow window, final Resource resource, final EPartService partService) {
        if (!partService.getDirtyParts().isEmpty()) {
            URI fileURI = null;
            if (resource.getURI() == null) {
                final DirectoryDialog dirDialog = new DirectoryDialog(Display.getDefault().getActiveShell(), SWT.SAVE);
                dirDialog.setMessage("Select the folder to export the configuration to:");

                final String path = dirDialog.open();
                if ((path != null) && (path.length() > 2)) {
                    fileURI = URI.createFileURI(path);
                }
            } else {
                fileURI = resource.getURI();
            }

            if (fileURI != null) {
                resource.setURI(fileURI);
                final PersConfExport persConfExport = new PersConfExport(fileURI.toFileString());
                if (!persConfExport.export(resource)) {
                    MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Export",
                            "The current configuration could not be fully exported.");
                } else {
                    // make sure to reset dirty state for all parts
                    partService.getDirtyParts().forEach(p -> p.setDirty(false));
                }

                window.setLabel(fileURI.toFileString() + " - " + APPLICATION_TITLE);
            }
        }
    }

}
