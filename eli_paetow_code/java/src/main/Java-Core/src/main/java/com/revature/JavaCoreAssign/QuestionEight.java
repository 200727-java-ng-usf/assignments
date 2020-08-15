package com.revature.JavaCoreAssign;

import java.util.ArrayList;

//Q8. Write a program that stores the following strings in an ArrayList and saves
// all the palindromes in another ArrayList.
//
//“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
public class QuestionEight {

    public static ArrayList<String> palindromeQ8(){

        ArrayList<String> allStrings = new ArrayList<String>();
        allStrings.add("karen");
        allStrings.add("madam");
        allStrings.add("tom");
        allStrings.add("civic");
        allStrings.add("radar");
        allStrings.add("jimmy");
        allStrings.add("kayak");
        allStrings.add("john");
        allStrings.add("refer");
        allStrings.add("billy");
        allStrings.add("did");


        ArrayList<String> palindromesOnly = new ArrayList<String>();
        ArrayList<String> trashStrings = new ArrayList<String>();

        for (String str: allStrings){

            boolean yesPalindrome = palindromeCheck(str);

            if (yesPalindrome){
                palindromesOnly.add(str);
            }else {
                trashStrings.add(str);
            }


        }
        System.out.println(allStrings);
        System.out.println("----------------------");
        System.out.println("palindromes only!!");
        System.out.println(palindromesOnly);

        return palindromesOnly;
    }
    public static boolean palindromeCheck(String str){
        if (str.isEmpty()) {
            return false;
        }else {

            return new StringBuilder(str).reverse().toString().equals(str);
        }


    }

//    public static void main(String[] args) {
//        palindromeQ8();
//
//    }

}
