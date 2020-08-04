package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q12Test {
    Q12 showTest;
    int[] number;

    @Before
    public void setShowTest(){
        this.showTest = new Q12();
        number = new int[101];
        for (int i = 0; i < 100; i++) {
            number[i]=i+1;
        }
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
        this.number =null;
    }

    @Test
    public void printEven() {

        showTest.printEven(number);

    }
}