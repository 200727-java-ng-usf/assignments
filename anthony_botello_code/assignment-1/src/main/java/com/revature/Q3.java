package com.revature;

public class Q3{

    public static String reverseString(String str){
        if(str == null) return null;
        
        int len = str.length();
        char[] strChars = str.toCharArray();

        for(int i = 0, j = len - 1; i < j; i++, j--){
            swapValues(strChars, i, j);
        }

        return new String(strChars);
    }

    // swaps values at indices i and j without using a temporary variable
    private static void swapValues(char[] arr, int i, int j){

        arr[i] = (char) (arr[i] + arr[j]);
        arr[j] = (char) (arr[i] - arr[j]);
        arr[i] = (char) (arr[i] - arr[j]);
    }
}