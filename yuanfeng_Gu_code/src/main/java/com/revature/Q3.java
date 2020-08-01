package com.revature;

public class Q3 {

    public Q3() {
    }

    public String reverse(String str){
        int len =str.length();
        String reverse = "";
        for(int i = 0; i<len;i++){
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }
}
