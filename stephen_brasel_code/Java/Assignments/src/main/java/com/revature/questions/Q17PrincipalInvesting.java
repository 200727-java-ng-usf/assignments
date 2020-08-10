package com.revature.questions;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A <code>Q17PrincipalInvesting</code> calculates simple interest on the principal, rate of interest, and number
 * of years provided by the user.
 * @author stephen.brasel@gmail.com
 */
public class Q17PrincipalInvesting {
//    Q17. Write a program that calculates the simple interest on the principal,
//    rate of interest and number of years provided by the user.
//    Enter principal, rate and time through the console using the Scanner class.
//    Interest = Principal* Rate* Time
    /**
     * The principal amount of capital.
     */
    double principal = 0.0D;
    /**
     * The interest rate.
     */
    double rate = 0.0D;
    /**
     * The time in years.
     */
    int time = 0;

    /**
     * Parses user input into the <code>{@link #principal}</code>,
     * <code>{@link #rate}</code>, and <code>{@link #time}</code> variables.
     * @return the result of the operation<br>principal * rate * time
     */
    public double UserEntry() {
        Scanner sc = new Scanner(System.in);
//            return Double.parseDouble(sc.nextLine());
        try {
            System.out.println("Enter principal: ");
            principal = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.print("Principal needs to be a double.");
            e.printStackTrace();
            return 0.0d;
        }
        try {
            System.out.println("Enter rate: ");
            rate = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.print("Rate needs to be a double.");
            e.printStackTrace();
            return 0.0d;
        }
        try {
            System.out.println("Enter time in years: ");
            time = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.print("Time in Years needs to be an int.");
            e.printStackTrace();
            return 0.0d;
        }
        sc.close();
        return getInterest(principal, rate, time);
    }

    /**
     * Calculates and returns the amount of interest (but not compound interest) on a {@code principal} amount
     *  multiplied by the interest {@code rate} times the {@code time} in years.
     * @param _principal the principal amount of capital
     * @param _rate the interest rate
     * @param _time the number of years
     * @return the result of the operation<br>principal * rate * time
     * @throws ArithmeticException if the result of the operation <br>
     *     principal * rate * time<br>
     *     is <code>{@link Double#POSITIVE_INFINITY}</code> or <code>{@link Double#NEGATIVE_INFINITY}</code>.
     */
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
