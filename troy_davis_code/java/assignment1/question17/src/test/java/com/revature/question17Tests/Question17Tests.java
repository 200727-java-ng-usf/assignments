/**
 * Q17. Write a program that calculates the:
 *      - simple interest on the principal, rate of interest and number of years provided by the user.
 *      - Enter principal, rate and time through the console using the Scanner class.
 *      - Interest = Principal* Rate* Time
 */
package com.revature.question17Tests;

import com.revature.question17.Question17;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question17Tests {
    Question17 sut;
    double expectedResult;

    @After
    public void tearDown(){
        sut = null;
        expectedResult = 0;
    }

    @Test
    public void testKnownRate(){
        String msg = "When given known values, the class whould return the correct interest rate";
        sut = new Question17(1000,5,3);
        expectedResult = 150;
        Assert.assertEquals(msg,expectedResult, sut.getInterest(), .001);
    }
    @Test
    public void zeroTest(){
        String msg = "When given 0 as any of the parameters, the interest returned should be zero";
        sut = new Question17(1999,0,6);
        expectedResult = 0;
        Assert.assertEquals(msg,expectedResult,sut.getInterest(),.001);
    }
}
