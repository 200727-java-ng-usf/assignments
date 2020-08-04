package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q13Test {
    Q13 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q13();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }
    @Test
    public void printPattern() {

        showTest.printPattern();

    }
}