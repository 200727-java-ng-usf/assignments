package com.revature.questions;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Q8Palindrome {
//    Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.
//
//        “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
    ArrayList<String> allStr;
    ArrayList<String> palindromes;

    public ArrayList<String> getAllStr() {
        return allStr;
    }

    public void setAllStr(ArrayList<String> allStr) {
        this.allStr = allStr;
    }

    public ArrayList<String> getPalindromes() {
        return palindromes;
    }

    public void setPalindromes(ArrayList<String> palindromes) {
        this.palindromes = palindromes;
    }

    private boolean isPalindrome(String str){
//        boolean isPal = true;
        int halflen = (int)str.length()/2;
        for (int i = 0; i < halflen; i++) {
//            System.out.println(str.charAt(i) + " " + str.charAt(str.length() - 1 - i));
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
//                isPal = false;
//                System.out.println();
                return false;
            }
        }
        System.out.println(str);
        return true;
    }

    public void sortAndStore(String[] strs){
        allStr = new ArrayList<String>(Arrays.asList(strs));
        palindromes = new ArrayList<String>();
        for (int i = 0; i < strs.length; i++) {
            if(isPalindrome(strs[i])){
                palindromes.add(strs[i]);
            }
        }
    }

}
