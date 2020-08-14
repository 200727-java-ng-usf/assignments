package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTwelveTest {
    private QuestionTwelve sut;

    @Before
    public void setup() {
        sut = new QuestionTwelve();
    }

    @Test
    public void evenNumsOnly() {
        //assemble
        int[] expectedResult = {2,4,6,8};
        int[] actualResult = sut.evenArrayQ12(8);
        //act
        //assert
        assertEquals(expectedResult[2], actualResult[2]);
    }

    @After
    public void tearDown() {
        sut = null;
    }
}
