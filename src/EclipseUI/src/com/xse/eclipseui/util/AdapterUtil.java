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
package com.xse.eclipseui.util;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public final class AdapterUtil {

    private AdapterUtil() {
        // do nothing
    }

    @SuppressWarnings("unchecked")
    public static @Nullable <T> T getAdapter(final @Nullable IAdaptable adaptee, final @NonNull Class<T> clazz) {
        if (adaptee != null) {
            final Object adapter = adaptee.getAdapter(clazz);
            if ((adapter != null) && clazz.isAssignableFrom(adapter.getClass())) {
                return (T) adapter;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static @Nullable <T> T getAdapter(final @Nullable Object adaptee, final @NonNull Class<T> clazz) {
        if (adaptee != null) {
            if (clazz.isAssignableFrom(adaptee.getClass())) {
                return (@Nullable T) adaptee;
            } else if (IAdaptable.class.isAssignableFrom(adaptee.getClass())) {
                return AdapterUtil.getAdapter((IAdaptable) adaptee, clazz);
            }
        }
        return null;
    }

}
