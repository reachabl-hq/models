package com.reachabl.models.webinar;


import com.reachabl.models.profile.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.*;
import java.util.List;

@Document("webinars")
public class Webinar {

    @Id
    private String id;

    private String topic;

    private String description;


    private ZoneId zoneId ;

    private LocalDateTime webinarStartTime;

    @DBRef
    private Profile creator;

    private AbstractRecurringWebinar recurringWebinar;

    private Duration reminder;

    private List<String> files;

    private String roomCode ;

    public Webinar() {
    }

    public Webinar(String topic, String description, ZoneId zoneId,  Profile creator, AbstractRecurringWebinar recurringWebinar, Duration reminder, List<String> files,String roomCode ) {
        this.topic = topic;
        this.description = description;
        this.zoneId = zoneId;
        this.creator = creator;
        this.recurringWebinar = recurringWebinar;
        this.reminder = reminder;
        this.files = files;
        this.roomCode = roomCode;
    }


    public Webinar(com.reachabl.models.webinar.Webinar source ,LocalDate webinarStartTime) {
        this.id = source.getId();
        this.topic = source.topic;
        this.description = source.description;
        this.zoneId = source.zoneId;
        this.webinarStartTime = webinarStartTime.atTime(source.webinarStartTime.getHour(),source.webinarStartTime.getMinute());
        this.creator = source.creator;
        this.recurringWebinar = source.recurringWebinar;
        this.reminder = source.reminder;
        this.files = source.files;
        this.roomCode = source.roomCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }


    public Profile getCreator() {
        return creator;
    }

    public void setCreator(Profile creator) {
        this.creator = creator;
    }



    public Duration getReminder() {
        return reminder;
    }

    public void setReminder(Duration reminder) {
        this.reminder = reminder;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }


    public LocalDateTime getWebinarStartTime() {
        return webinarStartTime;
    }

    public void setWebinarStartTime(LocalDateTime webinarStartTime) {
        this.webinarStartTime = webinarStartTime;
    }

    public AbstractRecurringWebinar getRecurringWebinar() {
        return recurringWebinar;
    }

    public void setRecurringWebinar(AbstractRecurringWebinar recurringWebinar) {
        this.recurringWebinar = recurringWebinar;
    }
}

