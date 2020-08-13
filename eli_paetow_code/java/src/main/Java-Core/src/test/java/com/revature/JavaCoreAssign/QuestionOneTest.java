package com.revature.JavaCoreAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class QuestionOneTest {
    //test test
    //always do this first
    private QuestionOne questionOne;

    //first test to set up
    @Before
    public void setup(){
        questionOne = new QuestionOne();
    }



    //actual test
    @Test
    public void bubbleSortTestGood(){
        //arrange
        int[] unsortedArray = { 1,0,5,6,3,2,3,7,9,8,4};
        int[] sortedArray =  {0,1,2,3,3,4,5,6,7,8,9};
        //act

        //assert
        assertArrayEquals(sortedArray, questionOne.bubbleSortQ1(sortedArray));

    }

    //need negative test

    //reset test
    @After
    public void tearDown(){
        questionOne =null;
    }


}
