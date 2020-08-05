package com.revature.questions;

import com.revature.questions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T2Fibonacci {
    Q2Fibonacci q2;
    int len = 25;
    int[] fib;

    @Before
    public void t2setupTest() {
        q2 = new Q2Fibonacci();
        fib = new int[len];
        System.out.println();
    }

    @After
    public void t2tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t2FibonacciNotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q2);
    }
    //endregion

    //region POSITIVE
    @Test
    public void t2FibonacciArray(){
        q2.fibonacci(fib, len);
        System.out.print(Arrays.toString(fib));
        assertArrayEquals(new int[]{
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
            1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368},
            fib);
    }
    @Test
    public void t2Fibonacci(){
        q2.fibonacci(fib, len);
        System.out.print(Arrays.toString(fib));
        assertEquals(46368,
                fib[fib.length - 1]);
    }
    //endregion

    //region NEGATIVE

    //endregion

}
