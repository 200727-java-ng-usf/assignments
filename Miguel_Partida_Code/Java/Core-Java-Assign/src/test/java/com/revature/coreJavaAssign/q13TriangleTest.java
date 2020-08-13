package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q13TriangleTest {
    private q13Triangle sut;

    @Before
    public void setUp(){
        sut = new q13Triangle();
    }

    @After
    public void tearDown(){
        sut = null;

    }



    @Test
    public void makeTriangle() {
    int actual = 4;
    int expectedRows = 4;

    assertEquals(expectedRows, q13Triangle.makeTriangle(actual));
    }
}