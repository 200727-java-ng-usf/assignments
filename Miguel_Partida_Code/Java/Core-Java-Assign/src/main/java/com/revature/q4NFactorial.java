package com.revature;

public class q4NFactorial {
    /*
        What is it asking me to do ?
     */
    static int factorial (int n) {
//        int fact, i ;
//
//        for (i = n, fact = 0;i > 0;
//        i--, fact++ ) {
//
//        }
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }


}
