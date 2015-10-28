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

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

/**
 * Dirty Hack class to fix the issue of a missing main menu if the application is started a 2nd time without
 * -clearPersistedState.
 *
 * @see http://www.eclipse.org/forums/index.php/mv/msg/446433/997140/#msg_997140
 * @author philipb
 *
 */
public class ForceMainMenuProcessor {

    @Inject
    MApplication application;

    @Inject
    EModelService modelService;

    @Execute
    public void execute() {
        final MTrimmedWindow window = (MTrimmedWindow) this.modelService.find("com.xse.optstack.persconftool.ui.window.main",
                this.application);
        if ((window == null) || (window.getMainMenu() != null)) {
            return;
        }

        final MMenu mainMenu = this.modelService.createModelElement(MMenu.class);
        mainMenu.setElementId("org.eclipse.ui.main.menu");
        window.setMainMenu(mainMenu);
    }

}
