package com.reachabl.models.plan;

import org.springframework.data.annotation.Id;

import java.time.Duration;

public class Plan {

    @Id
    private String id;

    private String name;

    private boolean unlimitedMeeting;

    private Duration meetingDuration;

    private int maxAttendees;

    private boolean instantMeetings;

    private boolean MessagingAndChat;

    private boolean accessToMeetingAndWebinarGPT;

    private boolean screenShare;

    private boolean fileShare;

    private boolean addToCalendar;

    private boolean meetingWhiteBoarding;

    private boolean meetingRecording;

    private boolean priorityEmailSupport;

    private boolean isDefault;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isUnlimitedMeeting() {
        return unlimitedMeeting;
    }

    public void setUnlimitedMeeting(boolean unlimitedMeeting) {
        this.unlimitedMeeting = unlimitedMeeting;
    }

    public Duration getMeetingDuration() {
        return meetingDuration;
    }

    public void setMeetingDuration(Duration meetingDuration) {
        this.meetingDuration = meetingDuration;
    }

    public int getMaxAttendees() {
        return maxAttendees;
    }

    public void setMaxAttendees(int maxAttendees) {
        this.maxAttendees = maxAttendees;
    }

    public boolean isInstantMeetings() {
        return instantMeetings;
    }

    public void setInstantMeetings(boolean instantMeetings) {
        this.instantMeetings = instantMeetings;
    }

    public boolean isMessagingAndChat() {
        return MessagingAndChat;
    }

    public void setMessagingAndChat(boolean messagingAndChat) {
        MessagingAndChat = messagingAndChat;
    }

    public boolean isAccessToMeetingAndWebinarGPT() {
        return accessToMeetingAndWebinarGPT;
    }

    public void setAccessToMeetingAndWebinarGPT(boolean accessToMeetingAndWebinarGPT) {
        this.accessToMeetingAndWebinarGPT = accessToMeetingAndWebinarGPT;
    }

    public boolean isScreenShare() {
        return screenShare;
    }

    public void setScreenShare(boolean screenShare) {
        this.screenShare = screenShare;
    }

    public boolean isFileShare() {
        return fileShare;
    }

    public void setFileShare(boolean fileShare) {
        this.fileShare = fileShare;
    }

    public boolean isAddToCalendar() {
        return addToCalendar;
    }

    public void setAddToCalendar(boolean addToCalendar) {
        this.addToCalendar = addToCalendar;
    }

    public boolean isMeetingWhiteBoarding() {
        return meetingWhiteBoarding;
    }

    public void setMeetingWhiteBoarding(boolean meetingWhiteBoarding) {
        this.meetingWhiteBoarding = meetingWhiteBoarding;
    }

    public boolean isMeetingRecording() {
        return meetingRecording;
    }

    public void setMeetingRecording(boolean meetingRecording) {
        this.meetingRecording = meetingRecording;
    }

    public boolean isPriorityEmailSupport() {
        return priorityEmailSupport;
    }

    public void setPriorityEmailSupport(boolean priorityEmailSupport) {
        this.priorityEmailSupport = priorityEmailSupport;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
