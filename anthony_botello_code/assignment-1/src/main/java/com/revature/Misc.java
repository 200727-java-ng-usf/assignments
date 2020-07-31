package com.revature;

import java.util.Random;

public class Misc{

    private static final Random random = new Random();

    public static int[] randomIntArray(int length, int minValue, int maxValue){
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = random.nextInt(maxValue - minValue) + minValue;
        }
        return arr;
    }

    public static int[] randomIntArray(int length, int maxValue){
        return randomIntArray(length, 0, maxValue);
    }
}