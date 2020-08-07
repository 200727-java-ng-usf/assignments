package com.revature.questions;

import com.revature.util.MathInterface;

public class Q15MathInterface implements MathInterface {
//    Q15. Write a program that defines an interface having the following methods:
//      addition, subtraction, multiplication, and division.
//    Create a class that implements this interface and provides appropriate functionality
//    to carry out the required operations.
//    Hard code two operands in a test class having a main method that calls the implementing class.
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0.0D){
            throw new ArithmeticException("Singularity averted, do not divide by zero.");
        }
        return a/b;
    }
}
