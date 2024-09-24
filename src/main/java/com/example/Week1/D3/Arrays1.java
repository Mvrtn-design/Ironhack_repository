package com.example.Week1.D3;

import java.util.ArrayList;

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
}
