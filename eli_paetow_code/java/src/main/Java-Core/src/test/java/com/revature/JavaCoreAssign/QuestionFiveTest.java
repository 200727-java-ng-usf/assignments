package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionFiveTest {
    private QuestionFive sut;

    @Before
    public void setup() {
        sut = new QuestionFive();
    }

    @Test
    public void factorialGood() {
        int idx = 10;
        String str = "roll tide roll";
        String expectedResult = "roll tide";
        String actualResult = sut.Q5subString(str,idx);
        assertEquals(expectedResult, actualResult);

    }

    @After
    public void tearDown() {
        sut = null;
    }
}
