package com.revature;
import java.util.Scanner;
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
        System.out.print("Enter principle amount : ");
        double principle = scan.nextDouble();

        System.out.print("Enter the annual rate, i.e. 6.5% is 6.5: ");
        double rate = scan.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scan.nextDouble();

        double interest = (principle * rate * time)/100;
        System.out.println("Simple interest of the amount is : " + interest);
    }

    public static void main() {
      Q17 q17 = new Q17();
      q17.calculateRate();
    }
}

