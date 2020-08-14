package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class q16NofCharTest {
    private q16NofChar sut;

    @Before
    public void setUp() throws Exception {
        sut = new q16NofChar();
    }


    @After
    public void tearDown() throws Exception {
        sut = null;
    }


    @Test
    public void printwoowieinargs() {
        String[] args = new String[1];
        args[0]="woowie";
        String expected = "woowie";
        assertEquals(expected,sut.printargs(args));

    }

    @Test
    public void printNothinginArgs(){
        String[] args = new String[0];
        String expected = "";
        assertEquals(expected,sut.printargs(args));
    }
}