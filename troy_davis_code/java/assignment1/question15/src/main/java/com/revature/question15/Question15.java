/**
 * Q15. Write a program that defines an interface having the following methods:
 *          - addition, subtraction, multiplication, and division.
 *          - Create a class that implements this interface and provides appropriate
 *            functionality to carry out the required operations.
 *          - Hard code two operands in a test class having a main method that calls the implementing class.
 */

package com.revature.question15;

public class Question15 implements Question15Interface{

    @Override
    public double addition(double someValue1, double someValue2) {
        return someValue1 + someValue1;
    }

    @Override
    public double subtraction(double someValue1, double someValue2) {
        return someValue1 - someValue1;
    }

    @Override
    public double multiplication(double someValue1, double someValue2) {
        return someValue1 * someValue1;
    }

    @Override
    public double division(double someValue1, double someValue2) {
        if (someValue2 == 0){
            return Double.parseDouble(null);
        }
        return someValue1 / someValue1;
    }
}
