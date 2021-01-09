package com.revature.questions;

import java.util.*;

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
//        "karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"

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
    public boolean isPalindrome(String str){
        for (int i = 0, len = str.length()/2; i < len; i++)
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        return true;
    }


    /**
     * Determines whether an given String str is a palindrome or can be
     * turned into by changing k or less characters.
     * @param s the String to determine whether or not it is a palindrome
     * @param k the maximum allowed discrepancies
     * @return true if the input s can be a palindrome
     */
    public boolean isKPalindrome(String s, int k){
        return s.length() <= 1 || (
                (s.charAt(0) == s.charAt(s.length() - 1))
                        ? isKPalindrome(s.substring(1, s.length() - 1), k)
                        :
                        (k != 0)
                                && (isKPalindrome(s.substring(1), k - 1)
                                || isKPalindrome(s.substring(0, s.length() - 1), k - 1))
        );
    }

    /**
     * Determines and sorts palindromes. All strings in the input strs are sorted into allStr, palindromes are sorted into palindromes
     * @param strs an array of Strings
     */
    public void sortAndStore(String[] strs){
        if(strs == null) allStr = new ArrayList<>();
        else allStr = new ArrayList<>(Arrays.asList(strs));
        palindromes = new ArrayList<>();
        for (String s : allStr) {
            if (isPalindrome(s)) {
                palindromes.add(s);
            }
        }
    }

}
