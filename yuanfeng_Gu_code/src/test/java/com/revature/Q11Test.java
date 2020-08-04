package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q11Test {
    Q11 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q11();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }
    @Test
    public void printFloat() {
        showTest.printFloat();
    }
}