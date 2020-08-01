package com.revature.questions;

public class Question5 {
    String prefix = "";
    public String substringMethod (String str, int idx) {
        StringBuilder holder = new StringBuilder("");
        for(int i = 0; i < idx; i++) {
            holder.append(str.charAt(i));
            prefix = holder.toString();
        }
        return prefix;
    }
}
