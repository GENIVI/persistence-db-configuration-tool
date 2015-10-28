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

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IExecutionListener;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import com.xse.optstack.persconftool.ui.handlers.SaveHandler;

/**
 * We need this ExecutionListener due to the hybrid approach of this application (i.e. it's a mixed
 * e3/e4 application) -> the e3 part overwrites the Ctrl+S keybinding in the application.xmi and
 * therefore our e4 SaveHandler won't be called when pressing Ctrl+S. This Listener fixes this.
 *
 * @author philipb
 * @see http
 *      ://eclipsesource.com/blogs/tutorials/eclipse-4-e4-tutorial-soft-migration-from-3-x-to-eclipse
 *      -4-e4/
 */
@Creatable
public class ExecutionListener implements IExecutionListener {

    private EPartService partService;

    @Inject
    public void setPartService(final EPartService partService) {
        this.partService = partService;
    }

    @Override
    public void notHandled(final String commandId, final NotHandledException exception) {
        // do nothing
    }

    @Override
    public void postExecuteFailure(final String commandId, final ExecutionException exception) {
        // do nothing
    }

    @Override
    public void postExecuteSuccess(final String commandId, final Object returnValue) {
        // do nothing
    }

    @Override
    public void preExecute(final String commandId, final ExecutionEvent event) {
        final SaveHandler saveHandler = new SaveHandler();
        if (saveHandler.canExecute(this.partService)) {
            saveHandler.execute(this.partService);
        }
    }

}
