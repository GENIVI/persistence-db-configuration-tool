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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TextWidget extends AbstractBaseWidget<String> {

    public static class Builder {

        private final Composite parent;

        private int compositeStyle = SWT.NONE;
        private int controlStyle = SWT.SINGLE;
        private String caption;
        private String text = "";
        private int captionMargin = 5;

        public Builder(final Composite parent) {
            this.parent = parent;
        }

        public TextWidget build() {
            return new TextWidget(this);
        }

        public Builder setCompositeStyle(final int style) {
            this.compositeStyle = style;
            return this;
        }

        public Builder setControlStyle(final int style) {
            this.controlStyle = style;
            return this;
        }

        public Builder setCaption(final String caption) {
            this.caption = caption;
            return this;
        }

        public Builder setInitialText(final String text) {
            this.text = text;
            return this;
        }

        public Builder setCaptionMargin(final int margin) {
            this.captionMargin = margin;
            return this;
        }
    }

    private Text textControl;

    private final String caption;
    private final String initialText;

    private final int captionMargin;
    private final int controlStyle;

    private final List<ITextChangedListener> listenerList = new ArrayList<>();
    private boolean listenerActive = true;

    private TextWidget(final Builder builder) {
        super(builder.parent, builder.compositeStyle);
        this.caption = builder.caption;
        this.initialText = builder.text;
        this.captionMargin = builder.captionMargin;
        this.controlStyle = builder.controlStyle;

        this.createContent();
    }

    protected void createContent() {
        final GridLayout layout;
        if (this.caption != null) {
            layout = new GridLayout(2, false);
        } else {
            layout = new GridLayout(1, false);
        }
        layout.marginWidth = 2;
        this.setLayout(layout);

        this.setBackground(this.getParent().getBackground());
        // this.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_RED));

        if (this.caption != null) {
            final Label captionLabel = new Label(this, SWT.NONE);
            captionLabel.setBackground(this.getBackground());
            final GridData labelGridData = new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
            captionLabel.setLayoutData(labelGridData);
            captionLabel.setText(this.caption);
        }

        this.textControl = new Text(this, SWT.BORDER | this.controlStyle);
        this.textControl.setText(this.initialText);
        final GridData textGridData;
        if ((this.controlStyle & SWT.MULTI) != 0) {
            textGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        } else {
            textGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        }
        textGridData.widthHint = this.captionMargin;
        this.textControl.setLayoutData(textGridData);

        this.controlDecoration = new ControlDecoration(this.textControl, SWT.LEFT | SWT.TOP);

        this.textControl.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                TextWidget.this.isValid();
            }
        });

        this.textControl.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                if (TextWidget.this.listenerActive) {
                    for (final ITextChangedListener listener : TextWidget.this.listenerList) {
                        listener.textChanged(TextWidget.this, TextWidget.this.textControl.getText());
                    }
                }
            }
        });
    }

    /**
     * Adds a default {@link ModifyListener} to this widgets underlying {@link Text} control.
     *
     * @param listener
     */
    public void addModifyListener(final ModifyListener listener) {
        this.textControl.addModifyListener(listener);
    }

    public void removeModifyListener(final ModifyListener listener) {
        this.textControl.removeModifyListener(listener);
    }

    /**
     * Adds a special {@link ITextChangedListener} to this widgets underlying {@link Text} control
     * that will NOT be fired if the text of this widget gets changed via setText(...) of this
     * class.
     *
     * @param listener
     */
    public void addTextChangedListener(final ITextChangedListener listener) {
        this.listenerList.add(listener);
    }

    public void removeTextChangedListener(final ITextChangedListener listener) {
        this.listenerList.remove(listener);
    }

    public synchronized void setText(final String text) {
        this.listenerActive = false;
        if (text != null) {
            this.textControl.setText(text);
        } else {
            this.textControl.setText("");
        }
        this.listenerActive = true;
    }

    public String getText() {
        return this.textControl.getText();
    }

    public Text getTextControl() {
        return this.textControl;
    }

    @Override
    public boolean setFocus() {
        if (this.textControl != null) {
            return this.textControl.setFocus();
        }
        return false;
    }

    @Override
    // the set method is synchronized because of the listener handling, not because of any inconsistent states
    public String getValue() {
        return this.textControl.getText();
    }

}
