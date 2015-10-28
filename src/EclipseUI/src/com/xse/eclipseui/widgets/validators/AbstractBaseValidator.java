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
import org.eclipse.jface.dialogs.IInputValidator;

import com.xse.eclipseui.Activator;

/*
 * TODO: remove abstract modifier and rename class as it does not need to be abstract!
 */
public abstract class AbstractBaseValidator<T> implements IValidator<T>, IInputValidator {

    private boolean mandatory;
    private final String message;

    public AbstractBaseValidator(final boolean mandatory, final String message) {
        this.mandatory = mandatory;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isMandatory() {
        return this.mandatory;
    }

    public void setMandatory(final boolean mandatory) {
        this.mandatory = mandatory;
    }

    /**
     * Base validate method that just checks availability of a value regarding the mandatory
     * attribute. Returns Status.OK_STATUS in case a value is available.
     *
     * @param value
     * @return
     */
    public IStatus validate(final String value) {
        if (this.isMandatory()) {
            if ((value == null) || (value.length() == 0)) {
                return new Status(IStatus.WARNING, Activator.PLUGIN_ID, this.getMessage());
            }
        }

        return Status.OK_STATUS;
    }

    @Override
    public String isValid(final String newText) {
        final IStatus status = this.validate(newText);
        if (!status.isOK()) {
            return status.getMessage();
        }
        return null;
    }

}
