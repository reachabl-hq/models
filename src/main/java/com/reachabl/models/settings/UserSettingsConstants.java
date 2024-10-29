package com.reachabl.models.settings;

import java.util.Locale;
import java.util.TimeZone;

public enum UserSettingsConstants {
    LANGUAGE("public.social.language", "public", "social", "language", Locale.ENGLISH.getLanguage()),
    TIMEZONE("mysettings.geo.timezone", "mysettings",  "geo", "timezone", TimeZone.getDefault()),
    TIME_FORMAT("mysettings.personal.time-format", "mysettings",  "personal", "time-format", TimeFormat.USE_12_HOURS);

    private final String field;
    private final String category;
    private final String subCategory;
    private final String apiField;
    private final Object defaultValue;

    UserSettingsConstants(String field, String category, String subCategory, String apiField, Object defaultValue) {
        this.field = field;
        this.category = category;
        this.subCategory = subCategory;
        this.apiField = apiField;
        this.defaultValue = defaultValue;
    }

    public String getField() {
        return field;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public String getApiField() {
        return apiField;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public enum TimeFormat {
        USE_12_HOURS,
        USE_24_HOURS;
    }
}