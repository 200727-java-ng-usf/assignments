package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q10Test {
    Q10 showTest = new Q10();
    @Test
    public void minNumber() {
        assertEquals(2,showTest.minNumber(1,2));

    }
}