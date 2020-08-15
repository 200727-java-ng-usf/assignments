package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionElevenTest {

    private QuestionEleven sut;

    @Before
    public void setup() {
        sut = new QuestionEleven();
    }

    @Test
    public void floatsQ11() {
        float expectedResult = 6.19f;
        float actualResult = sut.BringFloatsIn();

        Assert.assertEquals(expectedResult, actualResult, 0.0f);


    }

    @After
    public void tearDown() {
        sut = null;
    }
}

