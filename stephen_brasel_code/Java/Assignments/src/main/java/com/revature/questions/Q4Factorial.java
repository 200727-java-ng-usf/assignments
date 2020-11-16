package com.revature.questions;

/**
 * A <code>Q4Factorial</code> provides the Factorial of a given int n, (n!).
 * @author stephen.brasel@gmail.com
 */
public class Q4Factorial {
    //    Q4. Write a program to compute N factorial.
    /*
        Tail recursion applies the recursive function in each step,
        which is more efficient than the regular recursive method.

        It does this by refactoring the regular recursive method:
            if(end condition) return baseCase;
            return(function - operator - recursive(count));
        to
            if(end condition) return accumulator;
            return recursive(count, function - operator - accumulator)
     */
    private int FactorialGo(int n, int accumulator) {
        if (n <= 1) return accumulator;
        return FactorialGo(n - 1, n * accumulator);
    }

    public int FactorialTail(int n) {
        return FactorialGo(n, 1);
    }

    /**
     * Returns the factorial of the given input n.
     * @param n the integer to produce the factorial of.
     * @return the factorial of int n, or n!
     */
    public int FactorialFor(int n){
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret*=i;
        }
        return ret;
    }

    public int Factorial(int n) {
        if (n <= 1) return 1;
        return (n * Factorial(n - 1));
    }
}
