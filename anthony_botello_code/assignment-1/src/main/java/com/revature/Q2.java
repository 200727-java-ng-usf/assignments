package com.revature;

import java.math.BigInteger;


public class Q2 {

    /*
    Defined two separate private methods for computing Fibonacci numbers:
        - smallFibonacci: returns Long containing Fibonacci numbers up to the 92nd number;
        - bigFibonacci: returns BigInteger containing Fibonacci numbers from 93rd number onwards due to overflow of Long value.
    */

    private static Long smallFibonacci(int n){
        if(n == 0 || n == 1) return Long.valueOf(n);

        long a = 0;
        long b = 1;

        for(int i = 2; i < n; i++){
            long c = a + b;
            a = b;
            b = c;
        }

        return a + b;
    }

    private static BigInteger bigFibonacci(int n){
        if(n == 0 || n == 1) return BigInteger.valueOf(n);

        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);

        for(int i = 2; i < n; i++){
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }

        return a.add(b);
    }

    // Defined public method to determine appropriate container for return value. 
    // This is what gets called by the user.
    public static Number fibonacci(int n){
        if(n < 0) return null;
        if(n < 93) return smallFibonacci(n);
        else return bigFibonacci(n);
    }


}