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
    public void make4rowTriangle() {
    int actual = 4;
    int expectedRows = 4;

    assertEquals(expectedRows, q13Triangle.makeTriangle(actual));
    }

    @Test
    public void make2rowTriangle() {
        int actual = 2;
        int expectedRows = 2;

        assertEquals(expectedRows, q13Triangle.makeTriangle(actual));
    }

    @Test
    public void makeTriangle() {
        int actual = 0;
        int expectedRows = 0;

        assertEquals(expectedRows, q13Triangle.makeTriangle(actual));
    }
}