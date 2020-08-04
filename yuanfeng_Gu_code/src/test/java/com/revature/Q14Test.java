package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q14Test {
    Q14 showTest;

    @Before
    public void setShowTest(){
        this.showTest = new Q14();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }

    @Test
    public void menu() {
        showTest.menu();
    }

    @Test
    public void squareRoot() {
        System.out.println(showTest.SquareRoot(4));

    }

    @Test
    public void today() {
        showTest.today();
    }

    @Test
    public void stringSplit() {
        showTest.StringSplit();
    }
}