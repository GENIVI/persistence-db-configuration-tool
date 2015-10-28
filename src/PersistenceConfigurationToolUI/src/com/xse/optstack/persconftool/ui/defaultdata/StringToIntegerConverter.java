/*******************************************************************************
 * Persistence Configuration Tool UI
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
package com.xse.optstack.persconftool.ui.defaultdata;

import org.eclipse.core.databinding.conversion.IConverter;

public class StringToIntegerConverter implements IConverter {

    @Override
    public Object getToType() {
        return Integer.class;
    }

    @Override
    public Object getFromType() {
        return String.class;
    }

    @Override
    public Object convert(final Object fromObject) {
        return Integer.valueOf(fromObject.toString());
    }

}
