package com.revature;

public class Q3{

    public static String reverseString(String str){
        
        int n = str.length();
        char[] strChars = str.toCharArray();

        for(int i = 0; i < n/2; i++){
            char temp = strChars[i];
            strChars[i] = strChars[n - 1 - i];
            strChars[n - 1 - i] = temp;
        }

        return new String(strChars);
    }

    public static void main(String[] args){
        System.out.println(reverseString("String"));
        System.out.println(reverseString("Strings"));

    }
}