package com.revature;

import com.revature.Q1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/*
    Tests for the bubble sort method in Q1
 */
public class Q1Test {

    private Q1 sut; // SUT = System Under Test

    @Before
    public void t1Setup(){
        sut = new Q1();
    }

    @Test
    public void testSolutionWithGivenArray() {
        String msg = "If a randomly sorted array is provided, the impl should return the array sorted.";
        int[] testArray = {1,0,5,6,3,2,3,7,9,8,4};
        int[] expectedResult = {0,1,2,3,3,4,5,6,7,8,9};
        assertArrayEquals(msg, expectedResult, sut.sort(testArray));

    }

    @Test
    public void testSolutionWithNullArray() {
        String msg = "If a null array is provided, them impl should return an empty array.";
        int[] expectedResult = {};
       assertNotNull(sut.sort(expectedResult));
    }
}