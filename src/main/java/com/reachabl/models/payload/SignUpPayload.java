package com.reachabl.models.payload;

public class SignUpPayload {
    private String userName;

    private String password;

    public SignUpPayload(String email, String password) {
        this.userName = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
