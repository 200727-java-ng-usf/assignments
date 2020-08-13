package com.revature.questions;

import java.lang.reflect.Array;
import java.time.LocalDate;

/*
    Q14. Write a program that demonstrates the switch case.
    Implement the following functionalities in the cases:java
        Case 1: Find the square root of a number using the Math class method.
        Case 2: Display today’s date.
        Case 3: Split the following string and store it in a string array.
           	“I am learning Core Java”
 */
public class Q14 {

    public void switchCases(int java) {
        switch(java) {
            case 1:
                int dummyNumber = 64;
                System.out.println(Math.sqrt(dummyNumber));
            case 2:
                System.out.println(LocalDate.now());
            case 3:
                String string = "I am learning Core Java";
                String[]stringArray = string.split(" ");

        }
    }

}
