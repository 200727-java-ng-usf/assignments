/**
 * Q16. Write a program to display the number of characters for a string input.
 *      The string should be entered as a command line argument using (String [ ] args).
 */
package com.revature.question16Tests;

import com.revature.question16.Question16;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class Question16Tests {
    Question16 sut;
    int expectedReturn;
    String msg;
    String[] input;


    @After
    public void tearDown(){
        sut = null;
        expectedReturn = 0;
        msg = null;
    }

    @Test
    public void testWhiteSpaces(){
        msg = "when given a string with white spaces, does the class remove them?";
        input = new String[]{"ma r k   ", "jo h n "};
        sut = new Question16(input);
        expectedReturn = 8;
        Assert.assertEquals(msg, expectedReturn,sut.getNumberOfCharacters());
    }

    @Test
    public void nullInputTest(){
        msg = "when given null input, the class should store 0 as the number of characters";
        input = null;
        sut = new Question16(input);
        expectedReturn = 0;
        Assert.assertEquals(msg,expectedReturn,sut.getNumberOfCharacters());
    }
    @Test
    public void helloWorldTest(){
        msg = "when given Hello World as input, the method should detect that there are 10 characters";
        input = new String[]{"Hello", "World"};
        sut = new Question16(input);
        expectedReturn = 10;
        Assert.assertEquals(msg,expectedReturn,sut.getNumberOfCharacters());
    }
}
