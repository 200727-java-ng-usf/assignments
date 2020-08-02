package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Q9Test {

    @Test // test prime checker
    public void testIsPrime(){

        assertTrue(Q9.isPrime(7));
        assertFalse(Q9.isPrime(10));
    }

    @Test // test that returned list contains all primes less than 100
    public void testIfListContainsAllPrimesLessThan100(){

        List<Integer> list1To100 = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            list1To100.add(i);
        }

        List<Integer> expectedList = Arrays.asList(
                                            2, 3, 5, 7, 11, 
                                            13, 17, 19, 23, 29, 
                                            31, 37, 41, 43, 47, 
                                            53, 59, 61, 67, 71, 
                                            73, 79, 83, 89, 97
                                            );

        List<Integer> resultList = Q9.getPrimes(list1To100);

        assertEquals(expectedList, resultList);
    }
    
}