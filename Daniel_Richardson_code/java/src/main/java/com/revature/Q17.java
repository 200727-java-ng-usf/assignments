package com.revature;

import java.util.Scanner;

import static com.revature.AppDriver.defaults;

public class Q17 {
    //Write a program that calculates the simple interest on the
    // principal, rate of interest and number of years provided by the user.
    // Enter principal, rate and time through the console using the Scanner class.
    //Interest = Principal* Rate* Time

    //interest = (interest rate / # of payments PER YEAR) * principal

    public Q17(){
        double interest = usury();
        System.out.println("Interest: " + interest);
    }

    public double usury(){
        double principal;
        double rate;
        double time;
        if(!defaults){
            InputHandler input = InputHandler.getInstance();
            System.out.println("Requires double principal.");
            principal = input.doubleInput();
            System.out.println("Requires double interest rate.");
            rate = input.doubleInput();
            System.out.println("Requires double time, in payments per year.");
            time = input.doubleInput();
        }else {
            principal = 10000; //loan of about 10k, probably bought a house in Antarctica
            rate = 0.07; // 7% interest rate
            time = 12; //12 payments per year
        }
        return (rate/time)*principal;
    }

}
