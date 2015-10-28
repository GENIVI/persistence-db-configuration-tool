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
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EGroupType;

/**
 * {@link JsonSerializer} implementation for converting {@link EApplication} instances to their corresponding JSON
 * representation for the actual resource storage.
 *
 * @author philipb
 *
 */
public class ResouceConfigurationApplicationTypeAdapter implements JsonSerializer<EApplication> {

    @Override
    public JsonElement serialize(final EApplication src, final Type typeOfSrc, final JsonSerializationContext context) {
        final JsonObject obj = new JsonObject();
        if (src.getGroup().getType() == EGroupType.APPLICATION) {
            obj.add(PersConfDefinitions.CONFIG_APPL_KEY_NAME, context.serialize(src.getName()));
        } else {
            obj.add(PersConfDefinitions.CONFIG_APPL_KEY_NAME, context.serialize(PersConfDefinitions.CONFIG_SHARED_VALUE));
        }
        obj.add(PersConfDefinitions.VERSION_KEY_NAME, context.serialize(src.getVersion()));

        final Map<String, JsonElement> map = new HashMap<>();
        src.getResources().forEach(resource -> map.put(resource.getName(), context.serialize(resource.getConfiguration())));

        obj.add(PersConfDefinitions.RESOURCES_KEY_NAME, context.serialize(map));

        return obj;
    }

}
