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

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.xse.eclipseui.dialog.MessageDialogHelper;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.EGroupType;
import com.xse.optstack.persconf.EInstallRule;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.PersconfFactory;

/**
 * Handler class for creating a new persconf configuration.
 *
 * @author philipb
 *
 */
public class NewPersConfSetupHandler {

    @Execute
    public void execute(final MApplication application, final EPartService partService) {
        boolean execute = true;
        if (!partService.getDirtyParts().isEmpty()) {
            execute = MessageDialogHelper.openConfirm("New Configuration",
                    "Your current configuration contains unsaved changes. Are you sure you want to create a new configuration and loose all this changes?");
        }
        if (execute) {
            final ResourceSet rs = new ResourceSetImpl();
            final URI fileURI = URI.createFileURI("persconf.xml"); // this URI has no relevance
            final Resource resource = rs.createResource(fileURI);
            resource.setURI(null);

            // create the default configuration layout
            final EApplicationGroup appsApplicationGroup = PersconfFactory.eINSTANCE.createEApplicationGroup();
            appsApplicationGroup.setType(EGroupType.APPLICATION);
            resource.getContents().add(appsApplicationGroup);
            final EApplicationGroup sharedApplicationGroup = PersconfFactory.eINSTANCE.createEApplicationGroup();
            sharedApplicationGroup.setType(EGroupType.SHARED);
            resource.getContents().add(sharedApplicationGroup);

            final EApplicationGroup publicApplicationGroup = PersconfFactory.eINSTANCE.createEApplicationGroup();
            publicApplicationGroup.setType(EGroupType.PUBLIC);
            resource.getContents().add(publicApplicationGroup);

            final EApplication publicApplication = PersconfFactory.eINSTANCE.createEApplication();
            publicApplication.setName("public");
            publicApplicationGroup.getApplications().add(publicApplication);

            // ############## sample data ##############
            final EApplication a1 = PersconfFactory.eINSTANCE.createEApplication();
            a1.setName("Appl1");
            a1.setInstallRule(EInstallRule.NEW_INSTALL);
            appsApplicationGroup.getApplications().add(a1);
            final EApplication a2 = PersconfFactory.eINSTANCE.createEApplication();
            a2.setName("Appl2");
            a2.setInstallRule(EInstallRule.NEW_INSTALL);
            appsApplicationGroup.getApplications().add(a2);
            final EResource r1 = PersconfFactory.eINSTANCE.createEResource();
            r1.setName("Res1");
            a1.getResources().add(r1);
            final EConfiguration c1 = PersconfFactory.eINSTANCE.createEConfiguration();
            EDefaultData defaultData = PersconfFactory.eINSTANCE.createEDefaultData();
            c1.setFactoryDefault(defaultData);
            defaultData = PersconfFactory.eINSTANCE.createEDefaultData();
            c1.setConfigDefault(defaultData);
            r1.setConfiguration(c1);
            // ############## sample data ##############

            application.getContext().set(Resource.class, resource);
        }
    }

}
