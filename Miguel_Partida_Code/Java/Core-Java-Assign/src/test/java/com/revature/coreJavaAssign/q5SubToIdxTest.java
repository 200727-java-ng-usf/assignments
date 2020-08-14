package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q5SubToIdxTest {
    private q5SubToIdx sut;


    @Before
    public void setUp(){
        sut = new q5SubToIdx();
    }
    @After
    public void tearDown(){
        sut =null;
    }


    @Test
    public void test5andReallyLongWord() {
        int idx = 5;
        String test ="ReallyLongWord";
        String expected = "Reall";

        assertEquals(expected, sut.q5SubToIdx(idx,test));
    }

    @Test
    public void testidx0onWord(){
        int idx = 0;
        String actual = "Word";
        String expected = "Word";
        assertEquals(expected,sut.q5SubToIdx(idx,actual));
    }

    @Test
    public void testidx5onNothing() {
        int idx = 5;
        String actual = "";
        String expected = null;
        assertEquals(expected, sut.q5SubToIdx(idx, actual));
    }

}