package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class q14CasesTest {
    private q14Cases sut;



    @Before
    public void setUp() {
        sut = new q14Cases();
    }

    @After
    public void tearDown(){
        sut = null;
    }


    @Test
    public void casepick1() {
        int casePick =1;
        boolean expected = true;
        String sqre = "4";
        InputStream inContent = new ByteArrayInputStream(sqre.getBytes());
        System.setIn(inContent);
        assertEquals(expected,sut.q14Cases(casePick));
    }

    @Test
    public void noCasePick(){
        int casePick = 0;
        boolean expected = false;
        assertEquals(expected,sut.q14Cases(casePick));
    }

    @Test
    public void casePick456(){
        int casePick = 456;
        boolean expected = false;
        assertEquals(expected,sut.q14Cases(casePick));
    }
}
