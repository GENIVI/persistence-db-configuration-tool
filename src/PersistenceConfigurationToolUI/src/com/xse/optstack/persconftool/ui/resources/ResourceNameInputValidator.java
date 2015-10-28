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
package com.xse.optstack.persconftool.ui.resources;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.dialogs.IInputValidator;

import com.xse.optstack.persconf.EResource;

/**
 * {@link IInputValidator} implementation that checks {@link EResource} names for validity regarding name length.
 * This validator also checks if a name has already been used for a different resource.
 *
 * @author philipb
 *
 */
public class ResourceNameInputValidator implements IInputValidator {

    private final Set<String> existingNames = new HashSet<>();
    private final String exceptionString;

    /**
     * Constructor for new resources.
     *
     * @param existingResources
     */
    public ResourceNameInputValidator(final Collection<EResource> existingResources) {
        this(existingResources, null);
    }

    /**
     * Constructor for changing the name of an existing resource.
     * 
     * @param existingResources
     * @param activeResource
     */
    public ResourceNameInputValidator(final Collection<EResource> existingResources, final EResource activeResource) {
        existingResources.forEach(r -> this.existingNames.add(r.getName()));
        if (activeResource != null) {
            this.exceptionString = activeResource.getName();
        } else {
            this.exceptionString = "";
        }
    }

    @Override
    public String isValid(final String newText) {
        if ((newText != null) && (newText.length() >= 1) && (newText.length() < 255)) {
            if (!this.existingNames.contains(newText) || this.exceptionString.equals(newText)) {
                return null;
            } else {
                return "A resource with this name already exists!";
            }
        }
        return "Please enter a valid name for the resource!";
    }

}
