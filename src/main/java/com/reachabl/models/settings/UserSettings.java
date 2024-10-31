package com.reachabl.models.settings;


import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.Map;

public class UserSettings {
    @Id
    private String id;
    private String userId;
    private String global;
    private Map<String, String> scoped = HashMap.newHashMap(128);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGlobal() {
        return global;
    }

    public void setGlobal(String global) {
        this.global = global;
    }

    public Map<String, String> getScoped() {
        return scoped;
    }

    public void setScoped(Map<String, String> scoped) {
        this.scoped = scoped;
    }
}
