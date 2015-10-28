/*******************************************************************************
 * Persistence Configuration Tool UI
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
package com.xse.optstack.persconftool.ui.resources;

import java.util.Comparator;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

import com.xse.eclipseui.table.AbstractBaseLabelProvider;
import com.xse.eclipseui.table.AbstractTable;
import com.xse.eclipseui.table.TableColumn;
import com.xse.optstack.persconf.EInstallException;
import com.xse.optstack.persconf.EResource;

public class ResourcesTable extends AbstractTable {

    public ResourcesTable(final Composite parent) {
        super(parent, SWT.BORDER | SWT.FULL_SELECTION);

        this.getViewer().setComparator(new ViewerComparator(new Comparator<String>() {
            @Override
            public int compare(final String o1, final String o2) {
                return o1.compareTo(o2);
            }
        }));
    }

    @Override
    protected TableColumn[] getColumns() {
        final ComboBoxViewerCellEditor comboBoxViewerCellEditor = new ComboBoxViewerCellEditor(this.getTable(), SWT.READ_ONLY);
        comboBoxViewerCellEditor.setContentProvider(new IStructuredContentProvider() {
            @Override
            public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
            }

            @Override
            public void dispose() {
            }

            @Override
            public Object[] getElements(final Object inputElement) {
                final Object[] vals = new Object[EInstallException.values().length + 1];
                int i = 0;
                for (final EInstallException eInstallException : EInstallException.values()) {
                    vals[i++] = eInstallException;
                }
                vals[i] = StructuredSelection.EMPTY;
                return vals;
            }
        });
        comboBoxViewerCellEditor.setLabelProvider(new AbstractBaseLabelProvider() {
            @Override
            public String getText(final Object element) {
                if (element instanceof EInstallException) {
                    return ((EInstallException) element).getName();
                } else {
                    return "";
                }
            }

            @Override
            public Image getImage(final Object element) {
                return null;
            }
        });
        comboBoxViewerCellEditor.setInput(new Object());

        final TableColumn installationRuleColumn = new TableColumn("Installation Exception", 140);
        installationRuleColumn.setEditingSupport(new EditingSupport(this.getViewer()) {
            @Override
            protected void setValue(final Object element, final Object value) {
                if (element instanceof EResource) {
                    if (value instanceof EInstallException) {
                        ((EResource) element).setInstallException((EInstallException) value);
                    } else {
                        ((EResource) element).setInstallException(null);
                    }
                    this.getViewer().refresh(element);
                }
            }

            @Override
            protected Object getValue(final Object element) {
                if (element instanceof EResource) {
                    final EResource res = (EResource) element;
                    if (res.getInstallException() != null) {
                        return res.getInstallException();
                    } else {
                        return StructuredSelection.EMPTY;
                    }
                }
                return null;
            }

            @Override
            protected CellEditor getCellEditor(final Object element) {
                return comboBoxViewerCellEditor;
            }

            @Override
            protected boolean canEdit(final Object element) {
                return element instanceof EResource;
            }
        });

        return new TableColumn[] { new TableColumn("Name", 180), installationRuleColumn };
    }

}
