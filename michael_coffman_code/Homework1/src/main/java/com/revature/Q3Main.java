package com.revature;

// Importing the input Scanner
import java.util.Scanner;

public class Q3Main {

    private static void answer() {

        // Declaring the Scanner object 'Input'
        Scanner input = new Scanner(System.in);

        // Using the input object to accept the next user String
        System.out.println("Enter String to be reversed.");
        String randomString = input.nextLine();
        String reverseString = "";

        // Closing the input object
        input.close();

        for (int i = randomString.length() - 1; i >= 0; i--) {
            reverseString += randomString.charAt(i);
        }

        System.out.println(reverseString);

    }


    public static void main(String[] args) {
        answer();
    }
}