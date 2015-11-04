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

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.swt.graphics.Image;

/**
 * Base label provider that includes an image caching and disposing facility.
 *
 * @author pberg
 *
 */
public abstract class AbstractBaseLabelProvider extends AbstractBaseLabelProviderAdapter {

    protected final Map<String, Image> imageCash = new HashMap<>();

    @Override
    public void dispose() {
        for (final Entry<String, Image> entry : this.imageCash.entrySet()) {
            final Image image = entry.getValue();
            if (image != null) {
                image.dispose();
            }
        }
        this.imageCash.clear();
    }

}
