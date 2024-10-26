package com.reachabl.models.team;

import com.reachabl.models.profile.Profile;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Team {

    @Id
    private String id;

    private String name;

    private List<Profile> members;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Profile> getMembers() {
        return members;
    }

    public void setMembers(List<Profile> members) {
        this.members = members;
    }
}
