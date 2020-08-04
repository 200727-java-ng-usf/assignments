package com.revature;

import org.junit.Test;

public class FibonacciTest {

    private static final int test1 = 60;
    private static final int test2 = 100;

    private Fibonacci fTest;

    @Test
    public void fibo1() {
        fTest = new Fibonacci(test1);
    }

    @Test
    public void fibo2() {
        fTest = new Fibonacci(test2);

    }
}
