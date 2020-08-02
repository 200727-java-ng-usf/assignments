package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Q19Test {
    
    private List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    @Test // test summation of evens
    public void testSummationOfEvens(){
        assertTrue(Q19.sumEven(list) == 30);
    }

    @Test // test summation of odds
    public void testSummationOfOdds(){
        assertTrue(Q19.sumOdd(list) == 25);
    }

    @Test // test removal of primes
    public void testRemovalOfPrimes(){
        
        List<Integer> expected = Arrays.asList(1,4,6,8,9,10);
        list = Q19.removePrimes(list);

        assertEquals(expected, list);
    }
}