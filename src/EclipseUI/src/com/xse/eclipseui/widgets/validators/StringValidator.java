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
package com.xse.eclipseui.widgets.validators;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.xse.eclipseui.Activator;

public class StringValidator extends AbstractBaseValidator<String> {

    private final int maxLength;

    public StringValidator(final boolean mandatory, final String message) {
        this(mandatory, Short.MAX_VALUE, message);
    }

    public StringValidator(final boolean mandatory, final int maxLength, final String message) {
        super(mandatory, message);

        this.maxLength = maxLength;
    }

    @Override
    public IStatus validate(final String value) {
        final IStatus validationStatus = super.validate(value);

        if (validationStatus.isOK()) {
            if (value.length() > this.maxLength) {
                return new Status(IStatus.ERROR, Activator.PLUGIN_ID, this.getMessage() + "(max. " + this.maxLength
                        + " characters are allowed)");
            } else {
                return Status.OK_STATUS;
            }
        }

        return validationStatus;
    }

}
