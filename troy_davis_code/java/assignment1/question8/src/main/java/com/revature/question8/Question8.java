/**
 * Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.
 *
 * “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
 */
package com.revature.question8;

import java.util.ArrayList;
import java.util.Objects;

public class Question8 {
    private ArrayList<String> storageList;
    private ArrayList<String> palindromeList;

    //variable argument constructor to evaluate strings for palindromes upon instantiation
    public Question8(String... someStrings){
        //initialize the arrays
        storageList = new ArrayList<>();
        palindromeList = new ArrayList<>();
        //check for null values
        if (someStrings != null){
            //for each of teh strings provided,
            for (String s : someStrings){
                //add to storage list,
                storageList.add(s);
                //then check to see if it is a palindrome
                if(isThisAPalindrome(s)){
                    //if it is, add it to the list
                    palindromeList.add(s);
                }
            }
        }
    }

    private boolean isThisAPalindrome(String someString){
        //create new string builder based off of the given string
        StringBuilder reversed = new StringBuilder (someString);
        //create a return string to hold the reversed string
        String r = reversed.reverse().toString();
        //if the string is the same as itself reversed, it is a palindrome, return it
        return r.equals(someString);


    }

    public ArrayList<String> getStorageList() {
        return storageList;
    }

    public void setStorageList(ArrayList<String> storageList) {
        this.storageList = storageList;
    }

    public ArrayList<String> getPalindromeList() {
        return palindromeList;
    }

    public void setPalindromeList(ArrayList<String> palindromeList) {
        this.palindromeList = palindromeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question8)) return false;
        Question8 question8 = (Question8) o;
        return Objects.equals(getStorageList(), question8.getStorageList()) &&
                Objects.equals(getPalindromeList(), question8.getPalindromeList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStorageList(), getPalindromeList());
    }

    @Override
    public String toString() {
        return "Question8{" +
                "storageList=" + storageList +
                ", palindromeList=" + palindromeList +
                '}';
    }
}
