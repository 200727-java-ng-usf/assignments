package com.revature;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q16 {
    /**
     * Q16. Write a program to display the number of characters for a string input.
     * The string should be entered as a command line argument using (String [ ] args).
     */
   // static public String[] args = new String[10];

    static public int tst(String[] args) {
        int count = 0;
        char c[] = args[0].toCharArray();
        for (char i:c) {
            System.out.print(i);
            count++;
        }
        System.out.println(" count " +count);
        return count;
    }

    public static void main(String []args) {
        Q16.tst(args);
    }
}
