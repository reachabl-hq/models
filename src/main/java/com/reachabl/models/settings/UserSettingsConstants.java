package com.reachabl.models.settings;

import java.util.Locale;
import java.util.TimeZone;

public enum UserSettingsConstants {

    /**
     * Personal.
     */
    LANGUAGE("mysettings.personal.language", "mysettings", "personal", "language", Locale.ENGLISH.getLanguage()),
    TIMEZONE("mysettings.personal.timezone", "mysettings", "personal", "timezone", TimeZone.getDefault()),
    TIME_FORMAT("mysettings.personal.time-format", "mysettings", "personal", "time-format", TimeFormat.USE_12_HOURS),

    /**
     * General.
     */
    USER_ORIGINAL_AUDIO("mysettings.general.use-original-audio", "mysettings", "general", "use-original-audio", false),
    ADD_TO_GOOGLE_CALENDAR("mysettings.general.add-to-google-calendar", "mysettings", "general", "add-to-google-calendar", false),
    VIRTUAL_BACKGROUND("mysettings.general.virtual-background", "mysettings", "general", "virtual-background", false),

    /**
     * Meeting.
     */
    CHAT_NOTIFICATION("mysettings.meeting.chat-notification", "mysettings", "meeting", "chat-notification", false),
    JOIN_NOTIFICATION("mysettings.meeting.join-notification", "mysettings", "meeting", "join-notification", false),
    VIEW_VIDEO_MUTED_PARTICIPANTS("mysettings.meeting.view-video-muted-participants", "mysettings", "meeting", "view-video-muted-participants", false),
    DISPLAY_PARTICIPANT_NAME_ON_VIDEO("mysettings.meeting.display-a-participants-name-on-their-video", "mysettings", "meeting", "display-a-participant's-name-on-their-video", false),
    DEFAULT_DIAL_IN_COUNTRY("mysettings.meeting.default-dia-in-country", "mysettings", "meeting", "default-dia-in-country", "USA"),
    STOP_VIDEO_DURING_CONGESTION("mysettings.meeting.stop-video-during-congestion", "mysettings", "meeting", "stop-video-during-congestion", false),
    MUTE_PARTICIPANT_MIC_ON_ENTRY("mysettings.meeting.mute-participants-mic-on-entry", "mysettings", "meeting", "mute-participants-mic-on-entry", false),
    SCREEN_SHARE_FORMAT("mysettings.meeting.screen-share-format", "mysettings", "meeting", "screen-share-format", ScreenShareFormat.JPEG),
    END_OF_SESSION_NOTIFICATION("mysettings.meeting.end-of-session-notification", "mysettings", "meeting", "end-of-session-notification", false),

    /**
     * Webinar
     */
    CHAT_NOTIFICATION_WEBINAR("mysettings.webinar.chat-notification", "mysettings", "webinar", "chat-notification", false),
    VIEW_VIDEO_MUTED_USERS("mysettings.webinar.view-video-muted-users", "mysettings", "webinar", "view-video-muted-users", false),
    ALLOW_ANONYMOUS_QUESTIONS("mysettings.webinar.allow-anonymous-questions", "mysettings", "webinar", "allow-anonymous-questions", false),
    SIDE_BAR_AS_DEFAULT_VIEW("mysettings.webinar.sidebar-as-default-view", "mysettings", "webinar", "sidebar-as-default-view", false),
    ALLOW_EMOJI_REACTIONS("mysettings.webinar.allow-emoji-reactions", "mysettings", "webinar", "allow-emoji-reactions", false),
    LIVE_STREAMING_YOUTUBE("mysettings.webinar.live-streaming-on-youtube", "mysettings", "webinar", "live-streaming-on-youtube", false),
    ALLOW_DUPLICATE_ENTRIES("mysettings.webinar.allow-duplicate-entry", "mysettings", "webinar", "allow-duplicate-entry", false),
    NOTIFY_ORGANIZER_FOR_REGISTRATION("mysettings.webinar.notify-the-organizer-for-every-registration", "mysettings", "webinar", "notify-the-organizer-for-every-registration", false),
    ENABLE_PRACTICE_SESSION("mysettings.webinar.enable-practice-sessions-before-webinars", "mysettings", "webinar", "enable-practice-sessions-before-webinars", false),
    SHOW_QUESTIONS_ALL("mysettings.webinar.show-questions-to-all", "mysettings", "webinar", "show-questions-to-all", false),

    /**
     * Recording
     */
    AUTO_RECORD_MEETING("mysettings.recording.auto-record-meetings", "mysettings", "recording", "auto-record-meetings", false),
    RECORD_VIDEO_IN_MEETING("mysettings.recording.record-video-in-meetings", "mysettings", "recording", "record-video-in-meetings", false),
    AUTO_RECORD_WEBINARS("mysettings.recording.auto-record-webinars", "mysettings", "recording", "auto-record-webinars", false),
    RECORD_VIDEO_IN_WEBINAR("mysettings.recording.record-video-in-webinars", "mysettings", "recording", "record-video-in-webinars", false),
    AUTO_TRANSCRIPTION_FOR_MEETING_RECORDING("mysettings.recording.auto-transcription-for-meeting-recordings", "mysettings", "recording", "auto-transcription-for-meeting-recordings", false),
    AUTO_TRANSCRIPTION_FOR_WEBINAR_RECORDING("mysettings.recording.auto-transcription-for-webinar-recordings", "mysettings", "recording", "auto-transcription-for-webinar-recordings", false);



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
        USE_24_HOURS
    }

}