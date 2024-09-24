package com.example.Week1.D3;

import java.util.ArrayList;
import java.util.Scanner;

// Start a new Java project and create a class called DataManipulationLab.
public class DataManipulationLab {

    // function that takes an array of integers as a parameter and returns the
    // maximum value in the array.
    private static long findMaximun(int[] arrayOfIntegers) {
        int max = arrayOfIntegers[0];
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] > max) {
                max = arrayOfIntegers[i];
            }
        }
        return max;
    }

    // function that takes a List<String> and a String as parameters and returns the
    // number of times the string appears in the list.
    @SuppressWarnings("unused")
    private int countOcurrences(ArrayList<String> lista, String buscado) {
        int count = 0;
        for (String s : lista) {
            if (s.equals(buscado)) {
                count++;
            }
        }
        return count;
    }

    // Step 4: Adjust the countOccurrences function to work with integers instead of
    // strings.
    private static int countOcurrences(ArrayList<Integer> lista, int buscado) {
        int count = 0;
        for (Integer s : lista) {
            if (s.equals(buscado)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Step 1: Create an array of integers with predefined values.
        int[] predefinedArray = { 12, 3, 456, 7, 7, 7, 7, 8, 90 };

        // Step 2: Use the findMaximum function to find and print the maximum value in
        // the array.
        System.out.println("--------   Implementing Functions for Data Manipulation    ----------\n\n");
        for (int i : predefinedArray) {
            System.out.print(i+" ");
        }
        System.out.println("\nMaximum Value: " + findMaximun(predefinedArray));

        // Step 3: Convert the array to a List<Integer>
        ArrayList<Integer> convertedFromList = new ArrayList<>();
        for (int aux : predefinedArray) {
            convertedFromList.add(aux);
        }

        // Step 5: Use the adjusted countOccurrences function to count how many times a
        // specific number (provided by the user) appears in the list.
        System.out.print("Number to count: ");
        int numberToCount = new Scanner(System.in).nextInt();

        // Step 6: Print the result of the count.
        System.out.println("Ocurrences: " + countOcurrences(convertedFromList, numberToCount));
    }
}
