package com.revature;

import java.util.Arrays;

public class Q16Main {

    public static void main(String[] s) {

        int charCount = 0;

        String[] currentString = s;

        for (int i = 0; i < currentString.length; i++) {
            charCount += s[i].length();
        }
        System.out.println("+-----------------------------------+");
        System.out.println("The String [] you've entered is:");
        System.out.println(Arrays.toString(currentString));
        System.out.println("The String [] contains " + charCount + " characters.");
    }
}
