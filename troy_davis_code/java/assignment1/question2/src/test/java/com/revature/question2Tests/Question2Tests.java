package com.revature.question2Tests;

import com.revature.question2.Question2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
 */
public class Question2Tests {
    Question2 sut;
    //get the initial printstream
    private final PrintStream printStream = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    String expectedReturn;

    @Before
    public void setup(){
        System.setOut(new PrintStream(outputStream));
        expectedReturn = null;
    }

    @After
    public void tearDown(){
        System.setOut(printStream);
        expectedReturn = null;
    }

    @Test
    public void numbersTest(){
        String msg = "the method should display the first 25 numbers of the Feb. sequence";
        expectedReturn = "1\r\n1\r\n2\r\n3\r\n5\r\n8\r\n13\r\n21\r\n34\r\n55\r\n89\r\n144\r\n233\r\n377\r\n610\r\n987\r\n1597\r\n2584\r\n4181\r\n6765\r\n10946\r\n17711\r\n28657\r\n46368\r\n75025";
        sut = new Question2(25);
        Assert.assertEquals(msg, expectedReturn,outputStream.toString().trim());
    }

    @Test
    public void nullTest(){
        String msg = "When given a null value, the method should print nothing";
        expectedReturn = "";
        sut = new Question2(null);
        Assert.assertEquals(msg, expectedReturn, outputStream.toString().trim());
    }
    @Test
    public void negativeNumberTest(){
        String msg = "When given a negative number, the method should print nothing";
        expectedReturn = "";
        sut = new Question2(-155);
        Assert.assertEquals(msg, expectedReturn, outputStream.toString().trim());
    }
    @Test
    public void zeroTest(){
        String msg = "When given 0, the method should print nothing";
        expectedReturn = "";
        sut = new Question2(0);
        Assert.assertEquals(msg, expectedReturn, outputStream.toString().trim());
    }
    @Test
    public void oneTest(){
        String msg = "When given 1, the method should print 1";
        expectedReturn = "1";
        sut = new Question2(1);
        Assert.assertEquals(msg, expectedReturn, outputStream.toString().trim());
    }
}
