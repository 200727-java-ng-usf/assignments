package com.revature;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q18Main extends Q18AbstractSuperClass{


    public Q18Main() {
        super();
    }

    @Override
    public void upperCaseMethod(String upperCase) {

        boolean temp = false;
        char[] charArray = upperCase.toCharArray();

        for (char stringChar : charArray) {

            if (Character.isUpperCase(stringChar)) {
                temp = true;
            }
        }
        System.out.println("Are there uppercase characters: " + temp);
        System.out.println("+------------------------------------------------+");
    }

    @Override
    public void lowerToUpperMethod(String lowerToUpper) {
        char[] stringChars = lowerToUpper.toCharArray();
        char[] results = new char[lowerToUpper.length()];

        for (int i = 0; i < lowerToUpper.length(); i++) {

            if (Character.isLowerCase(stringChars[i])) {
                results[i] = Character.toUpperCase(stringChars[i]);
            } else
                results[i] = stringChars[i];
        }
        System.out.println(results);
        System.out.println("+------------------------------------------------+");

    }

    @Override
    public void stringToIntegerPlus10Method(String stringToIntegerPlus10) {
        System.out.println("The value of " + stringToIntegerPlus10 + " plus 10 is: " +
                (Integer.parseInt(stringToIntegerPlus10) + 10));
        System.out.println("+------------------------------------------------+");
    }

    public static void main(String[] args) {

        Q18Main object = new Q18Main();
        Scanner input = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("Enter a String to check if it has upperCase letters.");
                object.upperCaseMethod(input.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong...");
                //e.printStackTrace();
            }
        }

        while (true) {
            try {
                System.out.println("Enter a String to convert to upperCase.");
                object.lowerToUpperMethod(input.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong...");
                //e.printStackTrace();
            }
        }

        while (true) {
            try {
                object.stringToIntegerPlus10Method(input.nextLine());
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                //e.printStackTrace();
                System.out.println("Please enter a number of String object.");
            }
        }





    }
}
