package com.reachabl.models.settings;

public enum ScreenShareFormat {
    JPEG("JPEG"),
    WEBRTC("WebRTC");

    private final String format;

    ScreenShareFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

}
