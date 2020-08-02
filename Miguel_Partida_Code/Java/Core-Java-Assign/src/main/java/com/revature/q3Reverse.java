package com.revature;

public class q3Reverse {
    static void reverseString(String gnirtSesreveR) {
        //Here I have my string ReverseString
        System.out.println(gnirtSesreveR);

        //This here will convert the string into a charArray
        char[] chars = gnirtSesreveR.toCharArray();

        //This will give me the length of ReverseString
        int lengthOfString = chars.length;

       // System.out.println(chars.length); The ans
        for (int i = lengthOfString - 1; i >= 0; i--) {
            //This will print all the chars
            System.out.print(chars[i]);

        }

    }
}
