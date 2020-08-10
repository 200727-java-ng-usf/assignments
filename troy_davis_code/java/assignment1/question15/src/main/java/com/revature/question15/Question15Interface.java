/**
 * Q15. Write a program that defines an interface having the following methods:
 *          - addition, subtraction, multiplication, and division.
 *          - Create a class that implements this interface and provides appropriate
 *            functionality to carry out the required operations.
 *          - Hard code two operands in a test class having a main method that calls the implementing class.
 */

package com.revature.question15;

public interface Question15Interface {
    //implicitly abstract methods to be defined by the class
    double addition(double someValue1, double someValue2);
    double subtraction(double someValue1, double someValue2);
    double multiplication(double someValue1, double someValue2);
    double division(double someValue1, double someValue2);
}
