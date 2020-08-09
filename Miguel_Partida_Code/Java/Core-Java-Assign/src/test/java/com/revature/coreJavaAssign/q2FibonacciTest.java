package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q2FibonacciTest {
    private q2Fibonacci sut;

    @Before
    public void setUp() {
        sut = new q2Fibonacci();
    }


    @After
    public void tearDown(){
        sut = null;

    }

    @Test
    public void testq2with25() {
        int test =25 ;
        int[] expected ={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
        assertArrayEquals(expected,sut.q2Fibonacci(test));

    }
    @Test
    public void testq2with2(){
        int test = 2;
        int[] expected ={0,1} ;
        assertArrayEquals(expected,sut.q2Fibonacci(test));
    }

    @Test
    public void testq2with3(){
        int test=3;
        int[] expected = {0, 1, 1};
        assertArrayEquals(expected,sut.q2Fibonacci(test));

    }


}