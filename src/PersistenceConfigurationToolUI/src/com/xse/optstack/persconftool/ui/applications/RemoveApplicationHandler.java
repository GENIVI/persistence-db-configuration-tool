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
package com.xse.optstack.persconftool.ui.applications;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EGroupType;

/**
 * Handler class for removing an {@link EApplication} from the configuration.
 *
 * @author philipb
 *
 */
public class RemoveApplicationHandler {

    @Execute
    public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EApplication activeApplication) {
        if (activeApplication != null) {
            EcoreUtil.delete(activeApplication);
        }
    }

    @CanExecute
    public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EApplication activeApplication) {
        // the public application cannot be removed by definition!
        return (activeApplication != null) && (activeApplication.getGroup().getType() != EGroupType.PUBLIC);
    }

}
