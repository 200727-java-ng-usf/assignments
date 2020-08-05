package com.revature.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q17PrincipalInvesting {
//    Q17. Write a program that calculates the simple interest on the principal,
//    rate of interest and number of years provided by the user.
//    Enter principal, rate and time through the console using the Scanner class.
//    Interest = Principal* Rate* Time
    double principal = 0.0D;
    double rate = 0.0D;
    int time = 0;

    public double UserEntry(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter principal: ");
            principal = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Principal needs to be a double.");
            e.printStackTrace();
        }
        try {
            System.out.println("Enter rate: ");
            rate = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Rate needs to be a double.");
            e.printStackTrace();
        }
        try {
            System.out.println("Enter time in years: ");
            time = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Time in Years needs to be an int.");
            e.printStackTrace();
        }
        return getInterest(principal, rate, time);
    }

    public double getInterest(double _principal, double _rate, double _time){
        return _principal * _rate * _time;
    }

//    public double getTotal(double _principal, double _rate, int timeInYears){
//        for (int i = 0; i < timeInYears; i++) {
//            _principal *= (1 + _rate);
//        }
//        return _principal;
//    }
}
