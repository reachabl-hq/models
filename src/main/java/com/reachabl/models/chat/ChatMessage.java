package com.reachabl.models.chat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.reachabl.models.profile.Profile;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Document()
public class ChatMessage {

    private String id;

    private String body;

    @Reference
    @Indexed
    private Profile sender;

    @DBRef(lazy = true)
    @JsonIgnore
    private ChatRoom chatRoom;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Profile getSender() {
        return sender;
    }

    public void setSender(Profile sender) {
        this.sender = sender;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public LocalDateTime getDate() {
        return LocalDateTime.ofInstant(new ObjectId(id).getDate().toInstant(), ZoneId.systemDefault());
    }
}
