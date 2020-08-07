package com.revature.coreJavaAssign;

public class q2Fibonacci {
    static int f3, f2 = 0;
    static int f1 = 1;
    static int q2Fibonacci (int count) {
        if (count > 0) {
            //this is the fibonacci formula
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
            System.out.print(" " + f3);
            //this is where a recurrsion method is used and will bring back up the count number untill it hits 0
            q2Fibonacci(--count);

        }
        return count;
    }
}
