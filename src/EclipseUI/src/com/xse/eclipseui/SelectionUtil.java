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
package com.xse.eclipseui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.xse.eclipseui.util.AdapterUtil;

/**
 *
 * @author pberg
 *
 */
public final class SelectionUtil {

    private SelectionUtil() {
        // do nothing
    }

    /**
     * Returns the first element of an {@link IStructuredSelection}, if no
     * {@link IStructuredSelection} is passed null will be returned.
     *
     * @param selection
     * @return
     */
    @Nullable
    public static Object getFirstElement(final ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            final Object firstElement = structuredSelection.getFirstElement();

            return firstElement;
        }
        return null;
    }

    /**
     * Returns all elements of an {@link IStructuredSelection} that are of the specified type or
     * alternatively can be adapted to the specified type.
     * If no {@link IStructuredSelection} will be passed, an empty {@link Collection} will be
     * returned.
     *
     * @param selection
     * @param type
     * @return
     */
    @SuppressWarnings("unchecked")
    @NonNull
    public static <T> Collection<T> getSelectedElementsOfType(final ISelection selection, final @NonNull Class<T> type) {
        final Collection<T> selectedElements = new ArrayList<>();
        if (selection instanceof IStructuredSelection) {
            final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            @SuppressWarnings("rawtypes")
            final Iterator iterator = structuredSelection.iterator();
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                if (next != null) {
                    if (type.isAssignableFrom(next.getClass())) {
                        selectedElements.add((T) next);
                    } else if (next instanceof IAdaptable) {
                        final @Nullable T adapter = AdapterUtil.getAdapter((IAdaptable) next, type);
                        if (adapter != null) {
                            selectedElements.add(adapter);
                        }
                    }
                }
            }
        }
        return selectedElements;
    }

    /**
     * Returns the amount of elements in an {@link IStructuredSelection}. If no
     * {@link IStructuredSelection} will be passed, 0 will be
     * returned.
     *
     * @param selection
     * @return
     */
    public static int getSelectionCount(final ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            return structuredSelection.size();
        }
        return 0;
    }
}
