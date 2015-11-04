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
package com.xse.eclipseui;

public class SettingsException extends Exception {

    private static final long serialVersionUID = -4948923625832878645L;

    public SettingsException(final String message) {
        super(message);
    }

    public SettingsException(final Throwable cause) {
        super(cause);
    }

    public SettingsException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
