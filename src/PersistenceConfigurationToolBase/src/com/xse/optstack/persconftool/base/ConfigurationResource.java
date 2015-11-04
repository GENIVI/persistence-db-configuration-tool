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
package com.xse.optstack.persconftool.base;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.xse.eclipseui.util.ILoggingKeyProvider;

/**
 * Root resource handle class.
 *
 * @author philipb
 *
 */
public class ConfigurationResource implements ILoggingKeyProvider {

    private final Resource resource;
    private final URI fileUri;

    private ConfigurationResource(final URI fileUri) {
        this.fileUri = fileUri;
        final ResourceSet rs = new ResourceSetImpl();
        this.resource = rs.createResource(fileUri);
    }

    /**
     * Creates a new {@link ConfigurationResource} object instance referencing the EMF resource at the passed file URI.
     */
    public static ConfigurationResource createResource(final URI fileUri) {
        return new ConfigurationResource(fileUri);
    }

    @Override
    public String getLoggingKey() {
        return this.fileUri.path();
    }

    /**
     * Returns the actual EMF resource element.
     */
    public Resource getResource() {
        return this.resource;
    }

}
