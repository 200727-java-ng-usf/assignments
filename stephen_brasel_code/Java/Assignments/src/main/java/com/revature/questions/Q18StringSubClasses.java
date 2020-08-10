package com.revature.questions;

import com.revature.util.Q18SuperClass;

/**
 * A <code>Q18StringSubClasses</code> provides functionality for the following:<br>
 *     1. determining if a given <code>{@link String}</code> has uppercase chars in it.<br>
 *     2. converting a given <code>{@link String}</code> to uppercase.<br>
 *     and <br>
 *     3. parsing a <code>{@link String}</code> to an <code>{@link Integer}</code> and adding another
 *     <code>{@link Integer}</code> to it.
 * @author stephen.brasel@gmail.com
 */
public class Q18StringSubClasses extends Q18SuperClass {
//    Q18. Write a program having a concrete ;subclass that inherits three abstract methods from a superclass.
//    Provide the following three implementations in the subclass corresponding to the abstract methods in the superclass:
//
//            1. Check for uppercase characters in a string, and return ‘true’ or ‘false’ depending if any are found.
//            2. Convert all of the lower case characters to uppercase in the input string, and return the result.
//            3. Convert the input string to integer and add 10, output the result to the console.
//
//    Create an appropriate class having a main method to test the above setup.

    /**
     * Returns true if <code>{@link String}</code> {@code str} has any uppercase characters in it.
     * @param str the <code>{@link String}</code> to check for uppercase characters.
     * @return true if <code>{@link String}</code> {@code str} has any uppercase characters in it.
     */
    @Override
    public boolean hasUpper(String str) {
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }

    /**
     * Converts all lowercase characters in the input <code>{@link String}</code> {@code str} to uppercase,
     * and returns the uppercase <code>{@link String}</code>.
     * @param str the <code>{@link String}</code> to convert to uppercase
     * @return the converted uppercase <code>{@link String}</code>.
     */
    @Override
    public String toUpperCase(String str) {
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

    /**
     * Parses a <code><{@#link String}</code> {@code str} into in <code>{@link Integer}</code>,
     * adds {@code N} to that parsed value, then returns the value.
     * @param str the <code>{@link String}</code> to parse into an <code>{@link Integer}</code>
     * @param N the addend.
     * @return the result of parsed <code>{@link Integer}</code> {@code str} added to {@code N}.
     */
    @Override
    public Integer toIntAddN(String str, Integer N) throws NumberFormatException{
        Integer ret = 0;
        try{
            ret = Integer.parseInt(str);
        } catch(NumberFormatException e){
            System.out.println("Integer not found!");
            e.printStackTrace();
            throw e;
        }
        return ret + N;
    }


}
