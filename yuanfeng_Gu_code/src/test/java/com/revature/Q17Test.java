package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q17Test {
    Q17 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q17();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }
    @Test
    public void showInterest() {
        showTest.showInterest(1000,5,0.05);
    }
}