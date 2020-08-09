package com.revature.questions;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
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

    public double UserEntry(InputStream in, PrintStream out, Double... args) throws InputMismatchException {
        Scanner scanner = new Scanner(in);
        try {
            out.println("Enter principal: ");
            principal = scanner.nextDouble();
        } catch (InputMismatchException e){
            out.print("Principal needs to be a double.");
            e.printStackTrace();
        }
        try {
            out.println("Enter rate: ");
            rate = scanner.nextDouble();
        } catch (InputMismatchException e){
            out.print("Rate needs to be a double.");
            e.printStackTrace();
        }
        try {
            out.println("Enter time in years: ");
            time = scanner.nextInt();
        } catch (InputMismatchException e){
            out.print("Time in Years needs to be an int.");
            e.printStackTrace();
        }
        return getInterest(principal, rate, time);
    }

    public double getInterest(double _principal, double _rate, int _time) throws ArithmeticException{
        //edge cases
        if(_principal < 0 || _rate < 0 || _time < 0) return 0.0f;
        double result = _principal * _rate * _time;
        if(Double.isInfinite(result)) throw new ArithmeticException();
        return result;
    }

//    public double getTotal(double _principal, double _rate, int timeInYears){
//        for (int i = 0; i < timeInYears; i++) {
//            _principal *= (1 + _rate);
//        }
//        return _principal;
//    }
}
