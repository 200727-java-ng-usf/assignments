package com.revature;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Q17 {
    /**
     * Q17. Write a program that calculates the simple interest on the principal,
     * rate of interest and number of years provided by the user.
     * Enter principal, rate and time through the console using the Scanner class.
     * Interest = Principal* Rate* Time
     */
    static Scanner scan;
     public void calculateRate(){
         scan = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        double principle = Double.parseDouble(scan.next());

        System.out.print("Enter the annual rate, i.e. 6.5% is 0.065: ");
        double rate = Double.parseDouble(scan.next());

        System.out.print("Enter time in years: ");
        double time = Double.parseDouble(scan.next());

        double interest = (principle * rate * time);
        System.out.print("Simple interest of the amount is : " + interest);
    }

    public static void main(String []args) {
      Q17 q17 = new Q17();
      q17.calculateRate();
    }
}

