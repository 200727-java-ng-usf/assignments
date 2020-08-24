package com.revature;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q16Test {

    private Q16 q16;

    @Before
    public void setup(){
        q16 = new Q16();
    }

    @Test
    public void testLength(){
        String[] h = {"hello"};
        int n = Q16.tst(h);
        assertEquals(5 ,n, 0);
    }
}