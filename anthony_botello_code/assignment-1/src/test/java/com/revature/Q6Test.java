package com.revature;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.revature.util.Misc;

import org.junit.Test;

public class Q6Test {
    
    @Test // tests accuracy of 'isEven' method
    public void testIsEven(){

        // check that even number returns true
        int even = 2 * Misc.getRandomInt();
        assertTrue(Q6.isEven(even));

        // check that odd number returns false
        int odd = (2 * Misc.getRandomInt()) + 1;
        assertFalse(Q6.isEven(odd));
    }
}