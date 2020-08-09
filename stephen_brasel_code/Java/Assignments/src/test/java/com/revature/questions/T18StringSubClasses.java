package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class T18StringSubClasses {
    Q18StringSubClasses q18;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void t19Setup() {
        q18 = new Q18StringSubClasses();
    }

    @After
    public void t19TearDown(){
        q18 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t19NotNull(){
        assertNotNull(q18);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t19HasUpperNo() {
        assertEquals(false, q18.hasUpper("this is a test."));
    }
    @Test
    public void t19HasUpperYes() {
        assertEquals(true, q18.hasUpper("This is a test."));
    }
    @Test
    public void t19HasUpperYesEnd() {
        assertEquals(true, q18.hasUpper("this is a test. I"));
    }

    @Test
    public void t19SwapCaseNo() {
        String result = q18.swapCase("hello");
        assertEquals("HELLO", result);
    }

    @Test
    public void t19SwapCaseYes() {
        String result = q18.swapCase("HELLO12");
        assertEquals("HELLO12", result);
    }

    @Test
    public void t19ToIntAddN() {
        Integer i = q18.toIntAddN("31", 10);
        assert(Integer.compare(41, i) == 0);
    }
    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t19HasUpperNothing() {
        assertFalse(q18.hasUpper(""));
    }

    @Test
    public void t19SwapCaseNothing() {
        String result = q18.swapCase("");
        assertEquals("", result);
    }

    @Test(expected = NumberFormatException.class)
    public void t19ToIntAddNExcept() {
        Integer i = q18.toIntAddN("Seven", 10);
    }

    //endregion
}