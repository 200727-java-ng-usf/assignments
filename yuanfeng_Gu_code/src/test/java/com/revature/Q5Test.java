package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5Test {
    Q5 showTest = new Q5();
    @Test
    public void substring() {
        String str1 = "Gu,yuanfeng";

        assertEquals("Gu",showTest.substring(str1,2));
    }
}