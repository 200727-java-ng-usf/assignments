package com.revature;

public class Q15 implements Q15Interface{
    /**
     * Q15. Write a program that defines an interface having the following methods:
     * addition, subtraction, multiplication, and division.
     * Create a class that implements this interface and provides appropriate
     * functionality to carry out the required operations.
     */

    /**
     *
     * @param x double
     * @param y
     * @return the addition of x and Y
     */
    public double additionMethod(double x, double y) {
        return x+y;
    }

    public double subtractionMethod(double x, double y) {
        return x-y;
    }

    public double multiplicationMethod(double x, double y) {
        return x*y;
    }

    public double divisionMethod(double x, double y) {
        return x/y;
    }

    public static void main(String[] args) {
        Q15 q15 = new Q15();
        System.out.println(q15.additionMethod(1,2));

        System.out.println(q15.subtractionMethod(3,2));

        System.out.println(q15.multiplicationMethod(3,6));

        System.out.println(q15.divisionMethod(30,15));
    }
}
