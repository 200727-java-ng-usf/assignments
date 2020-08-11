package com.revature;

public class Q3 {
    public String reverseString(String str) {
        // save the string length for future use.
        int stringLength = str.length();      // If "abc", length = 3
        int startingIndex = stringLength - 1;  // If "abc", startingIndex = 2


        // Create a char array of str.length() characters.
        // ... Add all letters to it.
        char[] reverseStr = new char[stringLength];

        //reverses the order of the char list
        // starting from the highest index: startingIndex
        /** charAt(int index) method returns the character at the specified index in a string.
         The index value that we pass in this method should be between 0 and (length of string-1) */
        for (int i = startingIndex; i > -1; i--) {
            reverseStr[startingIndex - i] = (str.charAt(i));    // returns character from highest index to lower
        }

        //puts reversed char list back into a string
        System.out.println("" + String.valueOf(reverseStr));
        return str;
    }

//    public static void main(String[] args) {
//        Q3 q3 = new Q3();
//        q3.reverseString("abc d123");
//
//    }
}
