package com.revature.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
    Q8. Write a program that stores the following strings in an ArrayList
    and saves all the palindromes in another ArrayList.

    “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

 */
public class Q8 {

    public static void main(String[] args) {

        ArrayList<String> allStrings = new ArrayList<>();
        ArrayList<String> palindromes = new ArrayList<>();
        Q8 obj = new Q8();

        String currentString;

        // adds all Strings to ArrayList from text file, which is used for simplicity
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/Q8_text.txt"));
            while(scanner.hasNext()) {
                allStrings.add(scanner.next());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        // adds palindromes to a separate arrayList
        for (String str: allStrings) {
            if(obj.isPalindrome(str)){
                palindromes.add(str);
            }
        }

        // prints palindromes arraylist
        System.out.println(palindromes.toString());

    }

    // determines which Strings are palindromes
    public boolean isPalindrome(String str) {
        for(int i = 0, j = str.length()-1; i < ((str.length()-1)/2); i++, j--) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }

}
