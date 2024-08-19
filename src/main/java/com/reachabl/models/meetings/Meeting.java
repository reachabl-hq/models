package com.reachabl.models.meetings;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.ZoneId;

@Document("meetings")
public class Meeting {

    @Id
    private String id;

    private String topic;

    private String description;

    private MeetingType meetingType;

    private ZoneId zoneId;

    private LocalDate time;

    private MeetingTime meetingTime;


}
