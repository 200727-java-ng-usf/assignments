package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q10Test {
    Q10 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q10();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }
    @Test
    public void minNumber() {
        assertNotNull(showTest.minNumber(5,6));
        assertEquals(1,showTest.minNumber(1,2));

    }
}