package com.reachabl.models.team;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class TeamInvitation {

    @Id
    private String id;

    @NotBlank
    private String teamId;

    @NotBlank
    private LocalDateTime expiryDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotBlank String getTeamId() {
        return teamId;
    }

    public void setTeamId(@NotBlank String teamId) {
        this.teamId = teamId;
    }

    public @NotBlank LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(@NotBlank LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }
}
