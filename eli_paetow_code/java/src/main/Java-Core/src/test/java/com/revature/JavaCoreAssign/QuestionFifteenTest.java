package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionFifteenTest {

    private QuestionFifteen sut;

    @Before
    public void setup() {
        sut = new QuestionFifteen(5, 4);
    }

    @Test
    public void question15Add() {

        int expectedResult = 9;
        int actualResult = sut.addition(5, 4);

        assertEquals(expectedResult, actualResult);


    }
    @Test
    public void question15Sub() {

        int expectedResult = 1;
        int actualResult = sut.subtract(5, 4);

        assertEquals(expectedResult, actualResult);


    }
    @Test
    public void question15Mult() {

        int expectedResult = 20;
        int actualResult = sut.multiplication(5, 4);

        assertEquals(expectedResult, actualResult);


    }
    @Test
    public void question15Div() {

        int expectedResult = 1;
        int actualResult = sut.divide(5, 4);
//        System.out.println(5/4);

        assertEquals(expectedResult, actualResult);


    }

    @After
    public void tearDown() {
        sut = null;
    }
}
