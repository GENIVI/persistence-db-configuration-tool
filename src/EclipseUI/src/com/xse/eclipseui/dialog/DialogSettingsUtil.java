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
package com.xse.eclipseui.dialog;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.xse.eclipseui.SettingsException;

public final class DialogSettingsUtil {

    private IDialogSettings rootSection;

    private DialogSettingsUtil(final AbstractUIPlugin plugin, final String sectionName) throws SettingsException {
        final IDialogSettings dialogSettings = plugin.getDialogSettings();
        if (dialogSettings != null) {
            this.rootSection = dialogSettings.getSection(sectionName);
            if (null == this.rootSection) {
                this.rootSection = dialogSettings.addNewSection(sectionName);
            }
        } else {
            throw new SettingsException("Unable to get root dialog settings section!");
        }
    }

    private IDialogSettings getSubSection(final String subsection) {
        IDialogSettings subSection = this.rootSection.getSection(subsection);
        if (null == subSection) {
            subSection = this.rootSection.addNewSection(subsection);
        }
        return subSection;
    }

    public void setSetting(final String subsection, final String key, final String value) {
        this.getSubSection(subsection).put(key, value);
    }

    public void setSetting(final String subsection, final String key, final boolean value) {
        this.getSubSection(subsection).put(key, value);
    }

    public void setSetting(final String subsection, final String key, final int value) {
        this.getSubSection(subsection).put(key, value);
    }

    public void setSetting(final String subsection, final String key, final String[] value) {
        this.getSubSection(subsection).put(key, value);
    }

    public String getSetting(final String subsection, final String key) {
        return this.getSubSection(subsection).get(key);
    }

    public boolean getBooleanSetting(final String subsection, final String key) {
        return this.getSubSection(subsection).getBoolean(key);
    }

    public boolean getBooleanSettingOrDefault(final String subsection, final String key, final boolean defaultValue) {
        final IDialogSettings section = this.getSubSection(subsection);
        if (section.get(key) != null) {
            return this.getSubSection(subsection).getBoolean(key);
        } else {
            return defaultValue;
        }
    }

    public int getIntSetting(final String subsection, final String key) {
        return this.getSubSection(subsection).getInt(key);
    }

    public int getIntSettingOrDefault(final String subsection, final String key, final int defaultValue) {
        final IDialogSettings section = this.getSubSection(subsection);
        if (section.get(key) != null) {
            return this.getSubSection(subsection).getInt(key);
        } else {
            return defaultValue;
        }
    }

    public String[] getArraySetting(final String subsection, final String key) {
        return this.getSubSection(subsection).getArray(key);
    }

    public boolean isSectionAvailable(final String subsection) {
        return this.rootSection.getSection(subsection) != null ? true : false;
    }

    public static DialogSettingsUtil createInstance(final AbstractUIPlugin plugin, final String section) throws SettingsException {
        return new DialogSettingsUtil(plugin, section);
    }

}
