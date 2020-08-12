/**
 * Q5. Write a substring method that accepts a string str and an integer idx and returns the substring contained between:
 * 0 and idx-1 inclusive.
 *      - Do NOT use any of the existing substring methods in the String, StringBuilder, or StringBuffer APIs.
 */
package com.revature.question5Tests;

import com.revature.question5.Question5;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class Question5Tests {
    Question5 sut;
    String expectedResult;

    @After
    public void tearDown(){
        //reset test conditions
        sut = null;
        expectedResult = null;
    }

    @Test
    public void nullStringTest(){
        String msg = "when given an string with null values, the class should return an empty string";
        sut = new Question5(null,10);
        expectedResult = "";
        Assert.assertTrue(msg,sut.getSubstring() == expectedResult);
    }
    @Test
    public void testKnownString(){
        String msg = "When given a known string and index, the method should return the intended substring";
        expectedResult = "coffe";
        sut = new Question5("coffee", 5);
        Assert.assertTrue(msg, sut.getSubstring().equalsIgnoreCase(expectedResult));
    }

    @Test
    public void whiteSpaces(){
        String msg = "the method should still operate when given a string with white spaces";
        expectedResult = "Hello Wo";
        sut = new Question5("Hello World", 8);
        Assert.assertTrue(msg, sut.getSubstring().equalsIgnoreCase(expectedResult));
    }

}
