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
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.xse.eclipseui.SelectionUtil;

public class ComboBoxWidget<T> extends AbstractBaseWidget<T> {

    private class ComboBoxLabelProvider implements ILabelProvider {

        @Override
        public void addListener(final ILabelProviderListener listener) {
        }

        @Override
        public void dispose() {
        }

        @Override
        public boolean isLabelProperty(final Object element, final String property) {
            return false;
        }

        @Override
        public void removeListener(final ILabelProviderListener listener) {
        }

        @Override
        public Image getImage(final Object element) {
            return null;
        }

        @Override
        public String getText(final Object element) {
            if (element != null) {
                return element.toString();
            }
            return "";
        }

    }

    private class ComboBoxContentProvider implements IStructuredContentProvider {

        private Collection<T> input;

        @Override
        public void dispose() {
        }

        @SuppressWarnings("unchecked")
        @Override
        public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
            if (newInput != oldInput) {
                if (newInput instanceof Collection) {
                    this.input = (Collection<T>) newInput;
                }
            }
        }

        @Override
        public Object[] getElements(final Object inputElement) {
            if (this.input != null) {
                return this.input.toArray();
            }
            return new Object[0];
        }
    }

    protected ComboViewer comboControl;

    private String caption;
    private final int captionMargin;

    private final int minComboWidth;

    private ComboBoxContentProvider contentProvider;

    private final List<IComboSelectionChangedListener<T>> listenerList = new ArrayList<>();
    private boolean listenerActive = true;

    /* TODO: allow creation of ComboBoxes without passing an input list in the constructor
     * -> possible solution: pass one instance of the type to allow Java to infer the type parameter type */
    public ComboBoxWidget(final Composite parent, final int style, final Collection<T> inputList) {
        this(parent, style, null, inputList);
    }

    public ComboBoxWidget(final Composite parent, final int style, final String caption, final Collection<T> inputList) {
        this(parent, style, caption, 2, 8, inputList);
    }

    public ComboBoxWidget(final Composite parent, final int style, final String caption, final int captionMargin, final int minComboWidth,
            final Collection<T> inputList) {
        super(parent, style);

        this.caption = caption;
        this.captionMargin = captionMargin;

        this.minComboWidth = minComboWidth;

        this.contentProvider = new ComboBoxContentProvider();

        this.createContent();

        this.setInput(inputList);
    }

    @SuppressWarnings("unchecked")
    public Collection<T> getInput() {
        return (Collection<T>) this.comboControl.getInput();
    }

    public void setInput(final Collection<T> inputList) {
        this.comboControl.setInput(inputList);
    }

    public void setContentList(final Collection<T> content) {
        this.comboControl.setInput(content);
    }

    protected ComboViewer createViewer() {
        return new ComboViewer(this, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
    }

    protected void createContent() {
        final GridLayout layout;
        if (this.caption != null) {
            layout = new GridLayout(2, false);
        } else {
            layout = new GridLayout(1, false);
        }
        layout.marginWidth = 0;
        layout.marginHeight = 4;
        this.setLayout(layout);

        this.setBackground(this.getParent().getBackground());

        if (this.caption != null) {
            final Label captionLabel = new Label(this, SWT.NONE);
            final GridData labelGridData = new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
            labelGridData.widthHint = this.captionMargin;
            captionLabel.setLayoutData(labelGridData);
            captionLabel.setText(this.caption);
        }

        this.comboControl = this.createViewer();

        // this.comboControl.getCombo().setText(this.caption);
        final GridData comboGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        comboGridData.horizontalIndent = 2; // somebody needs 6 here! -> make configurable!
        comboGridData.minimumWidth = this.minComboWidth;
        this.comboControl.getCombo().setLayoutData(comboGridData);

        this.comboControl.setLabelProvider(new ComboBoxLabelProvider());
        this.comboControl.setContentProvider(this.contentProvider);

        this.controlDecoration = new ControlDecoration(this.comboControl.getCombo(), SWT.LEFT | SWT.TOP);

        this.comboControl.addPostSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(final SelectionChangedEvent event) {
                ComboBoxWidget.this.isValid();
            }
        });

        this.comboControl.addPostSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(final SelectionChangedEvent event) {
                if (ComboBoxWidget.this.listenerActive) {
                    for (final IComboSelectionChangedListener<T> listener : ComboBoxWidget.this.listenerList) {
                        listener.selectionChanged(ComboBoxWidget.this, ComboBoxWidget.this.getValue());
                    }
                }
            }
        });
    }

    public void setLabelProvider(final ILabelProvider labelProvider) {
        this.comboControl.setLabelProvider(labelProvider);
    }

    /**
     * Adds a special {@link IComboSelectionChangedListener} to this control that will NOT be fired
     * if the text of this widget gets changed via setText(...) of this class.
     *
     * @param listener
     */
    public void addComboSelectionChangedListener(final IComboSelectionChangedListener<T> listener) {
        this.listenerList.add(listener);
    }

    public void removeComboSelectionChangedListener(final IComboSelectionChangedListener<T> listener) {
        this.listenerList.remove(listener);
    }

    public void addSelectionChangedListener(final ISelectionChangedListener listener) {
        this.comboControl.addSelectionChangedListener(listener);
    }

    public void removeSelectionChangedListener(final ISelectionChangedListener listener) {
        this.comboControl.removeSelectionChangedListener(listener);
    }

    // the set method is synchronized because of the listener handling, not because of any inconsistent states
    public synchronized void setValue(final T value) {
        this.listenerActive = false;
        if (value != null) {
            this.comboControl.setSelection(new StructuredSelection(value));
        } else {
            this.comboControl.setSelection(null);
        }
        this.listenerActive = true;
    }

    // because nothing else can be contained in the Combo
    @SuppressWarnings("unchecked")
    @Override
    // the set method is synchronized because of the listener handling, not because of any inconsistent states
    public T getValue() {
        return (T) SelectionUtil.getFirstElement(this.comboControl.getSelection());
    }

    public Combo getComboControl() {
        return this.comboControl.getCombo();
    }

    public ComboViewer getViewer() {
        return this.comboControl;
    }

}
