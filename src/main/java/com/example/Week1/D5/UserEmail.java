package com.example.Week1.D5;

public class UserEmail  extends User{
    
    public void sendWelcomeEmail() {
        System.out.println("Welcome email sent to: " + getUsername());
    }
}
