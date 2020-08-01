package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q4Test {
    Q4 showTest = new Q4();

    @Test
    public void factorial() {
        assertEquals(120,showTest.factorial(5));


    }
}