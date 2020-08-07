package com.revature;

public class Q15 implements Q15Interface {

    //Write a program that defines an interface having the following methods:
    // addition, subtraction, multiplication, and division.
    // Create a class that implements this interface and provides
    // appropriate functionality to carry out the required operations.
    // Hard code two operands in a test class having a main method
    // that calls the implementing class.

    public double add(double x, double y) {
        return x+y;
    }

    public double sub(double x, double y) {
        return x-y;
    }

    public double mult(double x, double y) {
        return x*y;
    }

    public double div(double x, double y) {
        return x/y;
    }

}
