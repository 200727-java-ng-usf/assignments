package com.revature;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Q12Test {

    private Q12 q12;
    private int[] arr2;
    private int COUNT = 100;

    @Before
    public void tSetup() {
        q12 = new Q12();
        arr2 = q12.numbersStored1to100ToArray();
    }

    @Test
    public void all100NumbersSaved() {
        assertEquals(COUNT, arr2.length);
    }

    @Test
    public void test1stNumberIs1andLastIs100() {
        assertEquals(1, arr2[0]);
        assertEquals(100, arr2[99]);
    }

    @Test
    public void testIfAllNumbersAreEvenAndItsCountIs50() {
        int i = 1; // [0] = 1, [1] = 2, [2] = 3, ...
        Arrays.sort(arr2);
        int evenNumbersCount = 0;
        while (i < arr2.length) {
            // test foe even numbers if evenly divisible by 2
            assertEquals(0, arr2[i] % 2);
            ++evenNumbersCount;
            i += 2;
        }
        // total even count from inclusive 1 to 100 must be 50
        assertEquals(evenNumbersCount, COUNT/2);
    }
}

