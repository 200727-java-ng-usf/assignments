package com.revature.questions.extras;

import com.revature.questions.Question18;

import java.util.Scanner;

public class Question18Subclass extends Question18 {

    public boolean checkUppercase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String stringCheckUppercase = scanner.next();
        for (int i = 0; i < stringCheckUppercase.length(); i++) {
            char currentChar = stringCheckUppercase.charAt(i);
            if (64 <= currentChar && currentChar <= 90) {
                return true;
            }
        }
        return false;
    }

    public String convertToLowercase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String stringUppercase = scanner.next();
        String stringNew = stringUppercase.toLowerCase();

        return stringNew;
    }

    public int convertStringToInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");

        Integer stringInt = null;
        try {
            String stringForInt = scanner.next();
            stringInt = Integer.parseInt(stringForInt);
            return stringInt;
        } catch (Exception e) {
            System.out.println("Something went wrong....");
        }
        return stringInt + 10;
    }

}
