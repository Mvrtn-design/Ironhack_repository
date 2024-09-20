package com.example.D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    Arrays1() {
        // Initializes an array of integers and calculates the sum of all elements.
        int arrayLenght = 5;
        long wholeSum = 0;
        int[] numeritos = new int[arrayLenght];
        System.out.println("- Number of elements: " + arrayLenght);

        for (int i = 0; i < numeritos.length; i++) {
            numeritos[i] = (int) (Math.random() * ((20 - 1) + 1));
            System.out.println(numeritos[i]);
            wholeSum += numeritos[i];
        }
        System.out.println("- Sum of the elements: " + wholeSum);


        // Creates a list of strings, adds several elements, and removes one element.
        ArrayList<String> misStrings = new ArrayList<>();
        misStrings.add("firstString");
        misStrings.add("secondString");
        misStrings.add("thirdString");
        misStrings.remove("firstString");
        misStrings.remove(0); // I just should have the thridString


        // Iterates over both the array and the list to print their contents.
        System.out.println("- String elements: ");
        for (String string : misStrings) {
            System.out.println(string);
        }
    }

    

    private static long multiply(int a, int b) {
        return a * b;
    }

    private static String greetUser(String username) {
        return "Hello, " + username + " !!";
    }

    public static void thirdExercise() {
        System.out.println("Multiplication: " + multiply(5, 45));
        System.out.println(greetUser("Sanobar Fatema"));
    }

    private static int minElement(int[] sortedList) {
        return sortedList[0];
    }

    private static int maxElement(int[] sortedList) {
        return sortedList[sortedList.length - 1];
    }

    private static String elementFound(int[] sortedList, int indexToFind) {
        if (indexToFind >= 0 && indexToFind < sortedList.length) {
            return "- The element  at index " + indexToFind + " is: " + sortedList[indexToFind];
        }
        return "- ERROR: There is no  element at the index you  are looking for";
    }

    public static void additionalOne() {

        // 1) Initialize a List that takes in numbers.
        int numeros[] = new int[5];

        // 2) Ask the user to input numbers into the List using Scanner method.
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Input a number for the " + (i) + " position");
            numeros[i] = scanner.nextInt();
        }

        // 3) Sort the List
        Arrays.sort(numeros);
        System.out.print("- List after sort: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // 4) Create methods getMin() and getMax() to find the smallest and largest
        // number in the List
        System.out.println("- Lowest element: " + minElement(numeros));
        System.out.println("- Highest element: " + maxElement(numeros));

        // 5) Ask the user to input the element to be searched
        System.out.println("Enter the element to be searched (there are " + numeros.length + " numbers)");
        int searchElement = scanner.nextInt();

        // 6) Create a method elementFound() to find the position of the element in the
        // List by using search method.
        System.out.println(elementFound(numeros, searchElement));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean correctOption;

        System.out.println("Welcome to the day 3 Ironhack lesson");
        do {
            correctOption = true;// by default
            System.out.println("\n\nChoose an exercise to run (1 to 4) (for aditional exercise press 0): ");
            int exercise = scan.nextInt();
            switch (exercise) {
                
                case 3:
                    thirdExercise();
                    break;
                case 4:
                    exercise4 o = new exercise4();
                    o.runFourthExercise();
                    break;
                case 0:
                    additionalOne();
                    break;

                default:
                    System.out.println("Wrong option");
                    correctOption = false;
                    break;
            }
        } while (!correctOption);
        System.out.println("\n\nBye !!");
    }
}
