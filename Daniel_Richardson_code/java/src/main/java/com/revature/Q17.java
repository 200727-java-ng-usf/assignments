package com.revature;

import java.util.Scanner;

public class Q17 {
    //Write a program that calculates the simple interest on the
    // principal, rate of interest and number of years provided by the user.
    // Enter principal, rate and time through the console using the Scanner class.
    //Interest = Principal* Rate* Time

    //interest = (interest rate / # of payments PER YEAR) * principal

    public double usury(){
        double principal;
        double rate;
        double time; //

        Scanner scanner = new Scanner(System.in);

        //todo try catch

        System.out.print("Enter principal: ");
        principal = scanner.nextDouble();
        System.out.print("Enter interest rate: ");
        rate = scanner.nextDouble();
        System.out.print("Enter number of payments per year: "); //todo add limiters >12, <0
        time = scanner.nextDouble();

        return (rate/time)*principal;
    }

}
