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
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.xse.eclipseui.widgets.validators.IValidator;

public class CaptionText extends Composite {

    private Text textControl;

    private final String caption;
    private final String initialText;

    private final int captionMargin;

    private IValidator<String> validator;

    private ControlDecoration controlDecoration;

    private final int containerMarginWidth;
    private final int containerMarginHeight;

    private Label captionLabel;

    private boolean validateWhileDisabled = false;

    public CaptionText(final Composite parent, final int style, final String caption) {
        this(parent, style, caption, "", 5, 2);
    }

    public CaptionText(final Composite parent, final int style, final String caption, final int captionMargin, final int containerMargin) {
        this(parent, style, caption, "", captionMargin, containerMargin);
    }

    public CaptionText(final Composite parent, final int style, final String caption, final String initialText, final int captionMargin,
            final int containerMarginWidth) {
        this(parent, style, caption, initialText, captionMargin, containerMarginWidth, 5);
    }

    public CaptionText(final Composite parent, final int style, final String caption, final String initialText, final int captionMargin,
            final int containerMarginWidth, final int containerMarginHeight) {
        super(parent, style);
        this.caption = caption;
        this.initialText = initialText;
        this.captionMargin = captionMargin;
        this.containerMarginWidth = containerMarginWidth;
        this.containerMarginHeight = containerMarginHeight;

        this.createContent();
    }

    protected void createContent() {
        final GridLayout layout = new GridLayout(2, false);
        layout.marginHeight = this.containerMarginHeight;
        layout.marginWidth = this.containerMarginWidth;
        this.setLayout(layout);

        this.captionLabel = new Label(this, SWT.NONE);
        final GridData labelGridData = new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
        this.captionLabel.setLayoutData(labelGridData);
        this.captionLabel.setText(this.caption);

        this.textControl = new Text(this, SWT.BORDER | SWT.SINGLE);
        this.textControl.setText(this.initialText);
        this.textControl.setToolTipText(this.caption);

        final GridData textGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        textGridData.horizontalIndent = this.captionMargin;
        this.textControl.setLayoutData(textGridData);

        this.controlDecoration = new ControlDecoration(this.textControl, SWT.LEFT | SWT.TOP);

        this.textControl.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                CaptionText.this.isValid();
            }
        });
    }

    @Override
    public void setEnabled(final boolean enabled) {
        this.textControl.setEnabled(enabled);
        this.captionLabel.setEnabled(enabled);
        if (enabled) {
            this.isValid();
        } else {
            this.controlDecoration.hide();
        }
        super.setEnabled(enabled);
    }

    public void addModifyListener(final ModifyListener listener) {
        this.textControl.addModifyListener(listener);
    }

    public void removeModifyListener(final ModifyListener listener) {
        this.textControl.removeModifyListener(listener);
    }

    public void setText(@Nullable String text) {
        if (null == text) {
            text = "";
        }
        this.textControl.setText(text);
    }

    public String getText() {
        return this.textControl.getText();
    }

    public Text getTextControl() {
        return this.textControl;
    }

    public boolean isValid() {
        if (this.controlDecoration != null) {
            if (CaptionText.this.validator != null) {
                if (this.isValidateWhileDisabled() || this.textControl.isEnabled()) {
                    final IStatus validationResult = CaptionText.this.validator.validate(this.textControl.getText());
                    if (Status.OK_STATUS != validationResult) {
                        this.controlDecoration.setDescriptionText(validationResult.getMessage());
                        final FieldDecoration fieldDecoration;
                        if (validationResult.getSeverity() == IStatus.WARNING) {
                            fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_WARNING);
                        } else if (validationResult.getSeverity() == IStatus.INFO) {
                            fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(
                                    FieldDecorationRegistry.DEC_INFORMATION);
                        } else {
                            fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
                        }
                        this.controlDecoration.setImage(fieldDecoration.getImage());
                        this.controlDecoration.show();
                        return false;
                    }
                }
            }
            this.controlDecoration.hide();
        }
        return true;
    }

    public void setValidator(final IValidator<String> validator) {
        this.validator = validator;
        this.textControl.setText(this.textControl.getText());
    }

    public boolean isValidateWhileDisabled() {
        return this.validateWhileDisabled;
    }

    public void setValidateWhileDisabled(final boolean validateWhileDisabled) {
        this.validateWhileDisabled = validateWhileDisabled;
    }

}
