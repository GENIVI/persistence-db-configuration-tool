/*******************************************************************************
 * Persistence Configuration Tool Base
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
package com.xse.optstack.persconftool.base.persistence;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

/**
 * {@link ExclusionStrategy} implementation to filter EMF specific fields from JSON persistence.
 *
 * @author philipb
 *
 */
public class EmfExclusionStrategy implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(final FieldAttributes fieldAttributes) {
        if (fieldAttributes.getName().equalsIgnoreCase("eStorage")) {
            return true;
        } else if (fieldAttributes.getName().equalsIgnoreCase("eFlags")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean shouldSkipClass(final Class<?> clazz) {
        return false;
    }

}
