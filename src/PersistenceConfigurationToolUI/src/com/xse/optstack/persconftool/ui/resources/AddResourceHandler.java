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

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.PersconfFactory;

/**
 * Handler class for adding a new {@link EResource} to the configuration.
 *
 * @author philipb
 *
 */
public class AddResourceHandler {

    private EApplication activeApplication;

    @Execute
    public void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell) {
        if (this.activeApplication != null) {
            final InputDialog inputDialog = new InputDialog(shell, "New Resource", "Enter the name of the new resource:", null,
                    new ResourceNameInputValidator(this.activeApplication.getResources()));
            inputDialog.setBlockOnOpen(true);
            if (inputDialog.open() == Window.OK) {
                final EResource resource = PersconfFactory.eINSTANCE.createEResource();
                final EConfiguration configuration = PersconfFactory.eINSTANCE.createEConfiguration();
                resource.setConfiguration(configuration);
                resource.setName(inputDialog.getValue());
                EDefaultData defaultData = PersconfFactory.eINSTANCE.createEDefaultData();
                configuration.setFactoryDefault(defaultData);
                defaultData = PersconfFactory.eINSTANCE.createEDefaultData();
                configuration.setConfigDefault(defaultData);
                this.activeApplication.getResources().add(resource);
            }
        }
    }

    @Inject
    public void setInput(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EObject selection) {
        if (selection instanceof EApplication) {
            this.activeApplication = (EApplication) selection;
        } else if (selection instanceof EApplicationGroup) {
            this.activeApplication = null;
        }
    }

    @CanExecute
    public boolean canExecute() {
        return this.activeApplication != null;
    }

}
