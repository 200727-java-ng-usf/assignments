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
        prime.setBounds(10);
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

    @Test
    public void test03() {
        ArrayList<Integer> testList = new ArrayList<>(4);
        for (int i = 0; i < testList.size(); i++) testList.add(i);
        prime.findPrimes();
        assertFalse(prime.getPrimes().equals(testList));
    }

    @Test
    public void test04() {
        assertNotEquals(7, prime.getBounds());
    }

    @Test
    public void test05() {
        prime.findPrimes();
        assertEquals(10, prime.getBounds());
    }

    @Test
    public void test06() {
        prime.findPrimes();
        assertNotEquals(7, prime.getBounds());
    }

    @Test
    public void test07() {
        prime.setBounds(100);
        assertEquals(100, prime.getBounds());
    }

    @Test
    public void test08() {
        prime.setBounds(100);

    }

    @Test
    public void test09() {
        String expected = "PrimePrinterQ9{bounds=" + prime.getBounds() + "}";
        assertEquals(expected, prime.toString());
    }
}
