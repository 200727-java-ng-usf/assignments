package com.revature;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestQ9 {

    private static int[] prime10 = {2, 3, 5, 7};
    private PrimePrinterQ9 prime = new PrimePrinterQ9();

    @Before
    public void before() {
        prime.setbounds(10);
    }

    @Test
    public void test01() {
        assertEquals(10, prime.getBounds());
    }

    @Test
    public void test02() {
        prime.findPrimes();
        ArrayList<Integer> primeList = new ArrayList<Integer>(4);
        for (int i : prime10) primeList.add(i);
        assertTrue(prime.getPrimes().equals(primeList));
    }
}
