package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q3ReverseTest {
    private q3Reverse sut;

    @Before
    public void setUp(){
        sut = new q3Reverse();
    }

    @Test
    public void reverseMiguel() {
        String actual = "miguel";
        String expected = "leugim";
        assertEquals(expected,sut.q3reverse(actual));
    }
    @Test
    public void reverseNothing() {
        String actual = "";
        String expected = "";
        assertEquals(expected,sut.q3reverse(actual));
    }

    @After
    public void tearDown(){
        sut = null;

    }
}