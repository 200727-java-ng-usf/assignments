package com.revature.JavaCoreAssign;

import org.junit.Before;
import org.junit.After;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QuestionFourTest {
    //starting with testing first
    private QuestionFour sut;

    @Before
    public void setup(){
        sut = new QuestionFour();
    }

    @Test
    public void factorialGood(){
        //assemble
        int expectedResult = 120;
        int actualResult = sut.factorialQ4(5);
        //act
        //assert
        System.out.println("the factorial of 5 is: " + QuestionFour.factorialQ4(5));
        assertEquals(expectedResult, actualResult);

    }

    @After
    public void tearDown(){
        sut = null;
    }
}
