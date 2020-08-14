package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTenTest {

    private QuestionTen sut;

    @Before
    public void setup(){
        sut = new QuestionTen();
    }
    @Test
    public void xIsLessThanY(){
        //assemble
        int expectedResult =6;
        int actualResult = sut.xIsLessThanY(6,9);
        //act
        //assert
        assertEquals(expectedResult, actualResult);

    }


    @After
    public void tearDown(){
        sut = null;
    }
}
