package com.example;

import java.util.ArrayList;

public class exercise4 {

    exercise4(){
    }
    private static double calculateArea(double lenghtParametre, double widthParametre) {
        return lenghtParametre * widthParametre;
    }

    private static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static void swap(int[] twoIntegersArray) {
        int aux = twoIntegersArray[0];
        twoIntegersArray[0] = twoIntegersArray[1];
        twoIntegersArray[1] = aux;
    }

    public void runFourthExercise() {
        System.out.println("----    Exercise 4    -----\n\n");
        System.out.println("Area of rectangle: " + calculateArea(123, 456));
        System.out.println("Full name: " + getFullName("Sanobar", "Fatema"));
        int[] littleArray = { 123, 456 };
        System.out.println("Pre swapping values: " + littleArray[0] + " " + littleArray[1]);
        swap(littleArray);
        System.out.println("Post swapping values: " + littleArray[0] + " " + littleArray[1]);
    }

}
