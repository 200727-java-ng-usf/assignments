package com.revature.coreJavaAssign;

public class q3Reverse {
    /*
        What is it asking me to do ?
        -to take in a string and give back the letters
        in reverse order

     */
    static String q3reverse(String gnirtSesreveR) {
        // accumulator
        int i;
        //Here I have my string ReverseString
        System.out.println(gnirtSesreveR);

        //This here will convert the string into a charArray
        char[] chars = gnirtSesreveR.toCharArray();

        //This will give me the length of ReverseString
        int lengthOfString = chars.length;

       // System.out.println(chars.length); The answer is 13

        //the iterations is - 1 of the length of ReverseString
//        for ( i = lengthOfString - 1; i >= 0; i--) {
//            //This will print all the chars starting at the 12th array spot moving backwards
//            System.out.print(chars[i]);
//        }
        String reverse = String.valueOf(chars);
        return reverse;
    }
}
