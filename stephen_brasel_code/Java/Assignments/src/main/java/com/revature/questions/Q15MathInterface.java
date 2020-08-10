package com.revature.questions;

import com.revature.util.MathInterface;

/**
 * A <code>Q15MathInterface</code> provides methods for adding, subtracting, multiplying, and dividing.
 * implements <code>{@link MathInterface}</code>
 * @author stephen.brasel@gmail.com
 */
public class Q15MathInterface implements MathInterface {
//    Q15. Write a program that defines an interface having the following methods:
//      addition, subtraction, multiplication, and division.
//    Create a class that implements this interface and provides appropriate functionality
//    to carry out the required operations.
//    Hard code two operands in a test class having a main method that calls the implementing class.

    /**
     * Adds {@code a} and {@code b}.
     * @param a the first addend
     * @param b the second addend
     * @return the sum of adding {@code a} and {@code b}, i.e. (a+b)
     */
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    /**
     * Subtracts {@code b} from {@code a}.
     * @param a minuend
     * @param b subtrahend
     * @return the difference remaining from subtracting {@code b} from {@code a}, i.e. (a-b)
     */
    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    /**
     * Multiplies {@code a} and {@code b}.
     * @param a the first factor
     * @param b the second factor
     * @return the product of multiplying {@code a} and {@code b}, i.e. (a*b)
     */
    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    /**
     * Divides {@code a} by {@code b}.
     * @param a dividend
     * @param b divisor
     * @return the quotient of dividing {@code a} by {@code b}, i.e. (a/b)<br>
     *     May throw ArithmeticException if b is 0.
     */
    @Override
    public double divide(double a, double b) throws ArithmeticException {
        if(Double.compare(b, 0.0D) == 0){
            throw new ArithmeticException("Singularity averted, do not divide by zero.");
        }
        return a/b;
    }
}
