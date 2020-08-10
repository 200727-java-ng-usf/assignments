package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class q9PrimeTest {

    private q9Prime sut;
    @Before
    public void setUp() throws Exception {
        sut = new q9Prime();
    }

    @After
    public void tearDown() throws Exception {
        sut = null;

    }

    @Test
    public void testRandom3Numbers() {
        ArrayList<Integer> actual = new ArrayList<>();
        actual.add(55);
        actual.add(73);
        actual.add(567);
        ArrayList<Integer> nonPrime = new ArrayList<>();
        ArrayList<Integer> primeNumber = new ArrayList<>();
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(nonPrime);
        expected.add(primeNumber);
        primeNumber.add(73);
        nonPrime.add(55);
        nonPrime.add(567);

        assertEquals(expected,sut.q9PrimeN(actual));

    }
}