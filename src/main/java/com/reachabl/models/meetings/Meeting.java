package com.reachabl.models.meetings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.reachabl.models.profile.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.*;
import java.util.List;

@Document("meetings")
public class Meeting {

    @Id
    private String id;

    private String topic;

    private String description;

    private MeetingType meetingType;

    private ZoneId zoneId ;

    private MeetingTime meetingTime;

    @DBRef
    private Profile creator;

    @DBRef
    private List<Profile> participants;

    private AbstractRecurringMeeting recurringMeeting;

    private Duration reminder;

    private List<String> files;

    private String roomCode ;

    public Meeting() {
    }

    public Meeting(String topic, String description, MeetingType meetingType, ZoneId zoneId, MeetingTime meetingTime, Profile creator, List<Profile> participants, AbstractRecurringMeeting recurringMeeting, Duration reminder, List<String> files,String roomCode ) {
        this.topic = topic;
        this.description = description;
        this.meetingType = meetingType;
        this.zoneId = zoneId;
        this.meetingTime = meetingTime;
        this.creator = creator;
        this.participants = participants;
        this.recurringMeeting = recurringMeeting;
        this.reminder = reminder;
        this.files = files;
        this.roomCode = roomCode;
    }


    public Meeting(Meeting source, LocalDate startDate) {
        this.id = source.getId();
        this.topic = source.topic;
        this.description = source.description;
        this.meetingType = source.meetingType;
        this.zoneId = source.zoneId;
        LocalDateTime startTime = startDate.atTime(source.meetingTime.startTime().toLocalTime());
        LocalDateTime endTime = startDate.atTime(source.meetingTime.endTime().toLocalTime().equals(LocalTime.MIDNIGHT) ? LocalTime.of(23,59,59) : source.meetingTime.endTime().toLocalTime() );
        this.meetingTime = new MeetingTime(startTime, endTime);
        this.creator = source.creator;
        this.participants = source.participants;
        this.recurringMeeting = source.recurringMeeting;
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
