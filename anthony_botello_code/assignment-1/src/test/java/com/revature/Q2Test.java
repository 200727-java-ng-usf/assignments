package com.revature;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for Q2
 */
public class Q2Test {

    @Test // Tests that 'fibonacci' returns null for inputs less than 0
    public void testIfReturnsNullForNegativeInput(){
        assertTrue(Q2.fibonacci(-1) == null);
    }


    @Test // Tests the accuracy of 'fibonacci' for the first 25 Fibonacci numbers
    public void testForFirst25FibonacciNumbers(){

        long[] first25FibonacciNumbers = {0,1,1,2,3
                                        ,5,8,13,21,34
                                        ,55,89,144,233,377
                                        ,610,987,1597,2584,4181
                                        ,6765,10946,17711,28657,46368};
            
        for(int i = 0; i < 24; i++){

            long expected = first25FibonacciNumbers[i];
            long returned = Q2.fibonacci(i).longValue();
            assertTrue(expected == returned);
        }
    }
}