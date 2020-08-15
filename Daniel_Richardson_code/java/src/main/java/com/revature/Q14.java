package com.revature;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.revature.AppDriver.defaults;

public class Q14 {
    //Write a program that demonstrates the switch case.
    //Implement the following functionalities in the cases:java
    //Case 1: Find the square root of a number using the Math class method.
    //Case 2: Display today’s date.
    //Case 3: Split the following string and store it in a string array.
    //               “I am learning Core Java”


    public Q14(){
        caseSwSelector(); //calls caseSwitch from method, to handle defaults setting
    }

    public void caseSwSelector() {
        InputHandler input = InputHandler.getInstance();
        int java = 0;
        if (!defaults) {
            System.out.println("Requires choice for case switch (1,2,3).");
            while (java < 1 || java > 3) {
                java = input.intInput();
                if (java < 1 || java > 3) {
                    System.out.println("No.");
                }
            }
            caseSwitch(java);
        } else {
            //will execute each case statement
            caseSwitch(1);
            caseSwitch(2);
            caseSwitch(3);
        }

    }
    public void caseSwitch(int java){
        InputHandler input = InputHandler.getInstance();
        switch(java){
            case 1:
                double d;
                if(!defaults){
                    System.out.print("Requires double for square root.");
                     d = input.doubleInput();
                } else {
                    d = 99;
                }
                d = Math.sqrt(d);
                System.out.println(d);
                break;

            case 2:
                Date today = new Date();
                System.out.println(today);
                break;
            case 3:
                String str;
                if(!defaults){
                    System.out.println("Requires a phrase of words.");
                    str = input.strInput();
                } else {
                    str = "I Am Learning Core Java";
                }
                String[] inputStrArr = str.split(" ");
                for (String element : inputStrArr){
                    System.out.println(element);
                }
                break;
        }
    }
}
