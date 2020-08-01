package com.revature;

import java.util.Arrays;

public class FibonacciNumbersQ2 {

    private int[] fibNums;

    public FibonacciNumbersQ2(int amount) {
        fibNums = new int[amount];
        if (amount == 1) {
            fibNums[0] = 0;
        }
        if (amount >= 2) {
            fibNums[0] = 0;
            fibNums[1] = 1;
            for (int i = 2; i < fibNums.length; i++) {
                fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
            }
        }
    }

    public void print() {
        System.out.println("First " + this.fibNums.length + " numbers of the Fibonacci sequence: ");
        System.out.println(Arrays.toString(this.fibNums));
    }

    public static void main(String[] args) {
        FibonacciNumbersQ2 fibNum = new FibonacciNumbersQ2(25);
        fibNum.print();
    }
}

