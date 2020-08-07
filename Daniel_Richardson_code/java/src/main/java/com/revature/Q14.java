package com.revature;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q14 {
    //Write a program that demonstrates the switch case.
    //Implement the following functionalities in the cases:java
    //Case 1: Find the square root of a number using the Math class method.
    //Case 2: Display today’s date.
    //Case 3: Split the following string and store it in a string array.
    //               “I am learning Core Java”


    public static void caseSw(){
        Scanner scanner = new Scanner(System.in);
        int java = 0;
        double inputNum= 0;

        try {
            System.out.print("Enter java value: ");
            java = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("I can't let you do that, Dave.");
            caseSw();
        }

        switch(java){
            case 1:
                try {
                    System.out.print("Enter sqrt input: ");
                    inputNum = scanner.nextDouble();
                }
                catch(InputMismatchException e){
                    System.out.println("I can't let you do that, Dave.");
                    caseSw();
                }
                System.out.println(Math.sqrt(inputNum));
                break;

            case 2:
                Date today = new Date();
                System.out.println(today);
                break;
            case 3:
                try {
                    scanner.nextLine(); //fascinating debug stuff
                    //apparently an open scanner that had handled a previous int
                    //still needed to 'consume' a /n line
                    //so i needed to sate it with this call
                    //otherwise, it would skip the inputStr call before inputs could be made


                    System.out.print("Enter string: ");
                    String inputStr = "";
                    inputStr += scanner.nextLine();
                    String[] inputStrArr = inputStr.split(" ");
                    //making array out of string from splitting
                    for (String element : inputStrArr){
                        System.out.println(element);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("I can't let you do that, Dave.");
                    caseSw();
                }

                break;
            default:
                if (java > 3) {
                    System.out.println("No.");
                    caseSw();
                }
                break;
        }
        scanner.close();
    }

}
