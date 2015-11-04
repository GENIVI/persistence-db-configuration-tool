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
import com.xse.eclipseui.util.Logger;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconftool.base.Activator;

/**
 * {@link JsonSerializer} implementation for converting {@link EApplication} instances including their {@link EResource}
 * instances to their corresponding JSON representation for default data storage.
 *
 * @author philipb
 *
 */
public class DefaultDataApplicationTypeAdapter implements JsonSerializer<EApplication> {

    private final boolean isFactory;

    public DefaultDataApplicationTypeAdapter(final boolean isFactory) {
        this.isFactory = isFactory;
    }

    @Override
    public JsonElement serialize(final EApplication src, final Type typeOfSrc, final JsonSerializationContext context) {
        final JsonObject obj = new JsonObject();
        switch (src.getGroup().getType()) {
        case APPLICATION:
            obj.add(PersConfDefinitions.CONFIG_APPL_KEY_NAME, context.serialize(src.getName()));
            break;
        case PUBLIC:
            obj.add(PersConfDefinitions.CONFIG_DEFAULT_PUBLIC_KEY, context.serialize(PersConfDefinitions.CONFIG_DEFAULT_PUBLIC_VALUE));
            break;
        case SHARED:
            obj.add(PersConfDefinitions.CONFIG_DEFAULT_GROUP_KEY_PREFIX + src.getName(),
                    context.serialize(PersConfDefinitions.CONFIG_DEFAULT_GROUP_VALUE_PREFIX + src.getName()));
            break;
        default:
            Logger.warn(Activator.PLUGIN_ID, "Invalid application group type: " + src.getGroup().getType());
            break;
        }
        obj.add(PersConfDefinitions.VERSION_KEY_NAME, context.serialize(src.getVersion()));

        final Map<String, JsonElement> map = new HashMap<>();
        for (final EResource eResource : src.getResources()) {
            final EDefaultData defaultData = this.isFactory ? eResource.getConfiguration().getFactoryDefault() : eResource
                    .getConfiguration().getConfigDefault();
            if (hasDefaultDataValue(defaultData)) {
                map.put(eResource.getName(), context.serialize(defaultData));
            }
        }
        obj.add(PersConfDefinitions.RESOURCES_KEY_NAME, context.serialize(map));

        return obj;
    }

    /**
     * Checks if the specified {@link EDefaultData} object actually contains any default data.
     */
    private static boolean hasDefaultDataValue(final EDefaultData defaultData) {
        return (defaultData != null) && (defaultData.getSize() != null) && (defaultData.getSize().length() > 0)
                && (defaultData.getData() != null) && (defaultData.getData().length() > 0);
    }

}
