package com.revature;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Q4Test {
    private Q4 q4; // SUT = System Under Test

    @Before
    public void T1SetUp() {
        q4 = new Q4();
    }

    @Test
    public void testGivenValueQ4() {
        System.out.println("Is " +q4.calculateFactorial(5));
    }

    @Test
    public void zeroValue() {
        System.out.println("Is " +q4.calculateFactorial(0));
    }


}