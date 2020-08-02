package com.revature;

public class Q16 {
    int numberOfChar =0;
    public void commandLine(String str[]){
        for(int i = 0; i<str.length; i++) {
            numberOfChar= numberOfChar+ str[i].length();
            System.out.println("args[" + i + "]: " + str[i]);
        }
        System.out.println(numberOfChar);
    }
}
