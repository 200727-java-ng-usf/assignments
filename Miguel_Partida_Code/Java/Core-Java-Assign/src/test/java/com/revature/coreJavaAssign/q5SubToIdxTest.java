package com.revature.coreJavaAssign;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q5SubToIdxTest {
    private q5SubToIdx sut;
    @Before
    public void setUp(){
        sut = new q5SubToIdx();
    }


    @Test
    public void subString() {
        int idx = 5;
        String test ="ReallyLongWord";
        String expected = sut.q5SubToIdx(idx, test);

        assertEquals(expected, sut.q5SubToIdx(idx,test));


    }
}