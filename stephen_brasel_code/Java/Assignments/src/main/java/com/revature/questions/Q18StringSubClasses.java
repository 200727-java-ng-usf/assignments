package com.revature.questions;

import com.revature.testHelpers.Q18SuperClass;

public class Q18StringSubClasses extends Q18SuperClass {
//    Q18. Write a program having a concrete ;subclass that inherits three abstract methods from a superclass.
//    Provide the following three implementations in the subclass corresponding to the abstract methods in the superclass:
//
//            1. Check for uppercase characters in a string, and return ‘true’ or ‘false’ depending if any are found.
//            2. Convert all of the lower case characters to uppercase in the input string, and return the result.
//            3. Convert the input string to integer and add 10, output the result to the console.
//
//    Create an appropriate class having a main method to test the above setup.
    @Override
    public boolean hasUpper(String str) {
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }

    @Override
    public String swapCase(String str) {
        StringBuffer strb = new StringBuffer();
        Character ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            strb.append(ch);
        }
        return strb.toString();
    }

    @Override
    public Integer toIntAddN(String str, Integer N) {
        Integer ret = 0;
        try{
            ret = Integer.parseInt(str);
        } catch(NumberFormatException e){
            System.out.println("Integer not found!");
            e.printStackTrace();
        }
        return ret + N;
    }


}
