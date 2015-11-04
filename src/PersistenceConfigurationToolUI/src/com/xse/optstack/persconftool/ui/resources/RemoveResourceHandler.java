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

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.xse.optstack.persconf.EResource;

/**
 * Handler class for removing an {@link EResource} from the configuration.
 *
 * @author philipb
 *
 */
public class RemoveResourceHandler {

    @Execute
    public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EResource activeResource) {
        if (activeResource != null) {
            EcoreUtil.delete(activeResource);
        }
    }

    @CanExecute
    public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EResource activeResource) {
        return (activeResource != null);
    }

}
