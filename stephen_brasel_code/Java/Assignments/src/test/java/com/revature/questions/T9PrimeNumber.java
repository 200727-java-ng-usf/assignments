package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class T9PrimeNumber {
    Q9PrimeNumber q9;
    Integer[] primesToHundred = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void t9setupTest() {
    }

    @After
    public void t9tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t9NotNull(){
        q9 = new Q9PrimeNumber(100);
        assertNotNull(q9);
    }
    //endregion

    //region POSITIVE
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

    //region NEGATIVE

    //endregion

}
