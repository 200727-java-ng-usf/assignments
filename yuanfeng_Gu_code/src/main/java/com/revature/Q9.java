package com.revature;

import java.util.ArrayList;

public class Q9 {


    public static void printPrime(ArrayList<Integer> arrayPrime) {
        for (int i = 2; i <= arrayPrime.size(); i++) {//1 is not a prime number
            boolean k = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    k = false;
                    break;
                }
            }
            if (k) {
                System.out.print(i + " ");
            }
        }

    }
}
