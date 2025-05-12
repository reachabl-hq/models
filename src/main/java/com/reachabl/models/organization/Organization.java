package com.reachabl.models.organization;


import com.reachabl.models.profile.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("organization")
public class Organization {
    @Id
    private String id;

    private String name;

    private List<Profile> members;

    private Profile owner;

    private boolean defaultOrganization;


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

    public Profile getOwner() {
        return owner;
    }

    public void setOwner(Profile owner) {
        this.owner = owner;
    }

    public boolean isDefaultOrganization() {
        return defaultOrganization;
    }

    public void setDefaultOrganization(boolean defaultOrganization) {
        this.defaultOrganization = defaultOrganization;
    }
}
