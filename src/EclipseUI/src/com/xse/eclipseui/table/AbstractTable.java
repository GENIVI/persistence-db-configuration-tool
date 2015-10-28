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
package com.xse.eclipseui.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

/**
 * Base implementation of a generic table viewer.
 *
 * @author pberg
 *
 */
public abstract class AbstractTable {

    private final class DisposeListenerImplementation implements DisposeListener {

        private final Table listenerTable;

        private DisposeListenerImplementation(final Table table) {
            this.listenerTable = table;
        }

        @Override
        public void widgetDisposed(final DisposeEvent e) {
            this.listenerTable.removeDisposeListener(this);
            AbstractTable.this.dispose();
        }
    }

    public enum CheckedState {
        CHECKED, UNCHECKED, INDETERMINATE;
    }

    private final Table table;
    private final TableViewer viewer;

    private final Map<Integer, TableViewerColumn> tableViewerColumnMap = new HashMap<>();

    private final List<SelectionAdapter> selectionAdapterList = new ArrayList<>();

    private ISortingHandler sortingHandler;
    private CellLabelProvider cellLabelProvider;

    protected final Set<Object> checkedItems = new HashSet<>();
    protected final Set<Object> grayedItems = new HashSet<>();

    private IExtendedLazyTableContentProvider extendedContentProvider;

    private final List<IInputChangedListener> inputChangedListeners = new ArrayList<>();

    public AbstractTable(final Composite parent, final int style) {
        this(null, parent, style);
    }

    public AbstractTable(final Table table) {
        this(table, null, SWT.NONE);
    }

    private AbstractTable(final Table table, final Composite parent, final int style) {
        if (null == table) {
            this.table = this.createTable(parent, style);
        } else {
            this.table = table;
        }

        if ((style & SWT.CHECK) != 0) {
            this.viewer = new CheckboxTableViewer(this.table);
            ((CheckboxTableViewer) this.viewer).setCheckStateProvider(new ICheckStateProvider() {
                @Override
                public boolean isGrayed(final Object element) {
                    return AbstractTable.this.grayedItems.contains(element);
                }

                @Override
                public boolean isChecked(final Object element) {
                    return AbstractTable.this.checkedItems.contains(element);
                }
            });
        } else {
            this.viewer = new TableViewer(this.table);
        }

        this.table.setHeaderVisible(true);
        this.table.setLinesVisible(true);

        if (this.hasToolTipColumns()) {
            ColumnViewerToolTipSupport.enableFor(this.viewer, ToolTip.NO_RECREATE);
        }

        this.refreshColumns();

        if (this.table.getHorizontalBar() != null) {
            this.table.getHorizontalBar().setVisible(false);
            this.table.pack();
            this.table.getParent().layout();
        }

        this.table.addDisposeListener(new DisposeListenerImplementation(this.table));
    }

    public void refreshColumns() {
        this.getTable().setRedraw(false);
        this.removeAllColumns();
        int cell = 0;
        for (final com.xse.eclipseui.table.TableColumn column : this.getColumns()) {
            final TableColumn nameColumn = new TableColumn(this.table, column.getStyle());

            if (column.isProvideTooltip() || column.hasEditingSupport()) {
                final TableViewerColumn tableViewerColumn = new TableViewerColumn(this.viewer, nameColumn);
                this.tableViewerColumnMap.put(Integer.valueOf(cell), tableViewerColumn);

                if (column.hasEditingSupport()) {
                    tableViewerColumn.setEditingSupport(column.getEditingSupport());
                }

            }
            nameColumn.setText(column.getTitle());
            nameColumn.setWidth(column.getWidth());
            nameColumn.setMoveable(column.isMoveable());
            if (column.getHeaderTooltip() != null) {
                nameColumn.setToolTipText(column.getHeaderTooltip());
            }

            cell++;
        }

        this.getTable().setRedraw(true);
        this.addSelectionAdapter();
    }

    private void removeAllColumns() {
        this.resetSelectionAdapter();
        this.tableViewerColumnMap.clear();
        final int columnCount = this.getTable().getColumnCount();
        for (int i = 0; i < columnCount; ++i) {
            final TableColumn column = this.getTable().getColumn(0);
            if (column != null) {
                this.getTable().setRedraw(false);
                column.dispose();
                this.getTable().setRedraw(true);
            }
        }
    }

