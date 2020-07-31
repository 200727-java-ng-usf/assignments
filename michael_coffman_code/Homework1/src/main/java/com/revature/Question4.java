package com.revature;

import java.util.Scanner;

public class Question4 {

    private static void answer() {

        // Must make a scanner object to accept input.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 'N' to have its factorial computed.");
        System.out.println("+--------------------------------+");

        // Uses the scanner object to take input and assign it to the 'n' variable.
        // We aren't closing the input yet, so we can continue input in case of n=0, -x
        // I chose long type because factorials can get quite big.

        long n = input.nextInt();

        //-------------------------------------------------------------------------

        // n < 1 is a fail safe in case the user enters a 0
        // or negative int
        if (n < 1) {
            System.out.println("Please enter a number equal to 1 or higher.");
            answer();
        }

        // Will execute on n >= 1
        else {
            for (long i = n - 1; i > 1; i--) {
                n *= i;
            }

            // Closing out the input object and printing n
            input.close();
            System.out.println(n);
        }

        //---------------------------------------------------------------------------
    }


    public static void main(String[] args) {
        answer();

    }
}
