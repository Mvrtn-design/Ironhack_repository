package com.example.Week1.D1;

public class Variables_and_data_types {

    Variables_and_data_types() {
        /*
         * Declare and initialize the following variables in Java:
         * 
         * - An integer age with the value 25.
         * - A double temperature with the value 36.6.
         * - A string message with the value “Welcome to Programming!”
         */
        int age = 25;
        double temperature = 36.6;
        String message = "Welcome to Programming";

        /*
         * Perform the following operations:
         * 
         * - Add 5 to age and store the result in a new variable newAge.
         * - Divide temperature by 2 and store the result in halfTemperature.
         * - Concatenate message with " Let's start coding!" and store it in newMessage.
         */
        int newAge = age + 5;
        double halfTemperature = temperature / 2;
        String newMessage = message + " " + "Let´s start coding";

        // Type Conversion Task
        String ageString = message + "You are  " + age + " years old";

        //Handling Large Numbers
        long largeNumber = 10000000000L;
        long updatedNumber = largeNumber + 5000000000L;
    }

}