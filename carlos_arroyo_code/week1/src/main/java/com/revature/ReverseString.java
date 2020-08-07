package com.revature;

import java.util.*;

public class ReverseString {

    //prints the string in reverse.
    public static void main(String[] args) {

//        StringBuffer str = new StringBuffer("I hope I make it through training!");
//        str.reverse();
//        System.out.println(str);

        String s = "ChristmasMyFavoriteHoliday";

        System.out.println(reverse1(s.toCharArray(), 0, 25));
    }

    static String reverse1(char[] str, int start, int end){
        //Iterate loop upto start not equal to end
        while (start < end) {

            /*What is XOR ^=?
                The XOR logical operation, or exclusive or, takes two boolean operands
                 and returns true if and only if the operands are different. It returns false
                 if the two operands have the same value

                 For example, the XOR can be used when we have to check for two conditions that can't
                 be true at the same time.

             * */
            // XOR for swapping the variable
            str[start] ^= str[end];
            str[end] ^= str[start];
            str[start] ^= str[end];

            ++start;
            --end;
       }

        return String.valueOf(str);
    }

}
