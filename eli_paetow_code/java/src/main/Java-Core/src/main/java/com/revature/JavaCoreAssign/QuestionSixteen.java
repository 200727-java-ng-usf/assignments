package com.revature.JavaCoreAssign;

import java.util.Scanner;

//Write a program to display the number of characters for a string input.
// The string should be entered as a command line argument using (String [ ] args).

public class QuestionSixteen {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string please: ");
        String Q16 = input.nextLine();

        for (int i = 0; i <= Q16.length(); i++){
            i++;
        }
        System.out.println("character count is: " + Q16.length());
    }
}
