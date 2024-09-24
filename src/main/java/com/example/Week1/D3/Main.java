package com.example.Week1.D3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean correctOption;

        do {
            correctOption = true;// opcion por defecto
            System.out.println("\n\n-----       WELCOME TO THE DAY 3 OF IRONHACK    -----\n\n");
            System.out.print("Choose an option(1/4) or 0 for the additional one: ");
            int exercise = scan.nextInt();
            switch (exercise) {
                case 1:
                    // practice working with arrays and lists in Java.
                    new Arrays1();
                    break;

                case 2:
                    // Apply the operations learned to manipulate arrays and lists in Java.
                    new Operations_and_DataStructures(23, "Hello");
                    break;

                case 3:
                    new ThirdExercise();
                    break;

                case 4:
                    new exercise4();
                    break;
                case 0:
                    new Aditional();
                    break;

                default:
                    System.out.println("Wrong option");
                    correctOption = false;
                    break;
            }
        } while (!correctOption);
        System.out.println("\n\n-----      END OF THE PROGRAM    -----\n\n");
    }

}
