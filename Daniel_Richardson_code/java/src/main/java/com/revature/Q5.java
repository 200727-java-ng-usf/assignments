package com.revature;

public class Q5 {
    //Write a substring method that accepts a string str and an integer idx
    // and returns the substring contained between 0 and idx-1 inclusive.
    // Do NOT use any of the existing substring methods in the
    // String, StringBuilder, or StringBuffer APIs.

    public static String subStrEZ(String str, int idx){
        return str.substring(0, idx-1);
    }

    public static String subStrHD(String str, int idx) {
        char[] charArr = str.toCharArray(); //translate into character array
        char[] subStr = new char[idx]; //create target array with idk size

        for (int i = 0; i < subStr.length-1; i++) { //add into new limited array
            subStr[i] = charArr[i];
        }
        String subStrNew = new String(subStr);
        return subStrNew; //remake string and return it

    }
}
