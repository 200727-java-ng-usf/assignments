/*
    Q1. Perform a bubble sort on the following integer array:
        - 1,0,5,6,3,2,3,7,9,8,4
 */
package com.revature.qeustion1Test;

import com.revature.question1.Question1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question1Test {
    int[] test;
    int[] proof;
    Question1 sut;

    @Before
    public void setup(){
        //set the test conditions for each test
        test = new int[]{1, 0, 5, 6, 3, 2, 7, 9, 8, 4};
        proof = new int[]{0,1,2,3,4,5,6,7,8,9};
        sut = new Question1(test);
    }

    @After
    public void tearDown(){
        //reset the system under test
        sut = null;
    }

    @Test
    public void notNullTest(){
        String msg = "test to make sure that the fields are not null";
        System.out.println(sut.toString());
        Assert.assertTrue(sut.getGivenArray() != null);
        Assert.assertTrue(sut.getSortedArray() != null);
    }
    @Test
    public void proofTest(){
        String msg = "does the method return an array that matches a proof array?";
        Assert.assertArrayEquals(msg,proof, sut.getSortedArray());
    }
    @Test
    public void testWithNull(){
        String msg = "If given a null array, the class should return an empty array";
        //generate null array
        int[] nullArray = null;
        //ser given array to the null value
        sut.setGivenArray(nullArray);
        //generate empty array
        int[] expectedResult = {};
        Assert.assertArrayEquals(msg,expectedResult, sut.getSortedArray());
    }
}
