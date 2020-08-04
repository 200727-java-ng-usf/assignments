package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2Test {
    Q2 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q2();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }


    @Test
    public void fibonacci() {
        assertNotNull(showTest.fibonacci(3));
        assertNotEquals(1,0,showTest.fibonacci(0));
        assertEquals(0,showTest.fibonacci(0));
    }
}