package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class QuestionSixTest {

    private QuestionSix sut;

    @Before
    public void setup(){
        sut = new QuestionSix();
    }

    @Test
    public void returnEvenGood(){
        //assemble
        boolean expectedResult = true;
        boolean actualResult = sut.numIsEven(10);
        //act
        //assert
        assertNotEquals(false, actualResult);
    }

    @After
    public void tearDown(){
        sut =null;
    }
}
