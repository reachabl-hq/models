package com.reachabl.models.user_status;

public enum Availability {
    AVAILABLE("Available"),
    BUSY("Busy"),
    DO_NOT_DISTURB("Do Not Disturb"),
    ;

    private final String name;


    Availability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
