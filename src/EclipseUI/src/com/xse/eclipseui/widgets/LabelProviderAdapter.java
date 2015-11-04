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

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public abstract class LabelProviderAdapter<T> implements ILabelProvider {

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

    @SuppressWarnings("unchecked")
    @Override
    public String getText(final Object element) {
        return this.getItemText((T) element);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Image getImage(final Object element) {
        return this.getItemImage((T) element);
    }

    public abstract String getItemText(final T element);

    public abstract Image getItemImage(final T element);

}
