package com.revature;

public class q2Fibonacci {
    static int n3, n1 = 0;
    static int n2 = 1;
    static void FibonacciN (int count) {
        if (count > 0) {
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
            FibonacciN(count - 1);

        }

    }
}
