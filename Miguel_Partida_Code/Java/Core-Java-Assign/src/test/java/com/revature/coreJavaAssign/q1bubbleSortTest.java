package com.revature.coreJavaAssign;

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
        int[] expected =  sut.q1bubbleSort(actual);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void testBubbleSort2() {
        int[] actual = {8,7,2,1,7,8,2};
        int[] expected = sut.q1bubbleSort(actual);

        assertArrayEquals(expected,actual);
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
