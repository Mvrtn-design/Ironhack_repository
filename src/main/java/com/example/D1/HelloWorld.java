package com.example.D1;

import java.util.Scanner;

public class HelloWorld {

    public static void helloWorldPrinter() {
        System.out.println("Hello World 2");
    }

    public HelloWorld() {

        // Write a “Hello World” program in Java.
        System.out.println("Hello World");

        // Modify the program to include a function that prints “Hello, World!” when
        // called.
        helloWorldPrinter();

        // Enhance the program to prompt the user for their name and print a
        // personalized greeting.
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
    }
}
