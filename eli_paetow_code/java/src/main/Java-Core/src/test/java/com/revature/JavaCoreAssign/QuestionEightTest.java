package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QuestionEightTest {

    private QuestionEight sut;

    @Before
    public void setup() {
        sut = new QuestionEight();
    }

    @Test
    public void palindromeQ8Good() {
        //this works dont know why it is failing

        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("madam, civic, radar, kayak, refer, did"));
        ArrayList<String> actualResult = sut.palindromeQ8();
        assertEquals(expectedResult, actualResult);


    }

    @After
    public void tearDown() {
        sut = null;
    }
}


