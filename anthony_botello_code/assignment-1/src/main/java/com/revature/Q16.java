package com.revature;

public class Q16{

    private static int stringLength;

    public static void main(String... args){
        stringLength = args[0].length();
        System.out.println(stringLength);
    }

    public static int getStringLength() {
        return stringLength;
    }
}