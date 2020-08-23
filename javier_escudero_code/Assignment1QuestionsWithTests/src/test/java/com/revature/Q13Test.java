package com.revature;

import org.junit.Before;
import org.junit.Test;


public class Q13Test {

    private Q13 q13;


    @Before
    public void tSetup() {
        q13 = new Q13();
    }

    @Test
    public void test() {
        int[] x = (Q13.pattern0And1Printer()); // String x = Arrays.toString(Q13.pattern0And1Printer(6));
        System.out.println(x);
    }
}