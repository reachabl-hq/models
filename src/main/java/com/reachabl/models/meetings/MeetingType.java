package com.reachabl.models.meetings;

public enum MeetingType {
    VIDEO_CONFERENCING("Video Conferencing"),
    AUDIO_CONFERENCING("Audio Conferencing");

    private final String name;


    MeetingType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
