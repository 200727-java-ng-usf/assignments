package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q12Test {
    Q12 showTest = new Q12();

    @Test
    public void printEven() {
        int[] number = new int[101];
        for (int i = 0; i < 100; i++) {
            number[i]=i+1;
        }

       showTest.printEven(number);

    }
}