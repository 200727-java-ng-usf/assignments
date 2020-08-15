package com.revature.question13Tests;

import com.revature.question13.Question13;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * Q13. Display the triangle on the console as follows using any type of loop.
 * Do NOT use a simple group of print statements to accomplish this.
 *     0
 *     1 0
 *     1 0 1
 *     0 1 0 1
 */
public class Question13Tests {
    Question13 sut;
    private final PrintStream printStream = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    String expectedReturn;
    String msg;
    @Before
    public void setup(){
        System.setOut(new PrintStream(outputStream));
        expectedReturn = null;
    }

    @After
    public void tearDown(){
        System.setOut(printStream);
        expectedReturn = null;
        sut = null;
        msg = null;
    }
    @Test
    public void printCorrectTriangleTest(){
        msg = "the class should print out the triangle as directed";
        expectedReturn = "\r\n0\r\n10\r\n101\r\n0101\r\n";
        sut = new Question13();
        Assert.assertEquals(msg,expectedReturn,outputStream.toString());
    }
}
