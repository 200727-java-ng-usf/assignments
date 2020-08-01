package com.revature;
import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        // take in a string value

        String str = "Hello";
        // print the length of the string
        System.out.println(str.length());

        // take in a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = scanner.nextLine();
        System.out.println("Number of characters in the string: " + str.length());

    }
}
