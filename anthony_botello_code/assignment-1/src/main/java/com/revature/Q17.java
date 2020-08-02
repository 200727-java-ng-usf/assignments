package com.revature;

import java.util.Scanner;

public class Q17{

    // Save console inputs for testing
    private static double principal;
    private static double rate;
    private static double time;

    public static double calculateSimpleInterest(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter principal: ");
        principal = scan.nextDouble();

        System.out.print("Enter rate of interest: ");
        rate = scan.nextDouble();

        System.out.print("Enter number of years: ");
        time = scan.nextDouble();

        scan.close();

        return principal * rate * time;
    }

    public static double getPrincipal() {
        return principal;
    }

    public static double getRate() {
        return rate;
    }

    public static double getTime() {
        return time;
    }
}