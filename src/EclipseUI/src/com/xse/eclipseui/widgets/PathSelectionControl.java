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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;

import com.xse.eclipseui.util.StringUtils;
import com.xse.eclipseui.widgets.validators.IValidator;

public class PathSelectionControl extends Composite {

    private CaptionText captionTextControl;
    private Button browseButton;

    private final Set<IPathChangedListener> pathChangedListeners = new HashSet<>();

    private final SelectionAdapter fileSelectionAdapter = new SelectionAdapter() {

        @Override
        public void widgetSelected(final SelectionEvent e) {
            final FileDialog dialog = new FileDialog(PathSelectionControl.this.getShell(), SWT.SHEET
                    | PathSelectionControl.this.controlStyle);
            if ((PathSelectionControl.this.controlStyle & SWT.SAVE) != 0) {
                dialog.setOverwrite(true);
            }
            dialog.setFilterExtensions(PathSelectionControl.this.filterExtensions);
            dialog.setFilterNames(PathSelectionControl.this.filterNames);
            if (PathSelectionControl.this.getSelectedPath() != null) {
                dialog.setFilterPath(PathSelectionControl.this.getSelectedPath());
            }
            final String selectedValue = dialog.open();
            if (selectedValue != null) {
                PathSelectionControl.this.getTextControl().setText(selectedValue);
            }
        }

    };

    private final SelectionAdapter folderSelectionAdapter = new SelectionAdapter() {

        @Override
        public void widgetSelected(final SelectionEvent e) {
            final DirectoryDialog dialog = new DirectoryDialog(PathSelectionControl.this.getShell(), SWT.SHEET
                    | PathSelectionControl.this.controlStyle);
            if (!StringUtils.isEmpty(PathSelectionControl.this.getTextControl().getText())) {
                dialog.setFilterPath(PathSelectionControl.this.getSelectedPath());
            }
            final String selectedValue = dialog.open();
            if (selectedValue != null) {
                PathSelectionControl.this.getTextControl().setText(selectedValue);
            }
        }

    };
    private String[] filterNames;
    private String[] filterExtensions;
    private int controlStyle;

    private String selectedPath = "";

    /**
     * Creates a folder control!
     *
     * @param parent
     * @param style
     * @param caption
     * @param initialPath
     */
    public PathSelectionControl(final Composite parent, final int style, final String caption, final String initialPath) {
        this(parent, style, caption, initialPath, 5);
    }

    /**
     * Creates a folder control!
     *
     * @param parent
     * @param style
     * @param caption
     * @param initialPath
     * @param captionMargin
     */
    public PathSelectionControl(final Composite parent, final int style, final String caption, final String initialPath,
            final int captionMargin) {
        super(parent, style);

        this.createControl(caption, captionMargin, initialPath, this.folderSelectionAdapter);
    }

    /**
     * Creates a file control!
     *
     * @param parent
     * @param style
     * @param caption
     * @param initialPath
     * @param captionMargin
     * @param controlStyle
     */
    public PathSelectionControl(final Composite parent, final int style, final String caption, final String initialPath,
            final int captionMargin, final int controlStyle) {
        this(parent, style, caption, initialPath, captionMargin, controlStyle, new String[] { "All files" }, new String[] { "*" });
    }

    /**
     * Creates a file control!
     *
     * @param parent
     * @param style
     * @param caption
     * @param initialPath
     * @param captionMargin
     * @param controlStyle
     */
    public PathSelectionControl(final Composite parent, final int style, final String caption, final String initialPath,
            final int captionMargin, final int controlStyle, final String[] filterNames, final String[] filterExtensions) {
        super(parent, style);
        this.controlStyle = controlStyle;
        if (filterNames != null) {
            this.filterNames = Arrays.copyOf(filterNames, filterNames.length);
        }
        if (filterExtensions != null) {
            this.filterExtensions = Arrays.copyOf(filterExtensions, filterExtensions.length);
        }

        this.createControl(caption, captionMargin, initialPath, this.fileSelectionAdapter);
    }

    private void createControl(final String caption, final int captionMargin, final String initialPath,
            final SelectionListener selectionListener) {
        final GridLayout layout = new GridLayout(2, false);
        layout.marginWidth = 2;
        layout.marginHeight = 0;
        this.setLayout(layout);

        this.captionTextControl = new CaptionText(this, SWT.NONE, caption, captionMargin, 0);
        this.captionTextControl.setText(initialPath);
        final GridData labelGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        this.captionTextControl.setLayoutData(labelGridData);

        this.browseButton = new Button(this, SWT.PUSH);
        this.browseButton.setText("Browse");
        final GridData buttonGridData = new GridData(SWT.END, SWT.CENTER, false, false);
        this.browseButton.setLayoutData(buttonGridData);

        this.browseButton.addSelectionListener(selectionListener);

        this.captionTextControl.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                final String oldPath = PathSelectionControl.this.selectedPath;
                PathSelectionControl.this.selectedPath = PathSelectionControl.this.captionTextControl.getText();
                PathSelectionControl.this.firePathChangedEvent(oldPath, PathSelectionControl.this.selectedPath);
            }
        });
        this.captionTextControl.setValidateWhileDisabled(true);
    }

    @Override
    public void setEnabled(final boolean enabled) {
        this.browseButton.setEnabled(enabled);
        this.captionTextControl.setEnabled(enabled);
        super.setEnabled(enabled);
    }

    public void setPath(@Nullable String path) {
        if (null == path) {
            path = "";
        }
        this.getTextControl().setText(path);
    }

    public String getSelectedPath() {
        return this.getTextControl().getText();
    }

    private void firePathChangedEvent(final String oldPath, final String newPath) {
        for (final IPathChangedListener listener : this.pathChangedListeners) {
            listener.pathChanged(oldPath, newPath);
        }
    }

    public void addPathChangedListener(final IPathChangedListener listener) {
        this.pathChangedListeners.add(listener);
    }

    public void removePathChangedListener(final IPathChangedListener listener) {
        this.pathChangedListeners.remove(listener);
    }

    public void setValidator(final IValidator<String> validator) {
        this.captionTextControl.setValidator(validator);
    }

    public CaptionText getTextControl() {
        return this.captionTextControl;
    }

    public boolean isValid() {
        return this.captionTextControl.isValid();
    }

}
