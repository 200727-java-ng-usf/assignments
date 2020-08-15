package com.revature.questions;

import java.util.Scanner;

public class Q17 {

    /*
        Q17. Write a program that calculates the simple interest on the principal,
        rate of interest and number of years provided by the user.
        Enter principal, rate and time through the console using the Scanner class.

            Interest = Principal* Rate* Time

     */
    public static void main(String[] args) {

        Q17 obj = new Q17();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter principal: ");
        double interest = scan.nextDouble();

        System.out.println("Enter rate of interest ");
        double rateOfInterest = scan.nextDouble();

        System.out.println("Enter number of years ");
        int years = scan.nextInt();

        System.out.println("The interest is the following: " + obj.calculateInterestRate(interest, rateOfInterest, years));
    }

    public double calculateInterestRate (double interest, double rateOfInterest, int years){
        return interest * rateOfInterest * years;
    }
}
