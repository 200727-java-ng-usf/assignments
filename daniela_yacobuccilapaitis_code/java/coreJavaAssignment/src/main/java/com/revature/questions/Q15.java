package com.revature.questions;

/*
    Q15. Write a program that defines an interface having the following methods:
    addition, subtraction, multiplication, and division.

    Create a class that implements this interface and provides appropriate functionality
    to carry out the required operations.

 */

public class Q15 implements Q15Interface {
    @Override
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double division(double num1, double num2) {
        return num1 / num2;
    }
}
