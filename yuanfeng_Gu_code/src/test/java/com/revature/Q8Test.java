package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q8Test {

    Q8 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q8();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }

    @Test
    public void showArrayList() {
        showTest.showArrayList();
    }
}