package com.revature.questions;

public class Question5 {
    //initalize the string holder
    String prefix = "";

    public String substringMethod (String str, int idx) {
        //use a stringbuilder class to get indexes of the string's individual characters
        StringBuilder holder = new StringBuilder("");
        //for each character that is defined in the provided int, store the character in the prefix string.
        for(int i = 0; i < idx; i++) {
            holder.append(str.charAt(i));
            prefix = holder.toString();
        }
        //return the string.
        return prefix;
    }
}
