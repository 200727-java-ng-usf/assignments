package com.revature;

import org.junit.Test;


public class Q3Test {

    private Q3 q3; // SUT = System Under Test

    @Test
    public void testQ3() {
        q3 = new Q3(); // creating a class object
        StringBuilder sb = new StringBuilder("abc");
        System.out.println("String was: " + sb);
        q3.reverseMethod(sb);
        System.out.println("\nAfter reversing it:\n" + sb);
    }
}
