package com.revature;

import java.text.DecimalFormat;

public class Q15Main implements Calculator{

    //init values
    double addResult;
    double subResult;
    double mulResult;
    double divResult;

    // constructor
    public Q15Main() {
        super();
    }


    public static void main(String[] args) {

        // Instantiating new objects
        Q15Main test = new Q15Main();
        DecimalFormat decimals = new DecimalFormat(".####");

        // Add demo
        System.out.println(decimals.format(test.add(3.5, 9.293))); // 12.793

        // Subtract demo
        System.out.println(decimals.format(test.subtract(10.78, 5.123456789))); // 5.6565

        // Multiply demo
        System.out.println(decimals.format(test.multiply(9, 7.2))); // 64.8

        // Divide demo
        System.out.println(decimals.format(test.divide(124, 7.5))); // 16.5333
    }

    //-------------------------------------------------------
    // Overridden methods from abstract interface "Calculator"

    @Override
    public double add(double a, double b) {
        return addResult = a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return subResult = a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return mulResult = a * b;
    }

    @Override
    public double divide(double a, double b) {
        return divResult = a / b;
    }
}
