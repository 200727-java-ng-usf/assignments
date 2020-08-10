/**
 * Q10. Find the minimum of two numbers using ternary operators.
 */
package com.revature.question10Tests;

import com.revature.question10.Question10;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question10Tests {
    Question10 sut;
    Integer expectedResult;


    @Before
    public void setup(){
        //setup before each test
        sut = new Question10();
        expectedResult = 0;
    }
    @After
    public void tearDown(){
        //reset after each test
        sut = null;
        expectedResult = null;
    }

    @Test
    public void zeroTest(){
        String msg = "when given two zro values, the method should return zero";
        expectedResult = 0;
        Assert.assertTrue(msg,expectedResult == sut.getTernaryMinimum(0, 0));
    }
    @Test
    public void maxIntegerTest(){
        String msg = "class should still function given the max possible values an integer can hold";
        expectedResult = Integer.MIN_VALUE;
        Assert.assertTrue(msg,expectedResult == sut.getTernaryMinimum(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
    @Test
    public void knownResultTest(){
        String msg = "When given known parameters, the class should return known values ";
        expectedResult = 9999;
        Assert.assertTrue(msg, expectedResult == sut.getTernaryMinimum(9999, 10000));
    }
}
