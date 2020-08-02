package com.revature;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestQ1 {

    private static final int[] test1 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
    private static final int[] sort1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final int[] test2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

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
    public void test3 () {
        sortMe.sort();
        assertArrayEquals(sort1, sortMe.getArr());
    }

    @Test
    public void test4 () {
        sortMe.sort();
        sortMe.sort();
        assertArrayEquals(sort1, sortMe.getArr());
    }

    @Test
    public void test5 () {
        sortMe.setArr(test2);
        assertArrayEquals(test2, sortMe.getArr());
    }

    @Test
    public void test6 () {
        sortMe.setArr(test2);
        sortMe.sort();
        assertArrayEquals(sort1, sortMe.getArr());
    }

    @Test
    public void test7 () {
        String result = "BubbleSortQ1{arr=" + Arrays.toString(test1) + "}";
        assertEquals(result, sortMe.toString());
    }
}
