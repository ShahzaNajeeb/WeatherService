package com.example.weather_project.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class NotificationService {
    public String sendAlert(String message) {
        return "Notification sent: " + message;
    }
}
