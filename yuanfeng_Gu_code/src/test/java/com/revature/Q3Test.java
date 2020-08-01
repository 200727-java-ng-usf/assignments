package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3Test {
    Q3 showTest = new Q3();
    @Test
    public void reverse() {

        String str = "NBA";
        assertEquals("ABN",showTest.reverse(str));
    }
}