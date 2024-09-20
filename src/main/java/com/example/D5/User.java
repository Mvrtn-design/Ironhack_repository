package com.example.D5;

public class User {
    private String username;
    private String password;
 
    public void register(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("User registered: " + username);
    }

    public String getUsername() {
        return username;
    }   
    
}
