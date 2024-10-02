package com.reachabl.models.meetings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.reachabl.models.profile.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Document("meetings")
public class Meeting {

    @Id
    private String id;

    private String topic;

    private String description;

    private MeetingType meetingType;

    private ZoneId zoneId ;

    private Date time;

    private MeetingTime meetingTime;

    @DBRef
    private Profile creator;

    @DBRef
    private List<Profile> participants;

    @JsonProperty(required = false)
    private AbstractRecurringMeeting recurringMeeting;

    private Duration reminder;

    @JsonProperty(required = false)
    private List<String> files;

    private String roomCode ;

    public Meeting() {
    }

    public Meeting(String topic, String description, MeetingType meetingType, ZoneId zoneId, Date time, MeetingTime meetingTime, Profile creator, List<Profile> participants, AbstractRecurringMeeting recurringMeeting, Duration reminder, List<String> files,String roomCode ) {
        this.topic = topic;
        this.description = description;
        this.meetingType = meetingType;
        this.zoneId = zoneId;
        this.time = time;
        this.meetingTime = meetingTime;
        this.creator = creator;
        this.participants = participants;
        this.recurringMeeting = recurringMeeting;
        this.reminder = reminder;
        this.files = files;
        this.roomCode = roomCode;
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

    public MeetingType getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(MeetingType meetingType) {
        this.meetingType = meetingType;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public MeetingTime getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(MeetingTime meetingTime) {
        this.meetingTime = meetingTime;
    }

    public Profile getCreator() {
        return creator;
    }

    public void setCreator(Profile creator) {
        this.creator = creator;
    }

    public List<Profile> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Profile> participants) {
        this.participants = participants;
    }

    public AbstractRecurringMeeting getRecurringMeeting() {
        return recurringMeeting;
    }

    public void setRecurringMeeting(AbstractRecurringMeeting recurringMeeting) {
        this.recurringMeeting = recurringMeeting;
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
}
