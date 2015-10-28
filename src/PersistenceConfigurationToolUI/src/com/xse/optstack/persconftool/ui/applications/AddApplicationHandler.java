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
package com.xse.optstack.persconftool.ui.applications;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EGroupType;
import com.xse.optstack.persconf.PersconfFactory;

/**
 * Handler class for adding a new {@link EApplication} to the configuration.
 *
 * @author philipb
 *
 */
public class AddApplicationHandler {

    @Execute
    public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EApplicationGroup activeGroup,
            @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell) {
        if (activeGroup != null) {
            final InputDialog inputDialog = new InputDialog(shell, "New Application", "Enter the name of the new application:", null,
                    new ApplicationNameInputValidator(activeGroup.getApplications()));
            inputDialog.setBlockOnOpen(true);
            if (inputDialog.open() == Window.OK) {
                final EApplication application = PersconfFactory.eINSTANCE.createEApplication();
                application.setName(inputDialog.getValue());
                application.setGroup(activeGroup);
                activeGroup.getApplications().add(application);
            }
        }
    }

    @CanExecute
    public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EApplicationGroup activeGroup) {
        return (activeGroup != null) && (activeGroup.getType() != EGroupType.PUBLIC);
    }

}
