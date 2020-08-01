package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q6Test {
    Q6 showTest = new Q6();
    @Test
    public void isEven() {
        int number =6;
        assertEquals(true,showTest.isEven(number));

    }
}