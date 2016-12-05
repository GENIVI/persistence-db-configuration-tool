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
package com.xse.optstack.persconftool.ui.applications;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

import com.xse.eclipseui.table.AbstractBaseLabelProvider;
import com.xse.eclipseui.table.TableColumn;
import com.xse.eclipseui.tree.AbstractTree;
import com.xse.eclipseui.util.StringUtils;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EInstallRule;

public class ApplicationsTree extends AbstractTree {

    public ApplicationsTree(final Composite parent) {
        super(parent, SWT.BORDER | SWT.FULL_SELECTION);
    }

    @Override
    protected TableColumn[] getColumns() {
        final ComboBoxViewerCellEditor comboBoxViewerCellEditor = new ComboBoxViewerCellEditor(this.getTree(), SWT.READ_ONLY);
        comboBoxViewerCellEditor.setContentProvider(new IStructuredContentProvider() {
            @Override
            public void inputChanged(final Viewer viewerRef, final Object oldInput, final Object newInput) {
                // do nothing
            }

            @Override
            public void dispose() {
                // do nothing
            }

            @Override
            public Object[] getElements(final Object inputElement) {
                return EInstallRule.values();
            }
        });
        comboBoxViewerCellEditor.setLabelProvider(new AbstractBaseLabelProvider() {
            @Override
            public String getText(final Object element) {
                if (element instanceof EInstallRule) {
                    return ((EInstallRule) element).getName();
                }
                return "";
            }

            @Override
            public Image getImage(final Object element) {
                return null;
            }
        });
        comboBoxViewerCellEditor.setInput(new Object());

        final TableColumn installationRuleColumn = new TableColumn("Installation Rule", 140);
        installationRuleColumn.setEditingSupport(new EditingSupport(this.getViewer()) {
            @Override
            protected void setValue(final Object element, final Object value) {
                if ((element instanceof EApplication) && (value instanceof EInstallRule)) {
                    ((EApplication) element).setInstallRule((EInstallRule) value);
                }
            }

            @Override
            protected Object getValue(final Object element) {
                if (element instanceof EApplication) {
                    return ((EApplication) element).getInstallRule();
                }
                return null;
            }

            @Override
            protected CellEditor getCellEditor(final Object element) {
                return comboBoxViewerCellEditor;
            }

            @Override
            protected boolean canEdit(final Object element) {
                return element instanceof EApplication;
            }
        });

        final TextCellEditor textCellEditor = new TextCellEditor(this.getTree(), SWT.NONE);
        final TableColumn sizeColumn = new TableColumn("Size (kB)", 100);
        sizeColumn.setEditingSupport(new EditingSupport(this.getViewer()) {
            @Override
            protected void setValue(final Object element, final Object value) {
                if ((element instanceof EApplication) && (value instanceof String)) {
                    if (!StringUtils.isEmpty(value.toString())) {
                        try {
                            ((EApplication) element).setSize(Integer.valueOf(value.toString()));
                        } catch (final NumberFormatException e) {
                            // do nothing
                        }
                    } else {
                        ((EApplication) element).setSize(null);
                    }
                }
            }

            @Override
            protected Object getValue(final Object element) {
                if (element instanceof EApplication) {
                    final EApplication app = (EApplication) element;
                    return app.getSize() != null ? app.getSize().toString() : "";
                }
                return "";
            }

            @Override
            protected CellEditor getCellEditor(final Object element) {
                return textCellEditor;
            }

            @Override
            protected boolean canEdit(final Object element) {
                return element instanceof EApplication;
            }
        });

        final TableColumn userNameColumn = new TableColumn("User", 100);
        userNameColumn.setEditingSupport(new EditingSupport(this.getViewer()) {
            @Override
            protected void setValue(final Object element, final Object value) {
                if ((element instanceof EApplication) && (value instanceof String)) {
                    ((EApplication) element).setUserName(String.valueOf(value));
                }
            }

            @Override
            protected Object getValue(final Object element) {
                if (element instanceof EApplication) {
                    final EApplication app = (EApplication) element;
                	return app.getUserName();
                }
                return "?";
            }

            @Override
            protected CellEditor getCellEditor(final Object element) {
                return textCellEditor;
            }

            @Override
            protected boolean canEdit(final Object element) {
                return element instanceof EApplication;
            }
        });
        
        final TableColumn groupNameColumn = new TableColumn("Group", 100);
        groupNameColumn.setEditingSupport(new EditingSupport(this.getViewer()) {
            @Override
            protected void setValue(final Object element, final Object value) {
                if ((element instanceof EApplication) && (value instanceof String)) {
                	String stringVal = String.valueOf(value);
                    ((EApplication) element).setGroupName(stringVal);
                }
            }

            @Override
            protected Object getValue(final Object element) {
                if (element instanceof EApplication) {
                    final EApplication app = (EApplication) element;
                    String groupName = app.getGroupName();
                	
                	return groupName;
                }
                return "?";
            }

            @Override
            protected CellEditor getCellEditor(final Object element) {
                return textCellEditor;
            }

            @Override
            protected boolean canEdit(final Object element) {
                return element instanceof EApplication;
            }
        });
        
        final TableColumn userIdColumn = new TableColumn("User ID", 100);
        userIdColumn.setEditingSupport(new EditingSupport(this.getViewer()) {
        	@Override
            protected void setValue(final Object element, final Object value) {
                if ((element instanceof EApplication) && (value instanceof String)) {
                    if (!StringUtils.isEmpty(value.toString())) {
                        try {
                            ((EApplication) element).setUserId(Integer.valueOf(value.toString()));
                        } catch (final NumberFormatException e) {
                            // do nothing
                        }
                    } else {
                        ((EApplication) element).setUserId(null);
                    }
                }
            }

            @Override
            protected Object getValue(final Object element) {
                if (element instanceof EApplication) {
                    final EApplication app = (EApplication) element;
                    return app.getUserId() != null ? app.getUserId().toString() : "";
                }
                return "";
            }

            @Override
            protected CellEditor getCellEditor(final Object element) {
                return textCellEditor;
            }

            @Override
            protected boolean canEdit(final Object element) {
                return element instanceof EApplication;
            }
        });
        
        final TableColumn groupIdColumn = new TableColumn("Group ID", 100);
        groupIdColumn.setEditingSupport(new EditingSupport(this.getViewer()) {
        	@Override
            protected void setValue(final Object element, final Object value) {
                if ((element instanceof EApplication) && (value instanceof String)) {
                    if (!StringUtils.isEmpty(value.toString())) {
                        try {
                            ((EApplication) element).setGroupId(Integer.valueOf(value.toString()));
                        } catch (final NumberFormatException e) {
                            // do nothing
                        }
                    } else {
                        ((EApplication) element).setGroupId(null);
                    }
                }
            }

            @Override
            protected Object getValue(final Object element) {
                if (element instanceof EApplication) {
                    final EApplication app = (EApplication) element;
                    return app.getGroupId() != null ? app.getGroupId().toString() : "";
                }
                return "";
            }

            @Override
            protected CellEditor getCellEditor(final Object element) {
                return textCellEditor;
            }

            @Override
            protected boolean canEdit(final Object element) {
                return element instanceof EApplication;
            }
        });

        return new TableColumn[] { new TableColumn("Name", 220), installationRuleColumn, sizeColumn, userNameColumn, groupNameColumn, userIdColumn, groupIdColumn };
    }

}
