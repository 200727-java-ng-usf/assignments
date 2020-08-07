package com.revature.coreJavaAssign;

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
    public void reverseString() {
        String actual = "wowThisWorks";
        String expected = sut.q3reverse(actual);
        assertEquals(expected,actual);

    }
}