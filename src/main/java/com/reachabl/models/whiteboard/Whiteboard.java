package com.reachabl.models.whiteboard;

import com.reachabl.models.user.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import java.util.Set;

@Document("whiteboard")
public class Whiteboard {

    @Id
    private String id;

    @DBRef
    private User creator;

    @DBRef
    private Set<User> members;

    private String title;

    private String inviteMessage;

    private Map<String, Object> snapShot;

    public Whiteboard() {
    }

    public Whiteboard(Set<User> members, String title, String inviteMessage, Map<String, Object> snapShot) {
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

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Set<User> getMembers() {
        return members;
    }

    public void setMembers(Set<User> members) {
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
}