    protected Table createTable(final Composite parent, final int style) {
        return new Table(parent, style);
    }

    public Map<Integer, TableViewerColumn> getColumnMap() {
        return this.tableViewerColumnMap;
    }

    private void addSelectionAdapter() {
        int i = 0;
        for (final TableColumn column1 : this.getViewer().getTable().getColumns()) {
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
        for (final TableColumn column1 : this.getViewer().getTable().getColumns()) {
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
                if (AbstractTable.this.table.getSortDirection() == SWT.NONE) {
                    this.direction = SWT.DOWN;
                } else {
                    if (this.direction == SWT.UP) {
                        this.direction = SWT.DOWN;
                    } else {
                        this.direction = SWT.UP;
                    }
                }

                if (AbstractTable.this.sortingHandler != null) {
                    AbstractTable.this.sortingHandler.setSortDirection(this.direction);
                    AbstractTable.this.sortingHandler.sort(ptColumn, true);
                }
            }
        };
        return selectionAdapter;
    }

    // will automatically be called on disposal of the underlying SWT table
    protected void dispose() {
        // do nothing - needs to be overriden if needed
    }

    public TableItem[] getTableSelection() {
        return this.table.getSelection();
    }

    public ISelection getViewerSelection() {
        return this.viewer.getSelection();
    }

    public void setSelection(final ISelection selection) {
        this.viewer.setSelection(selection);
    }

    public void setInput(final Object input) {
        this.firePreInputChanged(input);
        this.viewer.setInput(input);
        this.fireAfterInputChanged(input);
    }

    public void setContentProvider(final IContentProvider provider) {
        this.viewer.setContentProvider(provider);
    }

    public void setContentProvider(final IExtendedLazyTableContentProvider provider) {
        this.extendedContentProvider = provider;
        this.viewer.setContentProvider(provider);
    }

    public void setSortingHandler(final ISortingHandler handler) {
        this.sortingHandler = handler;
    }

    public ISortingHandler getSortingHandler() {
        return this.sortingHandler;
    }

    /**
     * Set label contentProvider for the table viewer of the table.
     * Use this to set one label contentProvider for every column!
     *
     * @param labelProvider
     *            The label contentProvider to set for the table viewer.
     */
    public void setLabelProvider(final ITableLabelProvider labelProvider) {
        assert this.cellLabelProvider == null : "TableLableProvider overwrites already set CellLabelProvider!";
        this.viewer.setLabelProvider(labelProvider);
    }

    /**
     * Set cell label contentProvider for the table viewer of the table.
     * Use this to set the same cell label contentProvider for every column.
     *
     * @param labelProvider
     */
    public void setLabelProvider(final CellLabelProvider labelProvider) {
        this.cellLabelProvider = labelProvider;
        for (final TableViewerColumn c : this.tableViewerColumnMap.values()) {
            c.setLabelProvider(labelProvider);
        }
    }

    /**
     * Set label contentProvider for a single column(cell) of the table.
     * Use this to set one label contentProvider per column when tooltips are activated!
     *
     * @param cell
     *            The column/cell to provide a label contentProvider
     *
     * @param labelProvider
     *            A CellLabelProvider for a single column/cell.
     */
    protected void setCellLabelProvider(final int cell, final CellLabelProvider labelProvider) {
        assert !(this.viewer.getLabelProvider() instanceof ITableLabelProvider) : "CellLabelProvider doesn't "
                + "work because TableLabelProvider is already set!";
        if (this.tableViewerColumnMap.get(Integer.valueOf(cell)) != null) {
            this.tableViewerColumnMap.get(Integer.valueOf(cell)).setLabelProvider(labelProvider);
        }
    }

    public TableViewer getViewer() {
        return this.viewer;
    }

    public CheckboxTableViewer getCheckBoxViewer() {
        if (this.viewer instanceof CheckboxTableViewer) {
            return (CheckboxTableViewer) this.viewer;
        }
        return null;
    }

