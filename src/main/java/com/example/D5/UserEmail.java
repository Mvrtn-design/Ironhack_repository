package com.example.D5;

public class UserEmail  extends User{
    
    public void sendWelcomeEmail() {
        System.out.println("Welcome email sent to: " + getUsername());
    }
}
