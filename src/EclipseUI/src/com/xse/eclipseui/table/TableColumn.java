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

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.SWT;

public class TableColumn {

    private String title;
    private int style;
    private int width;
    private String headerTooltip;

    private boolean includeInFilter;

    private boolean isMoveable;

    private EditingSupport editingSupport;

    private boolean provideTooltip;
    private boolean hasEditingSupport = false;

    public TableColumn(final String title, final int width, final int style, final boolean includeInFilter, final boolean provideTooltip,
            final boolean isMoveable) {

        this.title = title;
        this.width = width;
        this.style = style;
        this.provideTooltip = provideTooltip;
        this.isMoveable = isMoveable;
        this.setIncludeInFilter(includeInFilter);
    }

    public TableColumn(final String title, final int width, final boolean includeInFilter, final boolean provideTooltip,
            final boolean isMoveable) {

        this(title, width, SWT.LEFT, includeInFilter, provideTooltip, isMoveable);
    }

    public TableColumn(final String title, final int width, final boolean includeInFilter, final boolean provideTooltip) {

        this(title, width, SWT.LEFT, includeInFilter, provideTooltip, false);
    }

    public TableColumn(final String title, final int width, final boolean includeInFilter) {
        this(title, width, SWT.LEFT, includeInFilter, false, false);
    }

    public TableColumn(final String title, final int width) {
        this(title, width, true);
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setStyle(final int style) {
        this.style = style;
    }

    public int getStyle() {
        return this.style;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isIncludeInFilter() {
        return this.includeInFilter;
    }

    public void setIncludeInFilter(final boolean includeInFilter) {
        this.includeInFilter = includeInFilter;
    }

    public EditingSupport getEditingSupport() {
        return this.editingSupport;
    }

    public void setEditingSupport(final EditingSupport editingSupport) {
        this.editingSupport = editingSupport;
        this.hasEditingSupport = editingSupport != null ? true : false;
    }

    public boolean isProvideTooltip() {
        return this.provideTooltip;
    }

    public void setProvideTooltip(final boolean provideTooltip) {
        this.provideTooltip = provideTooltip;
    }

    public boolean isMoveable() {
        return this.isMoveable;
    }

    public void setMoveable(final boolean isMoveable) {
        this.isMoveable = isMoveable;
    }

    public boolean hasEditingSupport() {
        return this.hasEditingSupport;
    }

    public String getHeaderTooltip() {
        return this.headerTooltip;
    }

    public void setHeaderTooltip(final String headerTooltip) {
        this.headerTooltip = headerTooltip;
    }

    @Override
    public String toString() {
        return "TableColumn [" + (this.title != null ? "title=" + this.title + ", " : "") + "style=" + this.style + ", width=" + this.width
                + ", " + (this.headerTooltip != null ? "headerTooltip=" + this.headerTooltip + ", " : "") + "includeInFilter="
                + this.includeInFilter + ", isMoveable=" + this.isMoveable + ", "
                + (this.editingSupport != null ? "editingSupport=" + this.editingSupport + ", " : "") + "provideTooltip="
                + this.provideTooltip + ", hasEditingSupport=" + this.hasEditingSupport + "]";
    }

}
