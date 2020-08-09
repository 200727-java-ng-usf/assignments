/*
    Q12. Write a program to store numbers from 1 to 100 in an array.
            Print out all the even numbers from the array.
            Use the enhanced FOR loop for printing out the numbers.
 */

package com.revature.question12;

import com.revature.question12.Question12;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question12Test {


    //create an instance of the class to test
    Question12 sut;

    @Before
    public void setup(){
        sut = new Question12(1, 100);
    }

    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void notNullTest(){
        String msg = "make sure neither array is not null";
        Assert.assertTrue(sut.getInitialArray() != null);
    }

    @Test
    public void testForNumberOfElements(){
        String msg = "When given an array, does the even only array have the correct number or elements";
        int number = sut.getInitialArray().length;
        Assert.assertEquals(50, number);
    }

}
