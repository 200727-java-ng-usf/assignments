package com.revature;

public class Q5{

    public static String substring(String str, int start, int end){
        int length = end - start;
        char[] substr = new char[length];
        
        for(int i = 0; i < length; i++){
            substr[i] = str.charAt(start + i);
        }

        return String.valueOf(substr);
    }

    public static String substring(String str, int end){
        return substring(str, 0, end);
    }

    public static void main(String[] args){

        System.out.println(substring("A string to test my method", 7));
        System.out.println(substring("A string to test my method", 5, 14));
    }

}