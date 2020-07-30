package com.revature.questions;

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
    private int FactorialGo(int n, int accumulator){
        if(n <= 1) return accumulator;
        return FactorialGo(n-1, n*accumulator);
    }
    public int Factorial(int n){
        return FactorialGo(n, 1);
    }
    public int FactorialRecursive(int n){
        if(n <= 1) return 1;
        return(n * FactorialRecursive(n-1));
    }
}
