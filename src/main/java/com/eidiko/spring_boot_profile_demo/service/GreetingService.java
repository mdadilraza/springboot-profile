package com.eidiko.spring_boot_profile_demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${app.message}")
    private String message;

    public String getGreetingMessage() {
        return message;
    }
}
