package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q19Test {
    Q19 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q19();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }
    @Test
    public void integerArrayList() {
        showTest.integerArrayList();
    }

    @Test
    public void isPrime() {
        int number = 10;
        assertNotNull(showTest.isPrime(number));
        assertFalse(showTest.isPrime(number));
    }
}