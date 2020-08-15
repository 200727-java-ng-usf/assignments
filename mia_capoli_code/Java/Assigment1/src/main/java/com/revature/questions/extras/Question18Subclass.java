package com.revature.questions.extras;

import com.revature.questions.Question18Abst;

import java.util.Scanner;

public class Question18Subclass extends Question18Abst {

    public boolean checkUppercase() {
        //get a user string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String stringCheckUppercase = scanner.next();
        //check if the string contains uppercases by checking char value
        for (int i = 0; i < stringCheckUppercase.length(); i++) {
            char currentChar = stringCheckUppercase.charAt(i);
            if (64 <= currentChar && currentChar <= 90) {
                System.out.println(true);
                return true;
            }
        }
        //print result
        System.out.println(false);
        return false;
    }

    public String convertToLowercase() {
        //get a user string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String stringUppercase = scanner.next();
        //check if char is a string value and then put it to lowercase
        for (int i = 0; i < stringUppercase.length(); i++) {
            char currentChar = stringUppercase.charAt(i);
            if (64 <= currentChar && currentChar <= 90 || 97 <= currentChar && currentChar <= 122 ) {
                if (currentChar == stringUppercase.charAt(stringUppercase.length())) {
                    String stringNew = stringUppercase.toLowerCase();
                    System.out.println(stringNew);
                    return stringNew;
                }

            }
        }
        System.out.println(stringUppercase);
        return stringUppercase;
    }

    public int convertStringToInt() {
        //get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String stringForInt = scanner.next();
        //convert string to int
        int stringInt = Integer.parseInt(stringForInt);
        System.out.println(stringInt);
        return stringInt;
    }

}
