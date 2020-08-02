package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q14Test {
    Q14 showTest = new Q14();

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