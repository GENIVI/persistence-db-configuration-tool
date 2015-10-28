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

public class IntegerValidator extends AbstractBaseValidator<String> {

    private final int lowerBound;
    private final int upperBound;

    public IntegerValidator(final String message) {
        this(false, message);
    }

    public IntegerValidator(final boolean mandatory, final String message) {
        this(0, Integer.MAX_VALUE, mandatory, message);
    }

    public IntegerValidator(final int lowerBound, final int upperBound, final boolean mandatory, final String message) {
        super(mandatory, message);

        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public IStatus validate(final String value) {
        final IStatus validationStatus = super.validate(value);

        if (validationStatus.isOK()) {
            if ((value != null) && (value.length() > 0)) {
                try {
                    final int parsedValue = Integer.parseInt(value);
                    if ((parsedValue >= this.lowerBound) && (parsedValue <= this.upperBound)) {
                        return Status.OK_STATUS;
                    } else {
                        return new Status(IStatus.WARNING, Activator.PLUGIN_ID, this.getMessage() + " (valid range: " + this.lowerBound
                                + " - " + this.upperBound + ")");
                    }
                } catch (final NumberFormatException e) {
                    return new Status(IStatus.ERROR, Activator.PLUGIN_ID, this.getMessage() + " (" + e.getMessage() + ")");
                }
            }
        }

        return validationStatus;
    }

}
