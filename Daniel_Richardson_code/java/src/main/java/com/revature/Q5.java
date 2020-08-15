package com.revature;

import static com.revature.AppDriver.defaults;

public class Q5 {
    //Write a substring method that accepts a string str and an integer idx
    // and returns the substring contained between 0 and idx-1 inclusive.
    // Do NOT use any of the existing substring methods in the
    // String, StringBuilder, or StringBuffer APIs.

    public Q5(){
        int idx = 0;
        String str1;
        if(!defaults){
            InputHandler input = InputHandler.getInstance();
            System.out.println("Requires string for substring manipulation.");
            str1 = input.strInput();
            System.out.println("Enter IDX (0 < idx < string length): ");
            while(idx <= 0 || idx > str1.length()){
                idx = input.intInput();
            }
        } else {
            str1 = "This is the default string.";
            idx = 7;
        }
        System.out.println(str1);
        String newStr = subStrHD(str1, idx);
        System.out.println(newStr);
    }

    public static String subStrEZ(String str, int idx){
        //for tryhards ONLY
        return str.substring(0, idx-1);
    }

    public String subStrHD(String str, int idx) {
        char[] charArr = str.toCharArray(); //translate into character array
        char[] subStr = new char[idx]; //create target array with idk size
        for (int i = 0; i < subStr.length; i++) { //add into new limited array
            subStr[i] = charArr[i];
        }
        String subStrNew = new String(subStr);
        return subStrNew; //remake string and return it
    }
}
