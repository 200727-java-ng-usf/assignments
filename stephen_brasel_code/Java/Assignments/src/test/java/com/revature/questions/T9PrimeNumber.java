package com.revature.questions;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

public class T9PrimeNumber {
    private Q9PrimeNumber q9;
    private Integer[] primesToHundred = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void t9Setup() {
        q9 = new Q9PrimeNumber(100);
    }

    @After
    public void t9TearDown(){
        q9 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t9NotNull(){
        q9 = new Q9PrimeNumber(100);
        assertNotNull(q9);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t9PrimeNumberPrintTest(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        q9 = new Q9PrimeNumber(100);
        q9.populatePrimes();
        System.out.print(q9.getPrimeList());
        assertEquals(Arrays.toString(primesToHundred), outContent.toString());

        System.setOut(originalOut);
        System.setErr(originalErr);

        System.out.print(q9.getPrimeList());
    }
    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t9IntMin(){
        q9 = new Q9PrimeNumber(Integer.MIN_VALUE);
        assertEquals(new ArrayList<Integer>(), q9.getPrimeList());
    }
    @Test
    public void t9Zero(){
        q9 = new Q9PrimeNumber(0);
        assertEquals(new ArrayList<Integer>(), q9.getPrimeList());
    }
//    @Test
//    public void t9PrimeNegative(){
//        assertFalse(Q9PrimeNumber.isPrime(-7));
//    }
//    @Test
//    public void t9Prime561(){
//        assertFalse(Q9PrimeNumber.isPrime(561));
//    }
//    @Test
//    public void t9PrimeINT_MAX(){
//        assertTrue(Q9PrimeNumber.isPrime(Integer.MAX_VALUE));
//    }

    //endregion

}
