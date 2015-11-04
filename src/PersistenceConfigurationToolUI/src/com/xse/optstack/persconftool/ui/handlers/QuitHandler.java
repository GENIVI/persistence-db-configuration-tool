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
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class QuitHandler {

    @Execute
    public void execute(final IWorkbench workbench, final Shell shell, final EPartService partService) {
        boolean quit = true;
        if(!partService.getDirtyParts().isEmpty()) {
            quit = MessageDialog.openConfirm(shell, "Exit",
                    "The active configuration contains unsaved changes. Are you sure you want to exit the application?");
        }

        if (quit) {
            workbench.close();
        }
    }

}
