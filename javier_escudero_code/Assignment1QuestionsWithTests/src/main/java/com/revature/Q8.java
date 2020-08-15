package com.revature;

import java.util.ArrayList;

public class Q8 {

    static ArrayList arr1 = new ArrayList(); // All string
    static ArrayList p_arr = new ArrayList(); // Palindrome strings
    public static void main(String[] args) {
//
            // add all string in arr1
            arr1.add("karan");
            arr1.add("madam");
            arr1.add("tom");
            arr1.add("civic");
            arr1.add("radar");
            arr1.add("jimmy");
            arr1.add("kayak");
            arr1.add("john");
            arr1.add("refer");
            arr1.add("billy");
            arr1.add("did");
            // loop each element in arr1
            for (int i = 0; i < arr1.size(); i++) {
                if ( isPalindrome( (String)arr1.get(i) ) ) // (String)arr1.get(i) the word at position i is casted to String
                { // if palindrome
                    p_arr.add((String) arr1.get(i)); // add the string to p_arr list
                }
            }
            System.out.println("The Palindrome string are : " + p_arr);
        }

        public static boolean isPalindrome(String str) {
            String reverse = "";
            // reverse the string
            for (int i = str.length() - 1; i >= 0; i--) { // str.length() is the length of each word passed from the Array List
                reverse = reverse + str.charAt(i); // returns the char value element from the array list
            }
            // check string matches to give string
            return str.equals(reverse);
        }
}