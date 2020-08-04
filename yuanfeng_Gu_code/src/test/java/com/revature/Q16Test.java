package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q16Test {
    Q16 showTest;
    String[] str1;

    @Before
    public void setShowTest(){
        this.showTest = new Q16();
        str1= new String[]{"aaa", "bbb"};
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
        this.str1 = null;
    }

    @Test
    public void commandLine() {

        showTest.commandLine(str1);

    }
}