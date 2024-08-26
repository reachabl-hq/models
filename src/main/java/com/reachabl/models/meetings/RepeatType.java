package com.reachabl.models.meetings;

public enum RepeatType {
    DAILY("Daily"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly");

    private final String name;


    RepeatType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
