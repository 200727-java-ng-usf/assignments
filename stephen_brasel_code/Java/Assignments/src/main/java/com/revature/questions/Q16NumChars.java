package com.revature.questions;

public class Q16NumChars {
//    Q16. Write a program to display the number of characters for a string input.
//    The string should be entered as a command line argument using (String [ ] args).
    private static int len = 0;

    public static int getLen() {
        return len;
    }

    public static void main(String[] args){
        if(args.length > 0){
            len = args[0].length();
            System.out.print(len);
        }
    }
}
