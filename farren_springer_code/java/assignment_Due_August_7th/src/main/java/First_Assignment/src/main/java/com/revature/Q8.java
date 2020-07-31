package com.revature;

import java.util.Arrays;

public class Q8 {

    public static void main(String[] args) {

        // create an array with the names
//        String palindromesMaybe[] = {"karan", "madam", "tom", "civic", "radar", "jimmy" "kayak", "john", "refer", "billy", "did"};

        // test array
        String originalList[] = {"AndIOop", "racecar"};

        // create an array to store the reverses and create an array to store palindromes
        String[] reverse_Of_The_List = new String[originalList.length];
        String[] palindromes;

        // test putting a value into reverse array
        reverse_Of_The_List[0] = "Hey";
        reverse_Of_The_List[1] = "Hi";

        System.out.println(Arrays.toString(originalList)); // test
        System.out.println(Arrays.toString(reverse_Of_The_List)); // test

        // parse through the index of the original list to create the array with the reverse values
        for(int u = 0; u < originalList.length; u++) {
            // parse through the letters from back to front of each original list item and copy the chars into the right index
            for(int i = originalList[u].length() - 1; i >= 0; i--) {
                System.out.print(originalList[u].charAt(i)); // test
                // put that char in the reverse list index.
                //reverse_Of_The_List[u] = originalList[u].charAt(i);
            }
            System.out.println(" ");
            System.out.println(reverse_Of_The_List[u]);
        }
        System.out.println("this is the reverse of the array: " + Arrays.toString(reverse_Of_The_List)); // test
        // if



    }

}
