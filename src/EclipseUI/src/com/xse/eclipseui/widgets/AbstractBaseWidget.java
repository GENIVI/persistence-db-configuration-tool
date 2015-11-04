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
package com.xse.eclipseui.widgets;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.widgets.Composite;

import com.xse.eclipseui.widgets.validators.IValidator;

public abstract class AbstractBaseWidget<T> extends Composite {

    protected IValidator<T> validator;

    protected ControlDecoration controlDecoration;

    public AbstractBaseWidget(final Composite parent, final int style) {
        super(parent, style);
    }

    public abstract T getValue();

    public void setValidator(final IValidator<T> validator) {
        this.validator = validator;
        this.isValid(); // determine initial validation state
    }

    public boolean isValid() {
        if (this.controlDecoration != null) {
            if (this.validator != null) {
                final IStatus validationResult = this.validator.validate(this.getValue());
                if (!this.handleValidationResult(validationResult)) {
                    return false;
                }
            }
            this.controlDecoration.hide();
        }
        return true;
    }

    protected boolean handleValidationResult(final IStatus status) {
        if (Status.OK_STATUS != status) {
            this.controlDecoration.setDescriptionText(status.getMessage());

            final FieldDecoration fieldDecoration;
            if (status.getSeverity() == IStatus.WARNING) {
                fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_WARNING);
            } else if (status.getSeverity() == IStatus.INFO) {
                fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION);
            } else {
                fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
            }

            this.controlDecoration.setImage(fieldDecoration.getImage());
            this.controlDecoration.show();

            return false;
        }

        return true;
    }
}
