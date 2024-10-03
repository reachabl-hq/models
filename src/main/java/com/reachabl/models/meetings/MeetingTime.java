package com.reachabl.models.meetings;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalTime;

public record MeetingTime( @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss") LocalTime startTime,
                           @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss") LocalTime endTime
) {
    public MeetingTime {
        if (startTime.isAfter(endTime)) {
            throw new IllegalArgumentException("Start time must be before end time.");
        }
    }
}