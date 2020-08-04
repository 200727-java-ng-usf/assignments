package com.revature;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class TestQ1 {

    private static final int[] test1 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
    private static final int[] sort1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final int[] test2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    private static final int[] test3 = {32, 47, 53, 18, 7, 42, 103, 9000, 12344, 2938};
    private static final int[] sort3 = {7, 18, 32, 42, 47, 53, 103, 2938, 9000, 12344};

    private BubbleSortQ1 sortMe;

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

    @Test
    public void test8 () {
        sortMe.loadArray(test2);
        assertArrayEquals(test2, sortMe.getArr());
    }

    @Test
    public void test9 () {
        sortMe.loadArray(5);
        sortMe.sort();
        assertEquals(5,sortMe.getArr()[0]);
    }

    @Test
    public void test10 () {
        sortMe.loadArray();
        sortMe.sort();
        assertEquals(0, sortMe.getArr().length);
    }

    @Test
    public void test11 () {
        BubbleSortQ1 testMe = sortMe;
        assertTrue(sortMe.equals(testMe));
    }

    @Test
    public void test12 () {
        BubbleSortQ1 testMe = new BubbleSortQ1(test1);
        assertTrue(sortMe.equals(testMe));
    }

    @Test
    public void test13 () {
        assertEquals(Arrays.hashCode(test1), sortMe.hashCode());
    }

    @Test
    public void test14 () {
        assertFalse(sortMe.equals(null));
    }

    @Test
    public void test15 () {
        assertFalse(sortMe.equals("Happy"));
    }
}
