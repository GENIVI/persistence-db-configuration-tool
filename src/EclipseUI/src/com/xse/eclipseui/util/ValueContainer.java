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


/**
 * A generic Container that is capable of storing a single value.
 *
 * @author pberg
 *
 * @param <T>
 */
public class ValueContainer<T> {

    private T value;

    public ValueContainer(final T value) {
        this.value = value;
    }

    public ValueContainer() {
        this.value = null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(final T value) {
        this.value = value;
    }

}
