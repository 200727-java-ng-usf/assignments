package com.revature;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
    
/**
 * Unit tests for Q1
 */
public class Q1Test {
    

    /**
     * Test for 'bubbleSort' method of Q1
     * 'bubbleSort' takes an int array as input
     * should output sorted array
     */
    @Test
    public void shouldReturnSortedArray(){
        
        int[] testArray = {1,0,5,6,3,2,3,7,9,8,4};
        int[] sortedTestArray = {0,1,2,3,3,4,5,6,7,8,9};

        Q1.bubbleSort(testArray); // run 'bubbleSort' on the unsorted test array
        
        // Assert that the unsorted array is now identical to the sorted array
        assertArrayEquals(testArray, sortedTestArray);
    }
}