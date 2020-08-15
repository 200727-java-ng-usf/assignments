package com.revature;

public class Q5 {
    /**
     * /**
     * * Q5. Write a substring method that accepts a string str and an integer
     * * idx and returns the substring contained between 0 and idx-1 inclusive.
     * * Do NOT use any of the existing substring methods in the String, StringBuilder, or StringBuffer APIs.
     *
     * @param str A string passed to a method substring( , )
     * @param idx an integer between 0 and idx-1 passed to method substring(,)
     * @return a computed sub string
     */
    static String substring(String str, int idx) {
        if (idx > str.length()) {
            /**
             * if index > str length, just return it
             */
            return str;
        }

        String subString = "";
        for (int i = 0; i < idx; i++) {
            /**
             * get character from index 0 through i th position,
             * and appends to the output String
             */
            subString += str.charAt(i);
        }
        return subString;
    }
}
