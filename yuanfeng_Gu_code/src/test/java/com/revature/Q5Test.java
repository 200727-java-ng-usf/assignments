package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5Test {

    @Test
    public void substring() {
        String str1 = "Gu,yuanfeng";
        assertNotNull(Q5.substring(str1,2));
        assertEquals("Gu", Q5.substring(str1,2));
    }
}