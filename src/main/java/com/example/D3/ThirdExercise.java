package com.example.D3;

public class ThirdExercise {
    ThirdExercise() {
        System.out.println("Multiplication: " + multiply(5, 45));
        System.out.println(greetUser("Sanobar Fatema"));
    }

    private static long multiply(int a, int b) {
        return a * b;
    }

    private static String greetUser(String username) {
        return "Hello, " + username + " !!";
    }
}
