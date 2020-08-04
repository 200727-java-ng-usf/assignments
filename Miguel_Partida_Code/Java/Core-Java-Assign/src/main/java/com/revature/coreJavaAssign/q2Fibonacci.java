package com.revature.coreJavaAssign;

public class q2Fibonacci {
    static int f3, f1 = 0;
    static int f2 = 1;
    static void FibonacciN (int count) {
        if (count > 0) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
            System.out.print(" " + f3);
            FibonacciN(count - 1);

        }

    }
}
