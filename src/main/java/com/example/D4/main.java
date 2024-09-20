package com.example.D4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class main {

    /*
     * ADITIONAL EXERCISE
     * 
     * Using the BigDecimal documentation, create a method that accepts a BigDecimal
     * and returns a double of the BigDecimal number rounded to the nearest
     * hundredth.
     * For example, 4.2545 should return 4.25.
     * 
     * Using the BigDecimal documentation, create a method that accepts a
     * BigDecimal, reverses the sign (if the parameter is positive, the result
     * should be negative and vice versa),
     * rounds the number to the nearest tenth and returns the result.
     * For example, 1.2345 should return -1.2 and -45.67 should return 45.7.
     */

    public static double bigDecimalToDouble(BigDecimal bigDecimalNumber) {
        return bigDecimalNumber.setScale(2, RoundingMode.FLOOR).doubleValue();
    }

    public static BigDecimal bigDecimaltoNegativeDouble(BigDecimal bigDecimalNumber) {
        return bigDecimalNumber.negate().setScale(1, RoundingMode.FLOOR);
    }

    static Book_exc_1 myBook;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n-----       WELCOME TO THE LAB 5 OF IRONHACK    -----\n\n");
        System.out.print("Choose an option(1/5) press 0 to the optional: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                myBook = new Book_exc_1("My first book", "Martin Miami", 123);
                myBook.readBook();
                break;

            case 2:
                myBook = new Book_exc_1("My second book", "Martin Miami", 123);
                myBook.readBook();
                break;

            case 3:
                Student_exc_3 estudiante = new Student_exc_3("Sanobaer Fatema", 23, "A00000123");
                System.out.println(estudiante.toString());
                break;

            case 4:
                WashingMachine myMachine = new WashingMachine();
                myMachine.turnOn();
                myMachine.turnOff();
                myMachine.plugIn();
                myMachine.unplug();
                break;

            case 5:
                Book libro1 = new Book("titulo", "Lucas", 1233, "4J54354J5", "MALE");
                DVD miDVD = new DVD("titulo2", "autor2", 1434, 32.32, 3);
                Magazine miRevista = new Magazine("titulo3", "autor43", 1988, 234, 2);
                Library myLibrary = new Library();
                myLibrary.addItem(miRevista);
                myLibrary.addItem(libro1);
                myLibrary.addItem(miDVD);
                myLibrary.displayItems();
                myLibrary.removeItem(miRevista);
                System.out.println("    TRAS  ELIMINAR LA REVISTA   \n");
                myLibrary.displayItems();
                break;

            case 0:
                BigDecimal myInteger = new BigDecimal("11111.1111111111111111111111111111");
                System.out.println("The double is " + bigDecimalToDouble(myInteger) + " and the negative version is: "
                        + bigDecimaltoNegativeDouble(myInteger));
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println("\n\n-----      END OF THE PROGRAM    -----\n\n");
    }
}