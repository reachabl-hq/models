package com.reachabl.models.profile;
import com.reachabl.models.user_status.UserStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDate;


@Document(indexName = "profiles")
public class ElasticUserProfile {
    @Id
    private String id;

    private String firstName;

    private String lastName;


    private String email;

    private String phoneNumber;

    private String imageUrl;

    private UserStatus userStatus;

    public ElasticUserProfile(String id) {
        this.id = id;
    }

    public ElasticUserProfile(String id, String firstName, String lastName,  String email, String phoneNumber, String imageUrl, UserStatus userStatus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.userStatus = userStatus;
    }

    public ElasticUserProfile() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }
}
