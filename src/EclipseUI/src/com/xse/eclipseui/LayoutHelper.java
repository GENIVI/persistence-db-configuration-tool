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

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public final class LayoutHelper {

    private LayoutHelper() {
        // do nothing
    }

    /**
     * Removes all spacings from the passed layout and for convenience returns the same layout.
     *
     * @param layout
     * @return
     */
    public static GridLayout removeSpacing(final GridLayout layout) {
        layout.verticalSpacing = layout.horizontalSpacing = 0;

        return layout;
    }

    /**
     * Removes all margins from the passed layout and for convenience returns the same layout.
     *
     * @param layout
     * @return
     */
    public static GridLayout removeMargins(final GridLayout layout) {
        layout.marginWidth = layout.marginHeight = 0;
        layout.marginTop = layout.marginBottom = 0;
        layout.marginLeft = layout.marginRight = 0;

        return layout;
    }

    /**
     * Removes all margins and spacings from the passed layout and for convenience returns the same
     * layout.
     *
     * @param layout
     * @return
     */
    public static GridLayout getFrameClearedLayout(final GridLayout layout) {
        GridLayout result = removeSpacing(layout);
        result = removeMargins(layout);

        return result;
    }

    /**
     * Returns a default grid layouted and gridData composite with no margins.
     *
     * @param parent
     * @param compositeStyle
     * @param numColumns
     * @param makeColumnsEqualWidth
     * @param horizontalAlignment
     * @param verticalAlignment
     * @param grabExcessHorizontalSpace
     * @param grabExcessVerticalSpace
     * @return
     */
    public static Composite createDefaultGridComposite(final Composite parent, final int compositeStyle, final int numColumns,
            final boolean makeColumnsEqualWidth, final int horizontalAlignment, final int verticalAlignment,
            final boolean grabExcessHorizontalSpace, final boolean grabExcessVerticalSpace) {

        final Composite composite = new Composite(parent, compositeStyle);
        final GridLayout gridLayout = new GridLayout(numColumns, makeColumnsEqualWidth);

        composite.setLayout(removeMargins(gridLayout));
        composite.setLayoutData(new GridData(horizontalAlignment, verticalAlignment, grabExcessHorizontalSpace, grabExcessVerticalSpace));

        return composite;
    }

}
