package com.revature.questions;

import java.util.Arrays;

/**
 * A <code>Q5SubString</code> provides a substring of a given <code>{@link String}</code> {@code str} up to
 * a given index {@code idx}.
 * @author stephen.brasel@gmail.com
 */
public class Q5SubString {
//    Q5. Write a substring method that accepts a string str and an integer idx and
//      returns the substring contained between 0 and idx-1 inclusive.
//    Do NOT use any of the existing substring methods in the String, StringBuilder, or StringBuffer APIs.

    /**
     * Returns a substring from 0 to index of the given input string.
     * @param str the String to derive a substring of.
     * @param idx the index endpoint to stop building the substring at.
     * @return a new String that is the substring from 0 to idx of the input String.
     */
    public String substr(String str, int idx){
        if(idx > str.length()) return str;
        else if(idx <= 0) return "";
        char[] ret = new char[idx];
        for (int i = 0; i < idx; i++) {
            ret[i] = str.charAt(i);
        }
        return String.copyValueOf(ret);
    }
}
