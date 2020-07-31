package com.revature;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import com.revature.util.Misc;

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
    @Test // Test for fixed array
    public void shouldReturnSortedArray(){
        
        int[] testArray = {1,0,5,6,3,2,3,7,9,8,4};
        int[] sortedTestArray = {0,1,2,3,3,4,5,6,7,8,9};

        Q1.bubbleSort(testArray); // run 'bubbleSort' on the unsorted test array
        
        // Assert that the unsorted array is now identical to the sorted array
        assertArrayEquals(testArray, sortedTestArray);

    }

    @Test // Test for random array
    public void shouldReturnSortedRandomArray(){

        int[] testArray = Misc.randomIntArray(); // returns array of between 0 and 10000 random ints
        int[] sortedTestArray = testArray.clone();  // returns new copy of test array
        Arrays.sort(sortedTestArray);   // sort test array, used for comparison

        Q1.bubbleSort(testArray);

        assertArrayEquals(testArray, sortedTestArray);
    }
}