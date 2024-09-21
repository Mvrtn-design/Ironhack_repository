package com.example.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Aditional {
    Aditional() {
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
}
