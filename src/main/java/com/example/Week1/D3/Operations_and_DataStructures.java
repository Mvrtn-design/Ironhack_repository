package com.example.Week1.D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Operations_and_DataStructures {
    Operations_and_DataStructures(int wantedNumber, String wantedString) {
        // Create an array of integers
        int[] array = { 1344, 23, 3, 455, 35 };

        // Iterate through the array and print each element.
        System.out.println("Array: " + Arrays.toString(array));

        // Sort the array in ascending order and print the sorted array.
        System.out.println("array sorted in ascending order: " + Arrays.toString(array));

        // Search for a specific value in the array and print its index.
        System.out.println("Index of a search for the " + wantedNumber + " value in the array: "
                + Arrays.binarySearch(array, wantedNumber));

        // Create a list of strings
        ArrayList<String> listaStrings = new ArrayList<>();

        // Add several elements to the list and iterate through it, printing each
        // element.
        listaStrings.add("Hello");
        listaStrings.add("World");
        listaStrings.add("Java");
        listaStrings.add("Python");
        listaStrings.add("C++");
        for (String string : listaStrings) {
            System.out.println(string);
        }

        // Sort the list alphabetically and print the sorted list.
        Collections.sort(listaStrings);
        System.out.println("Sorted list: " + listaStrings);

        // Search for a specific string in the list and print its index.
        System.out.println("Index of a search for the " + wantedNumber + " value in the array: "
                + Arrays.binarySearch(array, wantedNumber));

    }
}
