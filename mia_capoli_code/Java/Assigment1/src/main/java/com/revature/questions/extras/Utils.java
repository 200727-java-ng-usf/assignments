package com.revature.questions.extras;

public class Utils {
    //util classes for testing / printing, keeping for posterity.
    public static void printValues(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

    }

    public static <T> void printObjs(T[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

    }
}
