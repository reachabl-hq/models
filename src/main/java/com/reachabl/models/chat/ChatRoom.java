package com.reachabl.models.chat;

import com.reachabl.models.profile.Profile;
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

    @DBRef
    private Profile creator;

    @Transient
    private boolean unread;

    private String channelName;

    private boolean direct;

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

    public Profile getCreator() {
        return creator;
    }

    public void setCreator(Profile creator) {
        this.creator = creator;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public boolean isDirect() {
        return direct;
    }

    public void setDirect(boolean direct) {
        this.direct = direct;
    }
}
