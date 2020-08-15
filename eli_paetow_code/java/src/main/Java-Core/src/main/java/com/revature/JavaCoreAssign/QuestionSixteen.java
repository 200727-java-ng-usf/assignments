package com.revature.JavaCoreAssign;

import java.util.Scanner;

//Write a program to display the number of characters for a string input.
// The string should be entered as a command line argument using (String [ ] args).

public class QuestionSixteen {


    public static void main(String[] args){
        /**
         *set up scanner to take in user input string
         * */
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string please: ");
        String Q16 = input.nextLine();

        /**
         *while i is less than the lenght of the string
         * loop through and increment i
         * */

//        for (int i = 0; i <= Q16.length(); i++){
//            i++;
//        }
        /**
         *dont actually need that. just take the length
         * */
        System.out.println("character count is: " + Q16.length());
    }
}
