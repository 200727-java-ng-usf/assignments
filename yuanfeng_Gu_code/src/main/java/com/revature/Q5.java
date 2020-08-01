package com.revature;

public class Q5 {

    public static String substring(String str, int idx){

            StringBuffer buff = new StringBuffer();
            if (idx > 0 && idx < str.length()) {
                char c;
                for (int i = 0; i < idx; i++) {
                    ;
                    c = str.charAt(i);
                    buff.append(c);
                }
        }
        return buff.toString() ;
    }

}
