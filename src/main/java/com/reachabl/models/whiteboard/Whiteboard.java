package com.reachabl.models.whiteboard;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.reachabl.models.profile.Profile;
import com.reachabl.models.user.User;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Document("whiteboard")
public class Whiteboard {

    @Id
    private String id;

    @DBRef
    private Profile creator;

    @DBRef
    private Set<Profile> members;

    private String title;

    private String inviteMessage;


    private Map<String, Object> snapShot;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private boolean active;

    public Whiteboard() {
    }

    public Whiteboard(Set<Profile> members, String title, String inviteMessage, Map<String, Object> snapShot) {
        this.members = members;
        this.title = title;
        this.inviteMessage = inviteMessage;
        this.snapShot = snapShot;
    }

    public Whiteboard(String id, Profile creator, Set<Profile> members, String title, String inviteMessage, Map<String, Object> snapShot) {
        this.id = id;
        this.creator = creator;
        this.members = members;
        this.title = title;
        this.inviteMessage = inviteMessage;
        this.snapShot = snapShot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Profile getCreator() {
        return creator;
    }

    public void setCreator(Profile creator) {
        this.creator = creator;
    }

    public Set<Profile> getMembers() {
        return members;
    }

    public void setMembers(Set<Profile> members) {
        this.members = members;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInviteMessage() {
        return inviteMessage;
    }

    public void setInviteMessage(String inviteMessage) {
        this.inviteMessage = inviteMessage;
    }

    public Map<String, Object> getSnapShot() {
        return snapShot;
    }

    public void setSnapShot(Map<String, Object> snapShot) {
        this.snapShot = snapShot;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
