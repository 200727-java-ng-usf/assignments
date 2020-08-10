package com.revature.questions;

/**
 * A <code>Q10Ternary</code> determines if a number is less than another number.
 * @author stephen.brasel@gmail.com
 */
public class Q10Ternary {
//    Q10. Find the minimum of two numbers using ternary operators.

    /**
     * Returns a if a is less than b, otherwise returns b
     * @param a int to compare
     * @param b int to compare against
     * @return a if a is less than b, otherwise returns b
     */
    public int lesser(int a, int b){
        return a < b ? a : b;
    }
}
