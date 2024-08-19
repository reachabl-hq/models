package com.reachabl.models.user_status;

public enum WorkLocation {
    OFFICE("Office"),
    REMOTE("Remote"),
    TURN_OFF("Turn Off");

    private final String name;


    WorkLocation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
