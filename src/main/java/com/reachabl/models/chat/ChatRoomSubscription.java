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
}
