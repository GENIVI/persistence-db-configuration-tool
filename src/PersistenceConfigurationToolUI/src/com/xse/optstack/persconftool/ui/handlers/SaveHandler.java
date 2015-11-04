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

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

/**
 * Handler class for triggering a configuration export run.
 *
 * @author philipb
 *
 */
public class SaveHandler {

    @CanExecute
    public boolean canExecute(final EPartService partService) {
        if (partService != null) {
            // check if there is any dirty part
            return !partService.getDirtyParts().isEmpty();
        }
        return false;
    }

    @Execute
    public void execute(final EPartService partService) {
        partService.saveAll(false);
    }

}
