package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4Test {
    Q4 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q4();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }

    @Test
    public void factorial() {
        assertNotNull(showTest.factorial(2));
        assertEquals(120,showTest.factorial(5));


    }
}