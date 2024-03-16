package com.example.booking.management.Services;

import com.example.booking.management.DTOs.RegistrationRequest;

public interface UserService {

    void registerUser(RegistrationRequest registrationRequest);

    boolean existsByEmail(String email);
}
