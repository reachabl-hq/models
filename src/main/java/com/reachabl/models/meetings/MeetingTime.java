package com.reachabl.models.meetings;

import java.time.LocalTime;

public record MeetingTime(LocalTime startTime, LocalTime endTime) {
    public MeetingTime {
        if (startTime.isAfter(endTime)) {
            throw new IllegalArgumentException("Start time must be before end time.");
        }
    }
}