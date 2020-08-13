package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private BubbleSort sut;

    @Before
    public void setUp(){
        sut = new BubbleSort();
    }

    @Test
    public void testBubbleSort(){
        String msg = "If a randomly sorted array is provided, the impl should return the array sorted.";
        int[] testArray = {1,0,5,6,3,2,3,7,9,8,4};
        int[] expectedResult = {0,1,2,3,3,4,5,6,7,8,9};
        assertArrayEquals(msg, expectedResult, sut.bubbleSort(testArray));

    }

    @After
    public void tearDown(){
        sut = null;
    }


}
