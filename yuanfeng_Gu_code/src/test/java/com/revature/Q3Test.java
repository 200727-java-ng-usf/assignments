package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q3Test {
    Q3 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q3();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }
    @Test
    public void reverse() {

        String str = "NBA";
        assertNotNull(showTest.reverse(str));
        assertNotEquals("ABN","CCC",showTest.reverse(str));
        assertEquals("ABN",showTest.reverse(str));
    }
}