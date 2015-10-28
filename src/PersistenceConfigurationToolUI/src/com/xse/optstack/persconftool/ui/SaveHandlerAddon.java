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

import org.eclipse.e4.core.contexts.IEclipseContext;

/**
 * Hack class to get our {@link ExecutionListener} into the game in order to fix the Ctrl+S key-bingind issues in mixed
 * e3/e4 applications.
 *
 * @author philipb
 *
 */
public class SaveHandlerAddon {

    @Inject
    public void setExecutionListener(final ExecutionListener executionListener, final IEclipseContext eclipseContext) {
        // we can also get an IEclipseContext this way (if the workbench would have already been created at this time)
        // final IEclipseContext eclipseContext = (IEclipseContext) PlatformUI.getWorkbench().getService(IEclipseContext.class);

        // this would be the way to manually inject an object into the context
        // ContextInjectionFactory.inject(ExecutionListener.class, activeLeaf);
        // final ExecutionListener executionListener = new ExecutionListener();
        // activeLeaf.set(ExecutionListener.class, executionListener);

        eclipseContext.set(ExecutionListener.class, executionListener);
    }

}
