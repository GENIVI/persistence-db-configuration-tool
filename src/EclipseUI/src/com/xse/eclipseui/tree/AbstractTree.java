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
package com.xse.eclipseui.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILazyTreeContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import com.xse.eclipseui.table.ISortingHandler;

/**
 * Base wrapper implementation for a JFace tree viewer.
 *
 * @author pberg
 *
 */
public abstract class AbstractTree {

    public static final String ISINFILTER_KEY = "isInFilter";

    protected abstract com.xse.eclipseui.table.TableColumn[] getColumns();

    protected final Tree tree;
    protected final TreeViewer viewer;

    protected ITreeContentProvider contentProvider;
    protected ILazyTreeContentProvider lazyContentProvider;

    private ISortingHandler sortingHandler = null;
    private final List<SelectionAdapter> selectionAdapterList = new ArrayList<>();

    private final Map<Integer, TreeViewerColumn> treeViewerColumnMap = new HashMap<>();

    public AbstractTree(final Composite parent) {
        this(parent, SWT.SINGLE);
    }

    public AbstractTree(final Composite parent, final int style) {
        this(parent, null, style);
    }

    public AbstractTree(final Tree tree) {
        this(null, tree, SWT.NONE);
    }

    /**
     *
     * @param parent
     * @param table
     * @param style
     *            will only be regarded if tree is null
     */
    private AbstractTree(final Composite parent, final Tree tree, final int style) {
        if (null != tree) {
            this.tree = tree;
        } else {
            this.tree = this.createTree(parent, style);
        }

        if (((style & SWT.CHECK) != 0) && ((style & SWT.VIRTUAL) == 0)) {
            this.viewer = new CheckboxTreeViewer(this.tree);
        } else {
            this.viewer = new TreeViewer(this.tree);
        }

        this.tree.setHeaderVisible(true);
        this.tree.setLinesVisible(true);

        this.refreshColumns();
    }

    public boolean isCheckboxTree() {
        return (this.tree.getStyle() & SWT.CHECK) != 0;
    }

    public void refreshColumns() {
        this.tree.setRedraw(false);
        this.removeAllColumns();

        int cell = 0;
        boolean hasTooltip = false;
        for (final com.xse.eclipseui.table.TableColumn column : this.getColumns()) {
            final TreeColumn nameColumn = new TreeColumn(this.tree, column.getStyle());

            if (column.isProvideTooltip() || column.hasEditingSupport()) {
                hasTooltip = column.isProvideTooltip();
                final TreeViewerColumn treeViewerColumn = new TreeViewerColumn(this.viewer, nameColumn);
                this.treeViewerColumnMap.put(Integer.valueOf(cell++), treeViewerColumn);

                if (column.hasEditingSupport()) {
                    treeViewerColumn.setEditingSupport(column.getEditingSupport());
                }
            }

            nameColumn.setText(column.getTitle());
            nameColumn.setWidth(column.getWidth());
            nameColumn.setMoveable(column.isMoveable());
            nameColumn.setData(ISINFILTER_KEY, Boolean.valueOf(column.isIncludeInFilter()));
        }

        if (hasTooltip) {
            ColumnViewerToolTipSupport.enableFor(this.viewer, ToolTip.NO_RECREATE);
        }

        this.tree.setRedraw(true);

        this.addSelectionAdapter();
    }

    private void removeAllColumns() {
        this.resetSelectionAdapter();
        this.treeViewerColumnMap.clear();
        final int columnCount = this.tree.getColumnCount();
        for (int i = 0; i < columnCount; ++i) {
            final TreeColumn column = this.tree.getColumn(0);
            if (column != null) {
                this.tree.setRedraw(false);
                column.dispose();
                this.tree.setRedraw(true);
            }
        }
    }

    /**
     * Might be overwritten by subclasses.
     *
     * @param parent
     * @param style
     * @return
     */
    protected Tree createTree(final Composite parent, final int style) {
        return new Tree(parent, style);
    }

    public void refresh() {
        this.viewer.refresh();
    }

    public void setContentProvider(final ITreeContentProvider provider) {
        this.setInternalContentProvider(provider);
    }

    protected void setInternalContentProvider(final ITreeContentProvider provider) {
        this.contentProvider = provider;
        this.viewer.setContentProvider(provider);
    }

    public void setContentProvider(final ILazyTreeContentProvider provider) {
        this.setInternalContentProvider(provider);
    }

    protected void setInternalContentProvider(final ILazyTreeContentProvider provider) {
        this.lazyContentProvider = provider;
        this.viewer.setContentProvider(provider);
        // if we have a lazy tree we need to activate hashlookup, otherwise JFace does some weird things
        this.viewer.setUseHashlookup(true);
    }

    public ITreeContentProvider getContentProvider() {
        return this.contentProvider;
    }

    public ILazyTreeContentProvider getLazyContentProvider() {
        return this.lazyContentProvider;
    }

    public void setLabelProvider(final IBaseLabelProvider labelProvider) {
        this.viewer.setLabelProvider(labelProvider);
    }

    public void setLabelProvider(final CellLabelProvider labelProvider) {
        this.setLabelProvider((IBaseLabelProvider) labelProvider);
        for (final TreeViewerColumn c : this.treeViewerColumnMap.values()) {
            c.setLabelProvider(labelProvider);
        }
    }

    public IBaseLabelProvider getLabelProvider() {
        return this.viewer.getLabelProvider();
    }

    public TreeViewer getViewer() {
        return this.viewer;
    }

    public Tree getTree() {
        return this.tree;
    }

    public void setSortingHandler(final ISortingHandler handler) {
        this.sortingHandler = handler;
    }

    public ISortingHandler getSortingHandler() {
        return this.sortingHandler;
    }

    private void addSelectionAdapter() {
        int i = 0;
        for (final TreeColumn column1 : this.getTree().getColumns()) {
            this.selectionAdapterList.add(this.getSelectionAdapter(i));
            int n = 0;
            for (final SelectionAdapter sa : this.selectionAdapterList) {
                if (i == n) {
                    column1.addSelectionListener(sa);
                }
                n++;
            }
            i++;
        }
    }

    private void resetSelectionAdapter() {
        int i = 0;
        for (final TreeColumn column1 : this.getTree().getColumns()) {
            int n = 0;
            for (final SelectionAdapter sa : this.selectionAdapterList) {
                if (i == n) {
                    column1.removeSelectionListener(sa);
                    break;
                }
                n++;
            }
            i++;
        }
        this.selectionAdapterList.clear();
    }

    private SelectionAdapter getSelectionAdapter(final int ptColumn) {
        final SelectionAdapter selectionAdapter = new SelectionAdapter() {
            private int direction = SWT.UP;

            @Override
            public void widgetSelected(final SelectionEvent e) {
                if (AbstractTree.this.tree.getSortDirection() == SWT.NONE) {
                    this.direction = SWT.DOWN;
                } else {
                    if (this.direction == SWT.UP) {
                        this.direction = SWT.DOWN;
                    } else {
                        this.direction = SWT.UP;
                    }
                }

                if (AbstractTree.this.sortingHandler != null) {
                    AbstractTree.this.sortingHandler.setSortDirection(this.direction);
                    AbstractTree.this.sortingHandler.sort(ptColumn, true);
                }
            }
        };
        return selectionAdapter;
    }

}
