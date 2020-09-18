package com.revature;

import java.util.Scanner;

import static com.revature.AppDriver.defaults;

public class Q3 {
    //Reverse a string without using a temporary variable.
    // Do NOT use reverse() in the
    // StringBuffer or the StringBuilder APIs.


    public Q3(){
        String str;
        if(!defaults){
            System.out.println("Requires string for reversal.");
            InputHandler input = InputHandler.getInstance();
            str = input.strInput();
        } else {
            str = "This is the default string.";
        }
        System.out.println(str);
        String reversedString = strRev(str);
        System.out.println(reversedString);
        //for more precise testing, i could save these into private vars then manually call methods
    }

    public String strRev(String str){
        char[] charArr = str.toCharArray(); //translate into character array
        char[] revResult = new char[charArr.length]; //create target array

        for (int i = 0; i < charArr.length; i++) { //begin for loop to swapperoo
            revResult[revResult.length-i-1] = charArr[i];
            //charArr counting up from start [0]
            //revResult counting down from end of array (length-1)
            //mental test:
            //@10...10-0-1 =[9], 10-1-1=[8], 10-2-1=[7]
        }
        String revStr = new String(revResult); //char arr back into string
        return revStr;

        //originally, I wanted to use pass-by-value trickery to 'copy' an element
        //while using the resulting shadow element to swap with,
        //and somehow using the original to reassign
        //couldn't get it to work, so I went the easy way

    }



}
