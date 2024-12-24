package com.reachabl.models.chat;


import com.reachabl.models.profile.Profile;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class ChatRoomSubscription {

    @Reference
    @Indexed
    private Profile userProfile;

    @Reference
    private ChatMessage lastSeenMessage;

    private boolean blocked;

    private boolean muted;

    private int unreadCount; // New field

    public int getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(int unreadCount) {
        this.unreadCount = unreadCount;
    }

    public Profile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(Profile userProfile) {
        this.userProfile = userProfile;
    }

    public ChatMessage getLastSeenMessage() {
        return lastSeenMessage;
    }

    public void setLastSeenMessage(ChatMessage lastSeenMessage) {
        this.lastSeenMessage = lastSeenMessage;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }
}
