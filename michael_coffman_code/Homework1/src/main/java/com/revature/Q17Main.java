package com.revature;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q17Main {

    private double principal;
    private double rate;
    private int years;
    private double interest;

    private Q17Main(double principal, double rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    public Q17Main() {
        super();
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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double calculateInterest(double principle, double rate, int years) {
        interest = principle * (rate/100) * years;
        return interest;
    }

    private void printAmounts() {
        System.out.println("Principle: $" +  principal + ", Rate: "
                + rate + "%, Time: " + years + " years.\n" +
                "Your interest accrued is $" + interest + ".");
    }

    public static void main(String[] args) {

        // instantiating scanner object
        Scanner input = new Scanner(System.in);

        // instantiating decimal formatter rounding to 2 decimal places
        DecimalFormat decimals = new DecimalFormat(".##");

        // instantiate customer object
        Q17Main customer = new Q17Main();

        // get principal amount
        while (true) {

            try {

                System.out.println("Please enter your principal.");
                customer.principal = Double.parseDouble(decimals.format(input.nextDouble()));
                if (customer.principal > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                    System.out.println("+--------------------------------------+");
                }
            } catch (InputMismatchException e) {
                //e.printStackTrace();
                input.next();
            }
        }

        // get yearly rate
        while (true) {

            try {

                System.out.println("Please enter your rate as shown. (Example: 5 for 5%");
                customer.rate = Double.parseDouble(decimals.format(input.nextDouble()));
                if (customer.rate > 0) {
                    break;
                } else {
                    System.out.println("You need to enter a positive integer.");
                    System.out.println("+--------------------------------------+");
                }
            } catch (InputMismatchException e) {
                //e.printStackTrace();
                input.next();
            }
        }

        // get years to that you plan to accrue interest
        while (true) {

            try {

                System.out.println("Please enter the time to accrue interest in total years.");
                customer.years = input.nextInt();
                if (customer.years > 0) {
                    break;
                } else {
                    System.out.println("You need to enter a positive integer.");
                    System.out.println("+--------------------------------------+");
                }

            } catch (InputMismatchException e) {
                //e.printStackTrace();
                input.next();
            }
        }

            // calculate interest - DecimalFormat formats these numbers into a string
            // I then use the Double.parseDouble method to convert back into double type.
            customer.interest = Double.parseDouble(decimals.format(customer.calculateInterest(customer.principal, customer.rate, customer.years)));

            // custom print method to display all information entered and output.
            customer.printAmounts();
            System.out.println("You now have a total of: $" +
                    (customer.principal + customer.interest));

            // close the scanner object
            input.close();
    }
}