    public void setAllUnchecked() {
        this.getCheckBoxViewer().setAllChecked(false);
        this.getCheckBoxViewer().setAllGrayed(false);

        this.checkedItems.clear();
        this.grayedItems.clear();

        this.getCheckBoxViewer().refresh();

        this.fireCheckedStateChanged();
    }

    public void setAllChecked() {
        this.setCollectionChecked(this.getAllActiveElements());
    }

    public void setCollectionChecked(final Collection<Object> elements) {
        this.getTable().setRedraw(false);

        this.getCheckBoxViewer().setCheckedElements(elements.toArray());
        this.getCheckBoxViewer().setGrayedElements(new ArrayList<>(0).toArray());

        this.checkedItems.addAll(elements);
        this.grayedItems.removeAll(elements);

        this.getCheckBoxViewer().refresh();

        this.getTable().setRedraw(true);
        this.fireCheckedStateChanged();
    }

    public void setCheckedElements(final Collection<Object> elements) {
        this.checkedItems.clear();
        this.grayedItems.clear();

        this.setCollectionChecked(elements);
    }

    protected void fireCheckedStateChanged() {
        // do nothing - to be overwritten
    }

    /**
     * This method is considered to be overwritten by subclasses.
     *
     * @return
     */
    public List<Object> getAllActiveElements() {
        return this.getAllElements();
    }

    public List<Object> getAllElements() {
        if (this.extendedContentProvider != null) {
            return new ArrayList<>(this.extendedContentProvider.getRootItems());
        } else {
            if (this.getViewer().getContentProvider() instanceof IStructuredContentProvider) {
                return Arrays.asList(((IStructuredContentProvider) this.getViewer().getContentProvider()).getElements(this.viewer
                        .getInput()));
            } else {
                // Invalid usage of AbstractTable
                return null;
            }
        }
    }

    public Table getTable() {
        return this.table;
    }

    public Set<Object> getCheckedItems() {
        return Collections.unmodifiableSet(this.checkedItems);
    }

    public Set<Object> getGrayedItems() {
        return Collections.unmodifiableSet(this.grayedItems);
    }

    protected void setCheckedState(final Object element, final CheckedState state) {
        switch (state) {
        case CHECKED:
            this.getCheckBoxViewer().setChecked(element, true);
            this.getCheckBoxViewer().setGrayed(element, false);
            this.checkedItems.add(element);
            this.grayedItems.remove(element);
            break;
        case UNCHECKED:
            this.getCheckBoxViewer().setChecked(element, false);
            this.getCheckBoxViewer().setGrayed(element, false);
            this.checkedItems.remove(element);
            this.grayedItems.remove(element);
            break;
        case INDETERMINATE:
            this.getCheckBoxViewer().setChecked(element, true);
            this.getCheckBoxViewer().setGrayed(element, true);
            this.checkedItems.add(element);
            this.grayedItems.add(element);
            break;
        default:
            // do nothing
        }
    }

    public void setSelectionByIndex(final int index) {
        this.table.setSelection(index);
    }

    protected abstract com.xse.eclipseui.table.TableColumn[] getColumns();

    private boolean hasToolTipColumns() {
        for (final com.xse.eclipseui.table.TableColumn column : this.getColumns()) {
            if (column.isProvideTooltip()) {
                return true;
            }
        }

        return false;
    }

    public CellLabelProvider getCellLabelProvider() {
        return this.cellLabelProvider;
    }

    public IContentProvider getContentProvider() {
        return this.viewer.getContentProvider();
    }

    public IExtendedLazyTableContentProvider getExtendedContentProvider() {
        return this.extendedContentProvider;
    }

    protected void firePreInputChanged(final Object newInput) {
        this.inputChangedListeners.forEach(l -> l.preInputChanged(newInput));
    }

    protected void fireAfterInputChanged(final Object newInput) {
        this.inputChangedListeners.forEach(l -> l.afterInputChanged(newInput));
    }

    public void addInputChangedListener(final IInputChangedListener listener) {
        this.inputChangedListeners.add(listener);
    }

    public void removeInputChangedListener(final IInputChangedListener listener) {
        this.inputChangedListeners.remove(listener);
    }

}
