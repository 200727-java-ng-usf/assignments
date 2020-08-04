package com.revature.coreJavaAssign;

import org.junit.Test;

import static org.junit.Assert.*;

public class q1bubbleSortTest {


    @Test
    public void bubbleSort() {
        q1bubbleSort sort = new q1bubbleSort();
        int[] arr = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        int[] expected = {0, 1, 2, 3, 3, 5, 6, 7, 8, 9, 4};
        assertArrayEquals(expected,q1bubbleSort.bubbleSort(arr));
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
