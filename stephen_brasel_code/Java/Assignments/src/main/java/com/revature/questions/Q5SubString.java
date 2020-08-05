package com.revature.questions;

import java.util.Arrays;

public class Q5SubString {
//    Q5. Write a substring method that accepts a string str and an integer idx and
//      returns the substring contained between 0 and idx-1 inclusive.
//    Do NOT use any of the existing substring methods in the String, StringBuilder, or StringBuffer APIs.
    public String substr(String str, int idx){
        if(idx > str.length()) throw new IndexOutOfBoundsException();
        char[] ret = new char[idx];
        for (int i = 0; i < idx; i++) {
            ret[i] = str.charAt(i);
        }
        return String.copyValueOf(ret);
    }
}
