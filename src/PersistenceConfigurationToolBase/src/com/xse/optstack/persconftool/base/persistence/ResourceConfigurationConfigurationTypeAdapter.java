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
import com.xse.eclipseui.util.StringUtils;
import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.PersconfPackage;

/**
 * {@link JsonSerializer} implementation for converting {@link EConfiguration} instances to their corresponding JSON
 * representation.
 *
 * @author philipb
 *
 */
public class ResourceConfigurationConfigurationTypeAdapter implements JsonSerializer<EConfiguration> {

    @Override
    public JsonElement serialize(final EConfiguration src, final Type typeOfSrc, final JsonSerializationContext context) {
        final JsonObject obj = new JsonObject();

        obj.add(PersconfPackage.Literals.ECONFIGURATION__POLICY.getName(), context.serialize(src.getPolicy()));
        obj.add(PersconfPackage.Literals.ECONFIGURATION__PERMISSION.getName(), context.serialize(src.getPermission()));
        obj.add(PersconfPackage.Literals.ECONFIGURATION__STORAGE.getName(), context.serialize(src.getStorage()));

        if (!StringUtils.isEmpty(src.getMax_size())) {
            obj.add(PersconfPackage.Literals.ECONFIGURATION__MAX_SIZE.getName(), context.serialize(src.getMax_size()));
        } else {
            obj.add(PersconfPackage.Literals.ECONFIGURATION__MAX_SIZE.getName(), context.serialize(PersConfDefinitions.NA_NAME));
        }
        if (!StringUtils.isEmpty(src.getResponsible())) {
            obj.add(PersconfPackage.Literals.ECONFIGURATION__RESPONSIBLE.getName(), context.serialize(src.getResponsible()));
        } else {
            obj.add(PersconfPackage.Literals.ECONFIGURATION__RESPONSIBLE.getName(), context.serialize(PersConfDefinitions.NA_NAME));
        }
        if (!StringUtils.isEmpty(src.getCustom_name())) {
            obj.add(PersconfPackage.Literals.ECONFIGURATION__CUSTOM_NAME.getName(), context.serialize(src.getCustom_name()));
        } else {
            obj.add(PersconfPackage.Literals.ECONFIGURATION__CUSTOM_NAME.getName(), context.serialize(PersConfDefinitions.NA_NAME));
        }

        obj.add(PersconfPackage.Literals.ECONFIGURATION__TYPE.getName(), context.serialize(src.getType()));

        if (!StringUtils.isEmpty(src.getCustomID())) {
            obj.add(PersconfPackage.Literals.ECONFIGURATION__CUSTOM_ID.getName(), context.serialize(src.getCustomID()));
        } else {
            obj.add(PersconfPackage.Literals.ECONFIGURATION__CUSTOM_ID.getName(), context.serialize(PersConfDefinitions.NA_NAME));
        }

        return obj;
    }

}
