package com.revature.questions;

import com.revature.util.EmployeeComparator;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * A <code>Q8Palindrome</code> stores a given <code>{@link String}</code>[] in an
 * <code>{@link ArrayList}</code><<code>{@link String}</code>> allStr, and stores the palindromes
 * in that allStr in a separate <code>{@link ArrayList}</code><<code>{@link String}</code>>.
 *
 * @author stephen.brasel@gmail.com
 */
public class Q8Palindrome {
//    Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.
//
//        “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
    /**
     * The complete list of strings given as input.
     */
    private ArrayList<String> allStr;
    /**
     * The list of palindromes populated from the allStr ArrayList.
     */
    private ArrayList<String> palindromes;

    /**
     *
     * @return the complete list of strings given as input
     */
    public ArrayList<String> getAllStr() {
        return allStr;
    }

    /**
     *
     * @return The list of palindromes populated from the allStr ArrayList
     */
    public ArrayList<String> getPalindromes() {
        return palindromes;
    }

    /**
     * Determines whether an given String str is a palindrome.
     * @param str the String to determine whether or not it is a palindrome
     * @return true if the input str is a palindrome
     */
    private boolean isPalindrome(String str){
//        boolean isPal = true;
        int halflen = (int)str.length()/2;
        for (int i = 0; i < halflen; i++) {
//            System.out.println(str.charAt(i) + " " + str.charAt(str.length() - 1 - i));
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
//                isPal = false;
//
                return false;
            }
        }
        System.out.println(str);
        return true;
    }

    /**
     * Determines and sorts palindromes. All strings in the input strs are sorted into allStr, palindromes are sorted into palindromes
     * @param strs an array of Strings
     */
    public void sortAndStore(String[] strs){
        if(strs == null) allStr = new ArrayList<>();
        else allStr = new ArrayList<String>(Arrays.asList(strs));
        palindromes = new ArrayList<String>();
        for (int i = 0; i < allStr.size(); i++) {
            if(isPalindrome(allStr.get(i))){
                palindromes.add(allStr.get(i));
            }
        }
    }

}
