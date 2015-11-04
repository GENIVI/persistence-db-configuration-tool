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

import org.eclipse.core.commands.Command;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.commands.ICommandService;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

    public ApplicationActionBarAdvisor(final IActionBarConfigurer configurer) {
        super(configurer);
    }

    @Override
    protected void makeActions(final IWorkbenchWindow window) {
        // final IWorkbenchAction saveAction = ActionFactory.SAVE.create(window);
        // this.register(saveAction);
    }

    @Override
    protected void fillMenuBar(final IMenuManager menuBar) {
        // we add the command service listener here as at this time the workbench has been definitely created
        final IEclipseContext eclipseContext = PlatformUI.getWorkbench().getService(IEclipseContext.class);
        final IEclipseContext activeLeaf = eclipseContext.getActiveLeaf();
        final ExecutionListener executionListener = activeLeaf.get(ExecutionListener.class);

        final ICommandService adapter = PlatformUI.getWorkbench().getAdapter(ICommandService.class);
        final Command command = adapter.getCommand(IWorkbenchCommandConstants.FILE_SAVE);
        command.addExecutionListener(executionListener);
    }

}
