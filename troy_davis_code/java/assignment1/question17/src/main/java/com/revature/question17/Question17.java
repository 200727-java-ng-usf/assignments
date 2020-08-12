/**
 * Q17. Write a program that calculates the:
 *      - simple interest on the principal, rate of interest and number of years provided by the user.
 *      - Enter principal, rate and time through the console using the Scanner class.
 *      - Interest = Principal* Rate* Time
 */
package com.revature.question17;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Question17 {

    private double interest;
    private double principal;
    private double rate;
    private double time;

    //using scanner class
    Scanner reader = new Scanner(System.in);

    public Question17() throws InputMismatchException{
        //try to get input from user upon instantiation:
        try {
            //get principal
            System.out.println("please enter the Principal: ");
            String stringPrincipal = reader.next();
            //try to parse an int out of it
            principal = Integer.parseInt(stringPrincipal);

            //get interestRate
            System.out.println("please enter the InterestRate as a percent: ");
            String stringRate = reader.next();
            rate = Integer.parseInt(stringRate);

            //get number of years
            System.out.println("please enter the time in years: ");
            String stringTime = reader.next();
            time = Integer.parseInt(stringTime);

            //calculate the interest
            interest = calculateInterest(principal, rate, time);

        } catch (NumberFormatException | ClassCastException | InputMismatchException e){
            System.out.println("please use real numbers");
            e.printStackTrace();
        }

    }

    //paramerized constructor to create an instance based off given values
    //does not requre user input
    public Question17(double somePrincipal, double someRate, double someTime){
        this.principal = somePrincipal;
        this.rate = someRate;
        this.time = someTime;
        this.interest = calculateInterest(principal, rate, time);
    }

    //method to calculate the interest
    public double calculateInterest(double somePrincipal, double someRate, double someTime){
        return (somePrincipal * (someRate * .01) * someTime);
    }

    //generated getters and setters
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question17)) return false;
        Question17 that = (Question17) o;
        return Double.compare(that.getInterest(), getInterest()) == 0 &&
                Double.compare(that.getPrincipal(), getPrincipal()) == 0 &&
                Double.compare(that.getRate(), getRate()) == 0 &&
                Double.compare(that.getTime(), getTime()) == 0 &&
                Objects.equals(reader, that.reader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInterest(), getPrincipal(), getRate(), getTime(), reader);
    }

    @Override
    public String toString() {
        return "Question17{" +
                "interest=" + interest +
                ", principal=" + principal +
                ", rate=" + rate +
                ", time=" + time +
                ", reader=" + reader +
                '}';
    }
}
