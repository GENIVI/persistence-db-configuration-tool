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
package com.xse.optstack.persconftool.ui.resources;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EResource;

/**
 * Handler class for changing the name of an {@link EResource}.
 *
 * @author philipb
 *
 */
public class EditResourceHandler {

    @Execute
    public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EResource activeResource,
            @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell) {
        if ((activeResource != null) && (activeResource.eContainer() instanceof EApplication)) {
            final EApplication application = (EApplication) activeResource.eContainer();
            final InputDialog inputDialog = new InputDialog(shell, "Edit Resource", "Change the name of the resource:",
                    activeResource.getName(), new ResourceNameInputValidator(application.getResources(), activeResource));
            inputDialog.setBlockOnOpen(true);
            if (inputDialog.open() == Window.OK) {
                activeResource.setName(inputDialog.getValue());
            }
        }
    }

    @CanExecute
    public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EResource activeResource) {
        return (activeResource != null);
    }

}
