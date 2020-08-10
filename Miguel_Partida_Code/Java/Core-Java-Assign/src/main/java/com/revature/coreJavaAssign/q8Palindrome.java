package com.revature.coreJavaAssign;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class q8Palindrome {
    // A palindrome is a word or phrase that can be spelled the same forward and backwards
    //We will get the Strings and store them in firstStop and if its a palindrome it will go to  another array list palindroms

    // I will write a method that checks if the word is a palindrome and return if its true or not
    public static boolean checkIfPalindrom(String word) {
        StringBuilder reverseWord = new StringBuilder(word);
        reverseWord =  reverseWord.reverse();
        if (reverseWord.toString().equals(word)) {
            return true;
        } else {
            return false;
        }

    }

    public static ArrayList<ArrayList<String>> q8PalindromeO(String[] initialStrings) {


        //this is were non-palindrome words will go
        ArrayList<String> justStrings = new ArrayList<>();
        // this is the ArrayList that the confirmed word will go to the palindroms
        ArrayList<String> palindromList = new ArrayList<>();

        //this is the arraylist of arraylists that will hold the above lists
        ArrayList<ArrayList<String>> stringsAndPalindroms = new ArrayList<>();
        stringsAndPalindroms.add(justStrings);
        stringsAndPalindroms.add(palindromList);

        //String word;this for loop will iterate through the array and determine
        // if the string goes to the palindromeList or justStringsa

        for (int i = 0; i < initialStrings.length ; i++) {
            //this will take the string from the index of i
            // and give it a refrence to be checked by our previous method
            String word = (String) Array.get(initialStrings, i);


            if (checkIfPalindrom(word) == true) {
                palindromList.add(word);
              //  System.out.println(palindromList);
            } else {
                justStrings.add(word);
               // System.out.println(justStrings);
            }

        }
        //I cannot return two arrayLists so i will return a List of lists
        return stringsAndPalindroms;
    }
    }


