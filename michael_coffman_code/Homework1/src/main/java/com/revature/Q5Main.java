package com.revature;

// Importing Scanner
import java.util.Scanner;

public class Q5Main {

    private static void answer() {

        // Instantiating the input object for the String and Int
        Scanner input = new Scanner(System.in);

        // Instantiating variables from user input
        System.out.println("Enter a String.");
        String str = input.nextLine();
        char[] temp = str.toCharArray();
        String result = "";

        System.out.println("+-------------------+");

        System.out.println("Enter an integer.");
        int idx = input.nextInt();

        // Closing the Scanner object
        input.close();

        System.out.println("+-------------------+");

        // for loop to take char[] indices and add them to the empty String result
        for (int i = 0; i < idx; i++) {
            result += temp[i];
        }

        System.out.println(result);

    }








    public static void main(String[] args) {
        answer();

    }
}