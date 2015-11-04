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
package com.xse.optstack.persconftool.ui.applications;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.dialogs.IInputValidator;

import com.xse.optstack.persconf.EApplication;

/**
 * {@link IInputValidator} implementation that checks {@link EApplication} names for validity regarding name length.
 * This validator also checks if a name has already been used for a different application.
 *
 * @author philipb
 *
 */
public class ApplicationNameInputValidator implements IInputValidator {

    private final Set<String> existingNames = new HashSet<>();
    private final String exceptionString;

    /**
     * Constructor for new applications.
     *
     * @param existingApplications
     */
    public ApplicationNameInputValidator(final Collection<EApplication> existingApplications) {
        this(existingApplications, null);
    }

    /**
     * Constructor for changing the name of an existing application.
     *
     * @param existingApplications
     * @param activeApplication
     */
    public ApplicationNameInputValidator(final Collection<EApplication> existingApplications, final EApplication activeApplication) {
        existingApplications.forEach(r -> this.existingNames.add(r.getName()));
        if (activeApplication != null) {
            this.exceptionString = activeApplication.getName();
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
                return "An application with this name already exists!";
            }
        }
        return "Please enter a valid name for the application!";
    }

}
