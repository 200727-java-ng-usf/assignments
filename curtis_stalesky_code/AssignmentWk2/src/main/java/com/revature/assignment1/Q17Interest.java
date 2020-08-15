package com.revature.assignment1;

import com.sun.corba.se.spi.orbutil.fsm.Input;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q17Interest {

    public static void main(String[] args) throws IOException {

        // Variables to calculate the interest rate.
        double rate;
        double principle;
        double time;
        double interest;

        // Need to find a way to calculate the interest rate and
        // number of years provided by the user
        // So I need to have it to where it prompts for input
        // Interest = Principle * Rate * Time

        Scanner input = new Scanner(System.in);

        // This will not work as it will not fully ask each time it is used.
        // Turn them all into methods instead and see if that will work
        // Still a work in progress
        System.out.print("What is the amount on the principle?  ");
        principle = input.nextDouble();
        System.out.println();
        System.out.print("How many years? ");
        time = input.nextDouble();
        System.out.println();
        System.out.print("What is your interest rate? ");
        rate = input.nextDouble();

        rate = rate/100;

        // This part is still in progress
        interest = principle * rate * time;
        System.out.println("Your principle is: " + interest);


    }


}
