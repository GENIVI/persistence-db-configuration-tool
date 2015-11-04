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

import org.eclipse.core.runtime.Platform;

public class TreeElement<T> implements ITreeElement<T> {

    protected final T data;

    private int filteredChildsCount = -1;
    private int filteredGrandChildsCount = -1;

    private final ITreeElement<T> parent;

    public TreeElement(final T data, final ITreeElement<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public int getFilteredChildsCount() {
        return this.filteredChildsCount;
    }

    @Override
    public void setFilteredChildsCount(final int filteredChildsCount) {
        this.filteredChildsCount = filteredChildsCount;
    }

    @Override
    public int getFilteredGrandChildsCount() {
        return this.filteredGrandChildsCount;
    }

    @Override
    public void setFilteredGrandChildsCount(final int filteredGrandChildCount) {
        this.filteredGrandChildsCount = filteredGrandChildCount;
    }

    @Override
    public String toString() {
        return "TreeElement [data=" + (this.data != null ? this.data : "null") + ", filteredChildsCount=" + this.filteredChildsCount
                + ", filteredGrandChildsCount=" + this.filteredGrandChildsCount + "]";
    }

    @Override
    public ITreeElement<T> getParent() {
        return this.parent;
    }

    @Override
    public boolean hasParent() {
        return this.parent != null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.data == null) ? 0 : this.data.hashCode());
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final TreeElement<T> other = (TreeElement<T>) obj;
        if (this.data == null) {
            if (other.data != null) {
                return false;
            }
        } else if (!this.data.equals(other.data)) {
            return false;
        }
        return true;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Object getAdapter(final Class adapter) {
        if ((this.data != null) && adapter.isAssignableFrom(this.data.getClass())) {
            return this.data;
        }

        // make sure to check if there are adapters registered within the plugin.xml file (as not all built-in eclipse classes check that)
        return Platform.getAdapterManager().getAdapter(this, adapter);
    }

}
