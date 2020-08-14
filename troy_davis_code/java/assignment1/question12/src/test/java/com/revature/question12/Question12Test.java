/*
    Q12. Write a program to store numbers from 1 to 100 in an array.
            Print out all the even numbers from the array.
            Use the enhanced FOR loop for printing out the numbers.
 */

package com.revature.question12;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Question12Test {


    //create an instance of the class to test
    Question12 sut;
    private final PrintStream printStream = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    String expectedReturn;
    String msg;


    @Before
    public void setup(){
        System.setOut(new PrintStream(outputStream));
        expectedReturn = null;
        msg = null;
    }

    @After
    public void tearDown(){
        sut = null;
        System.setOut(printStream);
    }

    @Test
    public void notNullTest(){
        msg = "make sure neither array is not null";
        sut = new Question12();
    }

    @Test
    public void testForNumberOfElements(){
        String msg = "When given an array, does the even only array have the correct number or elements";
        //int number = sut.getEvenOnlyArray().length;
        //Assert.assertEquals(50, number);
    }

}
