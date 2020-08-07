package com.revature;

import java.util.Scanner;

public class Q16 {

    //Write a program to display the number of characters for a string input.
    //The string should be entered as a command line argument using (String [ ] args).
    public void argReciever(String[] arg){
        for(int i = 0; i<arg.length; i++) {
            System.out.println("arg[" + i + "]: " + arg[i]);
        }
    }

    public int strCounter(String[] str){
        int count =0;

        for (String element: str){
            count += element.length();
        }
        return count;
    }

}
