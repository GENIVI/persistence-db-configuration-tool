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
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

/**
 * Handler class that shows/opens the error log part.
 *
 * @author philipb
 *
 */
public class ShowErrorLogHandler {

    @Execute
    public void execute(final EPartService partService) {
        final MPart findPart = partService.findPart("org.eclipse.pde.runtime.LogView");
        if (findPart != null) {
            partService.showPart(findPart, PartState.ACTIVATE);
        }
    }

}
