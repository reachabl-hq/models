package com.reachabl.models.password;

public record UpdatePasswordRequest(String existingPassword, String newPassword) {
}
