package com.revature.JavaCoreAssign;


import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

//Write a substring method that accepts a string str and an integer idx and returns
// the substring contained between 0 and idx-1 inclusive.
// Do NOT use any of the existing substring methods in the String, StringBuilder, or StringBuffer APIs.
public class QuestionFive {

    public static String Q5subString(String str, int idx) {
        return str.substring(0, idx - 1);
    }

    public static String Q5(String str, int idx) {

        char[] charArray = str.toCharArray();
        char[] str2 = new char[idx];

        for (int i =0; i<idx - 1; i++){
            str2[i] = charArray[i];

        }
        String str3 = new String(str2);
        return str3;
    }

//    public static void main(String[] args) {
//        int idx = 10;
//        String str = "roll tide roll";
//        String result = Q5(str, idx);
//        System.out.println(str);
//        System.out.println(idx);
//        System.out.println("substring without the roll: " + result);
//    }

}
