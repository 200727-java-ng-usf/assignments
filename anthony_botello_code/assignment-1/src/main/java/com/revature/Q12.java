package com.revature;

import java.util.Arrays;

public class Q12 {

    public static int[] getEvens(int[] arr){
        int[] evens = Arrays.stream(arr)
                            .filter(i -> i % 2 == 0)
                            .toArray();

        for(int i : evens){
            System.out.println(i);
        }

        return evens;
    }
}