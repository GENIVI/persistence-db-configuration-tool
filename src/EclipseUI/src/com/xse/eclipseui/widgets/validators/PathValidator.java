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
package com.xse.eclipseui.widgets.validators;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.xse.eclipseui.util.StringUtils;

public class PathValidator extends StringValidator {

    private final boolean isDirectory;
    private final boolean exists;

    private final String pluginId;
    private final int errorLevel;

    /**
     *
     * @param mandatory
     * @param isDirectory
     *            if true the selected value will be treated as a directory that has to be
     *            existent and writable, if false the behavior depends on the exists flag
     * @param exists
     *            only important if isDirectory is false; if true the selected value will be treated
     *            as a file path that has to be existent, if false the parent folder of the selected
     *            file path needs to be existent and writable
     * @param message
     */
    public PathValidator(final String pluginId, final int errorLevel, final boolean mandatory, final boolean isDirectory,
            final boolean exists, final String message) {
        super(mandatory, message);

        this.pluginId = pluginId;
        this.errorLevel = errorLevel;

        this.isDirectory = isDirectory;
        this.exists = exists;
    }

    @Override
    public IStatus validate(final String value) {
        final IStatus validationStatus = super.validate(value);

        if (validationStatus.isOK()) {
            if (!this.isMandatory() && StringUtils.isEmpty(value)) {
                return Status.OK_STATUS;
            }

            final File file = new File(value);
            if (this.isDirectory) {
                if (file.exists() && file.isDirectory() && file.canWrite()) {
                    return Status.OK_STATUS;
                }
            } else {
                if (this.exists) {
                    if (file.exists() && file.isFile() && file.canRead()) {
                        return Status.OK_STATUS;
                    }
                } else {
                    final String fullPathNoEndSeparator = FilenameUtils.getFullPathNoEndSeparator(value);
                    if (fullPathNoEndSeparator != null) {
                        final File parentPath = new File(fullPathNoEndSeparator);
                        if (parentPath.exists() && parentPath.isDirectory() && parentPath.canExecute() && parentPath.canWrite()) {
                            return Status.OK_STATUS;
                        }
                    }
                }
            }

            return new Status(this.errorLevel, this.pluginId, this.getMessage());
        }

        return validationStatus;
    }

}
