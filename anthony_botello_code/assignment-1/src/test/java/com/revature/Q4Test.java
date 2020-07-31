package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * Unit test for Q3
 */
public class Q4Test {

    @Test // Tests that 'fibonacci' returns null for inputs less than 0
    public void testIfReturnsNullForNegativeInput(){
        assertTrue(Q4.factorial(-1) == null);
    }
    
    @Test // tests accuracy for first 25 factorials
    public void testFirst20Factorials(){

        long[] first20Factorials = {
            1,1,2,6,24,120,720,5040,40320,362880,3628800,
            39916800,479001600,6227020800L,87178291200L, 
            1307674368000L, 20922789888000L,355687428096000L,
            6402373705728000L,121645100408832000L
        };

        for(int i = 0; i < 20; i++){

            long expected = first20Factorials[i];
            long result = Q4.factorial(i).longValue();

            assertEquals(expected, result);
        }
        
    }
}