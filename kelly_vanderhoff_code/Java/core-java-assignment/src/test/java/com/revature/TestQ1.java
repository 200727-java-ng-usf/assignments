package com.revature;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestQ1 {

    private static final int[] test1 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
    private BubbleSortQ1 sortMe = new BubbleSortQ1(test1);

//    @BeforeClass
//    public static void beforeAll() {
//    }

    @Before
    public void before() {
        sortMe = new BubbleSortQ1(test1);
    }

    @Test
    public void test1() {
        assertNotNull("BubbleSortQ1 constructed successfully", sortMe);
    }

    @Test
    public void test2() {
        assertArrayEquals(test1, sortMe.getArr());
    }

    @Test
    public void test () {
        sortMe.sort();
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expect, sortMe.getArr());
    }
}
