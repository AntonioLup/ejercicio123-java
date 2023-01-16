package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class UserService  {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        System.out.println("notificacion");
        this.notificationService = notificationService;
    }
}
