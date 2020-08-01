package com.revature;

import java.util.Arrays;

public class Q8 {

    static String rev = "";

    public static String reverseIt(String str) {
        for(int i = str.length() -1; i >= 0; i--) {

            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {

        // create an array with the names
        // String palindromesMaybe[] = {"karan", "madam", "tom",
        // "civic", "radar", "jimmy" "kayak", "john", "refer",
        // "billy", "did"};

        // create temporary variable to store reverse words
        String item = null;

        // test array
        String originalList[] = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};

        // create an array to store the reverses and create an array to store palindromes
        String[] reverse_Of_The_List = new String[originalList.length];
        String[] palindromes;

        // parse through the list and reverse each word
        for(int j = 0; j < originalList.length; j++){
            reverse_Of_The_List[j] = reverseIt(originalList[j]);
        }
//
//         test
        System.out.println(Arrays.toString(reverse_Of_The_List));

        // check for palindromes

        }




    }

