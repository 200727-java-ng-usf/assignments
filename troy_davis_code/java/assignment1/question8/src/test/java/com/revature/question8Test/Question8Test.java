/**
 * Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.
 *
 * “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
 */
package com.revature.question8Test;

import com.revature.question8.Question8;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Question8Test {
    Question8 sut;
    String msg;
    ArrayList<String> expectedResult;

    @After
    public void tearDown(){
        sut = null;
        msg = null;
        expectedResult = null;
    }

    @Test
    public void allStringsInArrayListTest(){
        msg = "When given all the strings from the task, the method should store them all in the appropriate array list.";
        expectedResult = new ArrayList<>();
        expectedResult.add("karen");
        expectedResult.add("madam");
        expectedResult.add("tom");
        expectedResult.add("civic");
        expectedResult.add("radar");
        expectedResult.add("jimmy");
        expectedResult.add("kayak");
        expectedResult.add("john");
        expectedResult.add("refer");
        expectedResult.add("billy");
        expectedResult.add("did");
        sut = new Question8("karen","madam", "tom", "civic", "radar","jimmy","kayak", "john", "refer", "billy", "did");
        Assert.assertEquals(msg, expectedResult, sut.getStorageList());
    }
    @Test
    public void palindromesOnlyTest(){
        msg = "when given the full list of strings, the class should store only the palindromes in the correct arrayList";
        expectedResult = new ArrayList<>();
        expectedResult.add("madam");
        expectedResult.add("civic");
        expectedResult.add("radar");
        expectedResult.add("kayak");
        expectedResult.add("refer");
        expectedResult.add("did");
        sut = new Question8("karen","madam", "tom", "civic", "radar","jimmy","kayak", "john", "refer", "billy", "did");
        Assert.assertEquals(msg, expectedResult, sut.getPalindromeList());
    }
    @Test
    public void nullStringsTest(){
        msg = "when given null strings, the class store store an enpty ArrayList for the storage and palindrome list";
        expectedResult = new ArrayList<>();
        sut = new Question8(null);
        Assert.assertEquals(msg,expectedResult, sut.getPalindromeList());
        Assert.assertEquals(msg, expectedResult, sut.getStorageList());
    }

}
