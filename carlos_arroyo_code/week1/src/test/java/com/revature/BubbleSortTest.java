package com.revature;


import com.revature.testing.Sorter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class BubbleSortTest {

    private BubbleSort sut;

    @Before
    public void setup() {
        sut = new BubbleSort();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testSolutionWithGivenArray() {
        String msg = "If a randomly sorted array is provided, the impl should return the array sorted.";
        int[] testArray = {1,0,5,6,3,2,4,8,7,9};
        int[] expectedResult = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(msg, expectedResult, sut.sort(testArray));
    }

    // other test case examples:
    // testSolutionWithReversedArray
    // testSolutionWithPresortedArray
    // testSolutionWithEmptyArray

    @Test
    public void testSolutionWithNullArray() {
        String msg = "If a null array is provided, them impl should return an empty array.";
        int[] expectedResult = {};
        int[] actualResult = sut.sort(null);
        assertNotNull(actualResult);
        assertArrayEquals(msg, expectedResult, actualResult);
    }
}
