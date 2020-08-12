package com.revature;

import java.util.ArrayList;
import java.util.Arrays;

public class Q8Main {





    public static void main(String[] args) {

        ArrayList<String> palindrome = new ArrayList<>();

        ArrayList<String> original = new ArrayList<>();
        original.add(0, "karan");
        original.add(1, "madam");
        original.add(2, "tom");
        original.add(3, "civic");
        original.add(4, "radar");
        original.add(5, "jimmy");
        original.add(6, "kayak");
        original.add(7, "john");
        original.add(8, "refer");
        original.add(9, "billy");
        original.add(10, "did");


        for (int i = 0; i < original.size(); i++) {

            String tempString = ("");
            char[] tempChar = original.get(i).toCharArray();

            for (int j = original.get(i).length(); j > 0; j--) {
                tempString += tempChar[j-1];
            }
            palindrome.add(i, tempString);
        }


        System.out.println("Original Array:");
        System.out.println(original.toString());
        System.out.println("+-------------------------------------------------------------------------+");
        System.out.println("Palindrome Array:");
        System.out.println(palindrome.toString());
        System.out.println("+-------------------------------------------------------------------------+");











    }
}
