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
        sut = new Question12(null, null);
        expectedReturn = "";
        Assert.assertEquals(msg, expectedReturn,outputStream.toString().trim());
    }

    @Test
    public void knownElementsTest(){
        msg = "when initialized using no args constructor, the method should pring the known values from 2 throgh 100";
        expectedReturn = "2\r\n4\r\n6\r\n8\r\n10\r\n" +
                         "12\r\n14\r\n16\r\n18\r\n20\r\n" +
                         "22\r\n24\r\n26\r\n28\r\n30\r\n" +
                         "32\r\n34\r\n36\r\n38\r\n40\r\n" +
                         "42\r\n44\r\n46\r\n48\r\n50\r\n" +
                         "52\r\n54\r\n56\r\n58\r\n60\r\n" +
                         "62\r\n64\r\n66\r\n68\r\n70\r\n" +
                         "72\r\n74\r\n76\r\n78\r\n80\r\n" +
                         "82\r\n84\r\n86\r\n88\r\n90\r\n" +
                         "92\r\n94\r\n96\r\n98\r\n100";
        sut = new Question12();
        Assert.assertEquals(msg, expectedReturn, outputStream.toString().trim());
    }
    @Test
    public void outOfRangeInputsTest(){
        msg = "When given a start value that is higher than the end value, the method should print nothing";
        expectedReturn = "";
        sut = new Question12(1000, 1);
        Assert.assertEquals(msg, expectedReturn, outputStream.toString().trim());
    }

}
