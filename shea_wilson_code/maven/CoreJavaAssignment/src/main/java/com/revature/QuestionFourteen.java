package com.revature;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourteen {

    public static void main(String[] args) {

        Scanner blah = new Scanner(System.in); // initialize blah as a scanner

        System.out.println("Please enter your selection: \n" //greet the user and present options for the app
                            +"1. Will ask for a number and return a square root.\n"
                            +"2. Will present you with todays date.\n"
                            +"3. Will return a special message.");
        int user = blah.nextInt(); //accept the user input

        switch (user){  // begin the switch case method

            case 1:
                System.out.print("Please enter the number you want the square:"); //ask the user for input
                 int num = blah.nextInt(); //accept the user input
                //return the square root of the integer. (casting int in case of return double)
                System.out.println("The square root of the int you entered is " + (int)Math.sqrt(num));
                break;

            case 2:
                System.out.println(java.time.LocalDate.now()); //present today's date
                break;

            case 3:
                String s = "I am learning Core Java"; //initialize string s with given string
                String[] msg = s.split(" "); //instantiate String array msg with split string s
                System.out.println(Arrays.toString(msg)); //print Array msg
        }

    }
}
