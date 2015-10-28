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

import java.lang.reflect.Type;

import org.eclipse.emf.common.util.Enumerator;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * {@link JsonSerializer} implementation for converting {@link Enumerator} instances of model enums to their
 * corresponding JSON representation by using the provided enum literal.
 *
 * @author philipb
 *
 */
public class ResouceConfigurationTypeAdapter implements JsonSerializer<Enumerator> {

    @Override
    public JsonElement serialize(final Enumerator src, final Type typeOfSrc, final JsonSerializationContext context) {
        return new JsonPrimitive(src.getLiteral());
    }

}
