package com.reachabl.models.chat;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document()
public class ChatRoom {

    @Id
    private String id;

    private List<ChatRoomSubscription> members;

    @DBRef
    private ChatMessage last;

    @Transient
    private boolean unread;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ChatRoomSubscription> getMembers() {
        return members;
    }

    public void setMembers(List<ChatRoomSubscription> members) {
        this.members = members;
    }

    public ChatMessage getLast() {
        return last;
    }

    public void setLast(ChatMessage last) {
        this.last = last;
    }

    public boolean getUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }
}
