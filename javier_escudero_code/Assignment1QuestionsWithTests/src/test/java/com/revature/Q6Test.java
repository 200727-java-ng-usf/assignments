package com.revature;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q6Test {

    @Test
    public void testGivenOdd(){
        int oddNumber = 5;
        assertFalse(Q6.isEven(oddNumber));
    }

    @Test
    public void testGivenEven(){
        int evenNumber = 6;
        assertTrue(Q6.isEven(evenNumber));
    }

    @Test
    public void testGivenNegative(){
        int negativeOddNumber = -1;
        assertFalse(Q6.isEven(negativeOddNumber));
    }
}