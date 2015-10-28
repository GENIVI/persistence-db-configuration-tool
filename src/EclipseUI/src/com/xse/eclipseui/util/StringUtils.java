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
package com.xse.eclipseui.util;

public final class StringUtils {

    private StringUtils() {
        // do nothing
    }

    /**
     * If the passed {@link Object} is not null the result of toString() will be returned, else an
     * empty {@link String} will be returned.
     * This method will never return null!
     *
     * @param value
     * @return
     */
    public static String getString(final Object value) {
        return value != null ? value.toString() : "";
    }

    /**
     * Returns the passed {@link Number} formated as a hex {@link String}.
     * <b>Caution: Untested for larger values!</b>
     *
     * @param value
     * @return
     */
    public static String getHexString(final Number value) {
        return value != null ? String.format("%#02x", value) : "";
    }

    /**
     * Checks whether the passed String is empty or null.
     *
     * @param value
     * @return true if the passed String is empty or null, false otherwise
     */
    public static boolean isEmpty(final String value) {
        if ((value == null) || value.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Helper method to parse a zero terminated string
     *
     * @param array
     *            The byte array to parse
     *
     * @return The parsed string without zero termination
     */
    public static String parseString(final byte[] array) {
        final StringBuilder builder = new StringBuilder();
        for (final byte element : array) {
            if (element == '\0') {
                break;
            }
            builder.append((char) element);
        }
        return builder.toString();
    }

    /**
     * Checks if checkString starts with any of the provided prefixes.
     *
     * @param checkString
     * @param prefixes
     * @return
     */
    public static boolean startsWithAny(final String checkString, final String[] prefixes) {
        for (final String prefix : prefixes) {
            if (checkString.startsWith(prefix)) {
                return true;
            }
        }

        return false;
    }

}
