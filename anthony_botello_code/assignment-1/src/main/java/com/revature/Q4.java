package com.revature;

import java.math.BigInteger;

public class Q4{

    public static BigInteger factorial(int n){
        
        if(n < 0) return null;

        if (n == 0 | n == 1) return BigInteger.valueOf(1);

        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}