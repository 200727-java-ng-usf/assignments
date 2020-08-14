package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q1bubbleSortTest {

    private q1bubbleSort sut;

    @Before
    public void setUp() {
        sut = new q1bubbleSort();
    }

    @Test
    public void testBubbleSort1() {
        int[] actual = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        int[] expected =  {0, 1, 2, 3, 3, 4, 5, 6, 7, 8 ,9};

        assertArrayEquals(expected,sut.q1bubbleSort(actual));
    }

    @Test
    public void BubblesortPhoneNumber() {
        int[] actual = {8,7,2,1,7,8,2};
        int[] expected = {1,2,2,7,7,8,8 };

        assertArrayEquals(expected,sut.q1bubbleSort(actual));
    }

    @Test
    public void bubblesortNull() {
        int[] actual = {};
        int[] expected = {};

        assertArrayEquals(expected,sut.q1bubbleSort(actual));
    }
    @After
    public void tearDown(){
        sut = null;
 }
}

//package com.revature;
//import com.revature.coreJavaAssign.q1bubbleSort;
//import org.junit.Test;
//import org.junit.Before;
//import static org.junit.Assert.*;
//
//public class q1bubbleSortTest {
//
//////    static int[] testBS ={1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
////   private q1bubbleSort sorted = new q1bubbleSort();
//////
//////    @Before
//////    public void before(){
//////        sorted = new q1bubbleSort(testBS);
//////    }
////
////    @Test
////    public void test1(){
////        assertArrayEquals(sorted.);
////
////
////    }
////
////}
