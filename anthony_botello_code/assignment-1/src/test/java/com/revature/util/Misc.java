package com.revature.util;

import java.util.Random;

public class Misc{

    private static final Random random = new Random();
    
    public static int[] randomIntArray(int length){
        return randomIntArray(length, Integer.MAX_VALUE);
    }

    public static int[] randomIntArray(int length, int maxValue){
        return randomIntArray(length, 0, maxValue);
    }

    public static int[] randomIntArray(int length, int minValue, int maxValue){

        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = getRandomInt(minValue, maxValue);
        }

        return arr;
    }

    public static int getRandomInt(){
        return random.nextInt();
    }

    public static int getRandomInt(int min, int max){
        return random.nextInt(max - min) + min;
    }
}