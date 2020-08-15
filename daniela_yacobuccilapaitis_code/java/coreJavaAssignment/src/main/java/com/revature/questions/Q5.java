package com.revature.questions;

/*
    Q5. Write a substring method that accepts a string str and an integer idx and returns
    the substring contained between 0 and idx-1 inclusive.  Do NOT use any of the existing
    substring methods in the String, StringBuilder, or StringBuffer APIs.
 */
public class Q5 {

    public static void main(String[] args) {
        Q5 obj = new Q5();
        String a = "beaniE";
        System.out.println(obj.substring(a, 3));
    }

    public String substring(String str, int idx) {

        StringBuilder returnString = new StringBuilder("");

        for(int i = 0; i < idx ; i++) {
            returnString.append(str.charAt(i));
        }
        return returnString.toString();
    }



}
