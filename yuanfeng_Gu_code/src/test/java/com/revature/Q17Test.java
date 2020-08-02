package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q17Test {
    Q17 showTest = new Q17();
    @Test
    public void showInterest() {
        showTest.showInterest(1000,5,0.05);
    }
}