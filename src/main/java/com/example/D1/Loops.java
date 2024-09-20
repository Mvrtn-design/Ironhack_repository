package com.example.D1;

public class Loops {
    Loops() {
        // for loop that prints the numbers from 1 to 10.
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // while loop that prints the numbers from 10 down to 1.
        while (i > 0) {
            System.out.println("- " + i);
            i--;
        }

        // do-while loop that prints “Hello, World!” 5 times.
        do {
            System.out.println("Hello World!");
        } while (i <= 5);

        // for loop to iterate over numbers from 1 to 20, but skip numbers divisible by
        // 3 using the continue statement.
        for (int j = 1; j <= 20; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }

        // for loop to find the first number greater than 50 that is divisible by 7, and
        // exit the loop using the break statement once found.
        for (int j = 50; j % 7 == 0;) {
            System.out.println("\n---- " + j);
            break;
        }
    }
}
