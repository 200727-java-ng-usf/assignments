package com.revature.util;

public interface MathInterface {
//    Q15. Write a program that defines an interface having the following methods:
//      addition, subtraction, multiplication, and division.
//    Create a class that implements this interface and provides appropriate functionality
//    to carry out the required operations.
//    Hard code two operands in a test class having a main method that calls the implementing class.

    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b) throws Exception;
}
