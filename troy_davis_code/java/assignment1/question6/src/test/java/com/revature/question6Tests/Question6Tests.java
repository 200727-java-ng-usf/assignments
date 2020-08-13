package com.revature.question6Tests;

import com.revature.question6.Question6;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Q6. Write a program to determine if an integer is even without using the modulus operator (%)
 */

public class Question6Tests {
    Question6 sut;

    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void nullTest(){
        String msg = "When given a null value, the method should return false ";
        sut = new Question6();
        Assert.assertFalse(msg,sut.isEven(null));
    }
    @Test
    public void zeroTest(){
        String msg = "When given zero, the method should be able to detect that it is even and return true";
        sut = new Question6();
        Assert.assertTrue(msg, sut.isEven(0));
    }
    @Test
    public void oddTest(){
        String msg = "When given an odd number, the method should return false";
        sut = new Question6();
        Assert.assertFalse(msg, sut.isEven(9999));
    }
    @Test
    public void evenTest(){
        String msg = "when given an even number, the method should return true";
        sut = new Question6();
        Assert.assertTrue(msg, sut.isEven(6666));
    }

}
