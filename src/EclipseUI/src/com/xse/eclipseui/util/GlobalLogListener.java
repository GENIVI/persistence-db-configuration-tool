/*******************************************************************************
 * Eclipse UI
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
package com.xse.eclipseui.util;

import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;

public class GlobalLogListener implements ILogListener {

    public static final int INTERNAL_ECLIPSE_LOG_ID = 78;

    @Override
    public void logging(final IStatus status, final String plugin) {
        if (status.getCode() != INTERNAL_ECLIPSE_LOG_ID) {
            Logger.logNonEclipse(plugin, Logger.getPriority(status.getSeverity()), status.getMessage(), status.getException());
        }
    }

}
