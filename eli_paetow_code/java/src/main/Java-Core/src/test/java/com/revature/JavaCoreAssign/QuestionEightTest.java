package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class QuestionEightTest {

    private QuestionEight sut;

    @Before
    public void setup() {
        sut = new QuestionEight();
    }

    @Test
    public void palindromeQ8Good() {

        String expectedResult = "[madam, civic, radar, kayak, refer, did]";
        ArrayList<String> actualResult = sut.palindromeQ8();
        assertEquals(expectedResult, actualResult);


    }

    @After
    public void tearDown() {
        sut = null;
    }
}


