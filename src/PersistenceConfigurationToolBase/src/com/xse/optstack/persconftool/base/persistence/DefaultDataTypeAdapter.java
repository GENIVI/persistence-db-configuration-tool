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

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.xse.optstack.persconf.EDefaultData;

/**
 * {@link JsonSerializer} implementation for converting {@link EDefaultData} instances to their corresponding JSON
 * representation.
 *
 * @author philipb
 *
 */
public class DefaultDataTypeAdapter implements JsonSerializer<EDefaultData> {

    @Override
    public JsonElement serialize(final EDefaultData src, final Type typeOfSrc, final JsonSerializationContext context) {
        final JsonObject obj = new JsonObject();
        obj.addProperty(PersConfDefinitions.SIZE_KEY_NAME, src.getSize());
        obj.addProperty(PersConfDefinitions.DATA_KEY_NAME, src.getData());

        return obj;
    }

}
