package com.revature;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q10Test {
    
    @Test // test if returns minimum
    public void testIfMinimumReturned(){

        assertEquals(Q10.findMin(5, 3), 3);
        assertEquals(Q10.findMin(3, 5), 3);
        assertEquals(Q10.findMin(3, 3), 3);
    }
}