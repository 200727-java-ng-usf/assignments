package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2Test {
    Q2 showTest = new Q2();

    @Test
    public void fibonacci() {
        assertEquals(0,showTest.fibonacci(0));
    }
}