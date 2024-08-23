package com.reachabl.models.profile;


import com.reachabl.models.user.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "on_boarding")
public class OnBoarding {

    @Id
    private String id;

    @DBRef
    private User user;

    private Map<String, Object> onBoardingData;

    public OnBoarding() {
    }

    public OnBoarding(User user, Map<String, Object> json) {
        this.user = user;
        this.onBoardingData = json;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, Object> getOnBoardingData() {
        return onBoardingData;
    }

    public void setOnBoardingData(Map<String, Object> onBoardingData) {
        this.onBoardingData = onBoardingData;
    }

}
