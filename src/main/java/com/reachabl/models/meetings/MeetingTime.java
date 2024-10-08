package com.reachabl.models.meetings;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record MeetingTime( @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime startTime,
                           @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime endTime
) {
    public MeetingTime {
        if (startTime.isAfter(endTime)) {
            throw new IllegalArgumentException("Start time must be before end time.");
        }
    }
}