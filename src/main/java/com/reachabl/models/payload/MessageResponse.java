package com.reachabl.models.payload;

public class MessageResponse {
    private boolean isFilled;
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public MessageResponse(boolean isFilled, String message) {
        this.isFilled = isFilled;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}
