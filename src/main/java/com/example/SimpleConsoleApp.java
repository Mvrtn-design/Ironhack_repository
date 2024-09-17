package com.example;

import java.util.Scanner;

public class SimpleConsoleApp {

    public static void Creator() {
        Scanner scan = new Scanner(System.in);

        // STEP 1 : ASKING FOR A NUMBER
        System.out.println("Enter a number between 1 and 10: ");

        int insertedNumber = Integer.parseInt(scan.nextLine());

        // STEP 2: CHECKING FOR A VALID NUMBER

        while (insertedNumber > 10 || insertedNumber <= 0) {
            System.out.println("Please enter a valid number between 1 and 10: ");
            insertedNumber = Integer.parseInt(scan.nextLine());
        }

        // STEP 3: CHECKING FOR AN ODD OR EVEN NUMBER

        if (insertedNumber % 2 == 0) {
            System.out.println("The number " + insertedNumber + " is even.");
        } else {
            System.out.println("The number " + insertedNumber + " is odd.");
        }

        // STEP 4: PRINTING ALL THE NUMBERS NOT DIVISIBLES BY 3
        for (int i = 0; i < insertedNumber; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.err.println(i + "\n");
        }

        // STEP 5: MESSAGE BASED ON THE NUMBER
        switch (insertedNumber) {
            case 1 -> System.err.println("You entered one!");
            case 2 -> System.err.println("You entered two!");
            case 3 -> System.err.println("You entered three!");
            case 4 -> System.err.println("You entered four!");
            case 7 -> System.err.println("You entered seven!");
            default -> System.err.println("You entered another number!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            Creator();
            System.err.println("Do you want to run the program again? (yes/no): ");
            answer = scan.nextLine();
            System.err.println(answer);
        } while (answer.toLowerCase().equals("yes"));
    }

}