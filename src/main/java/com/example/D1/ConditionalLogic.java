package com.example.D1;

public class ConditionalLogic {
    ConditionalLogic(int score, int day) {
        /*
         * program that assigns an integer value to a variable score and uses if, else
         * if, and else statements to print:
         * 
         * “Excellent” if score is greater than 90.
         * “Good” if score is between 75 and 90.
         * “Needs Improvement” if score is less than 75.
         */
        if (score > 90) {
            System.out.println("Excellent");
        } else if (90 > score && score > 75) {
            System.out.println("Good");
        } else {
            System.out.println("Need Improvement");
        }

        // switch statement to print the day of the week based on an integer variable
        // day with values from 1 to 7, where 1 represents “Monday” and 7 represents
        // “Sunday”.
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

}
