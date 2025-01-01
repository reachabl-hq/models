package com.reachabl.models.chat;

import java.time.LocalDateTime;

public class ChatMessageDTO {
    private String id;
    private String body;
    private LocalDateTime date;
    private String attachmentUrl;
    private SenderDTO sender;

    // Getters and setters
    public static class SenderDTO {
        private String id;
        private String firstName;
        private String lastName;
        private String imageUrl;

        // Getters and setters
    }
}
