/**
 * Q20. Create a notepad file called Data.txt and enter the following:
 *
 * Mickey:Mouse:35:Arizona
 * Hulk:Hogan:50:Virginia
 * Roger:Rabbit:22:California
 * Wonder:Woman:18:Montana
 *
 * Write a program that would read from the file and print it out to the screen in the following format:
 *
 * Name: Mickey Mouse
 * Age: 35 years
 * State: Arizona State
 */
package com.revature.question20Tests;

import com.revature.question20.Question20;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Question20Tests {
    Question20 sut;
    private final PrintStream printStream = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    String expectedReturn;

    @Before
    public void setup(){
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown(){
        System.setOut(printStream);
        expectedReturn = null;
        sut = null;
    }

    @Test
    public void printFirstRecordTest(){
        String msg = "the class should print the first user as directed";
        expectedReturn = "Name: " + "Mickey" + " " + "Mouse" + '\'' +
                ", Age: " + "35" +
                ", State: " + "Arizona" + " State"+ '\'';
        sut = new Question20();
        Assert.assertEquals(msg,expectedReturn, outputStream.toString());
    }
}
