package com.revature;

import java.util.Arrays;

public class Q2Main {

    private static void answer() {

        int[] fibonacci = new int[25];
        fibonacci[1] = 1;

        for (int i = 2; i < (fibonacci.length); i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println(Arrays.toString(fibonacci));
    }

    public static void main(String[] args) {

        answer();

    }


}