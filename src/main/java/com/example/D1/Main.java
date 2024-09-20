package com.example.D1;

import java.util.Scanner;

/*NOTE: The constructors in the task programs are not been teached, they are been created to be able to execute each program */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n-----       WELCOME TO THE DAY 1 OF IRONHACK    -----\n\n");
        System.out.print("Choose an option(1/4): ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                // In this exercise, you will write your own “Hello World” program in Java.
                new HelloWorld();
                break;

            case 2:
                // In this exercise, you will practice declaring and initializing variables in
                // Java.
                new Variables_and_data_types();
                System.out.println("No print  statement in this program, just internal executions");
                break;

            case 3:
                // In this exercise, you will implement conditional logic in Java to practice
                // using if, else, and switch statements.
                new ConditionalLogic(70, 3);
                break;

            case 4:
                // In this exercise, you will implement loops in Java to practice using for,
                // while, and do-while loops, as well as loop control mechanisms.
                new Loops();
                break;

            default:
                System.out.println("Invalid option");
                break;
        }

        System.out.println("\n\n-----      END OF THE PROGRAM    -----\n\n");
    }
}
