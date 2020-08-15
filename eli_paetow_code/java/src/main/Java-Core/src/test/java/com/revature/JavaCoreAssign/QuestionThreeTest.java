package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionThreeTest {

    private QuestionThree sut;

    @Before
    public void setup() {

        sut = new QuestionThree();
    }

    @Test
    public void reverseQ3Good() {
        //arrange
        String expectedResult = "woteaP";
        String actualResult = sut.reverseQ3("Paetow");
        //act

        //assert

    }

    @After
    public void tearDown() {
        sut = null;
    }
}


