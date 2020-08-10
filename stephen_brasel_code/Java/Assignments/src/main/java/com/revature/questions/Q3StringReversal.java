package com.revature.questions;

public class Q3StringReversal {
    //    Q3. Reverse a string without using a temporary variable.

    //    Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
//    private String reverseStringGo(int n, String str, String acc){
//        if(n <= 0) return acc;
//        return reverseStringGo(n-1, str, acc.concat(str.substring(n-1, n)));
//    }

    /**
     * Reverses a given string.
     * @param str the string to reverse
     * @return a new string that is the reverse of the input string
     */
    public String reverseBuild(String str){
        StringBuilder strbd = new StringBuilder();
        for (int i = str.length() -1; i >= 0; i--) {
            strbd.append(str.charAt(i));
        }
        return strbd.toString();
    }

//    public String reverseString(String str) {
//
//            substring
//            charAt
//            concat
//
//        return reverseStringGo(str.length(), str, "");
//    }
}