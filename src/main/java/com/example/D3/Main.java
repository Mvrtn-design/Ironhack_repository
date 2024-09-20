package com.example.D3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n-----       WELCOME TO THE DAY 3 OF IRONHACK    -----\n\n");
        System.out.print("Choose an option(1/4): ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
            // In this exercise, you will practice working with arrays and lists in Java.
                new Arrays1();
                break;

            case 2:
                
                break;

            case 3:
          
                break;

            case 4:
                
                break;

            default:
                System.out.println("Invalid option");
                break;
        }

        System.out.println("\n\n-----      END OF THE PROGRAM    -----\n\n");
    }
    
}
