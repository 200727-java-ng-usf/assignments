package com.revature;

import jdk.internal.util.xml.impl.Input;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {



        String s = "Hello"; // the string
        System.out.println("Here is the string: "+s); // test
        System.out.print("Here is the string backwards: ");


        // for loop to iterate through the string and print it from end to beginning.

        // use string builder to build the strings after you reverse them

            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }




    }
}
