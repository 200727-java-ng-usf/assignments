package com.revature;

import java.math.BigInteger;


public class Q2 {
    
    // used BigInteger to handle overflow
    public static BigInteger fibonacci(int n){

        if(n < 0) return null;

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
}