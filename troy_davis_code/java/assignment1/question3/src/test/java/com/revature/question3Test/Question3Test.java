/*
    Reverse a string without using a temporary variable.
    Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
 */
package com.revature.question3Test;

import com.revature.question3.Question3;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class Question3Test {
    String testString;
    String proofString;
    String msg;
    Question3 sut;

    @After
    public void tearDown(){
        sut = null;
        msg = null;
        testString = null;
        proofString = null;
    }

    @Test
    public void notNullTest(){
        msg = "When given null values, the method should return an empty string";
        testString = null;
        sut = new Question3(testString);
        proofString = "";
        Assert.assertEquals(msg, proofString,sut.getReversedString());
        Assert.assertEquals(msg, proofString,sut.getInitialString());
    }
    @Test
    public void canItReverseTest(){
        msg = "Given a string, the method should return the string in reverse";
        testString = "Hello World";
        sut = new Question3(testString);
        proofString = "dlroW olleH";
        Assert.assertEquals(msg, proofString, sut.getReversedString());
    }
    @Test
    public void integerTest(){
        msg = "Given a string of integers, the method should return a string of them reversed";
        testString = "3217951969";
        sut = new Question3(testString);
        proofString = "9691597123";
        Assert.assertEquals(msg, proofString, sut.getReversedString());
    }

}
