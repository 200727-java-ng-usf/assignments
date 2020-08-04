package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class Q1Test {

    Q1 showTest;
    int[] arrayNum;
    int[] result;


    @Before
    public void setUp() {
        this.showTest = new Q1();
        this.arrayNum = new int[]{5, 4, 3, 2, 1,};
        this.result = new int[]{1,2,3,4,5};
    }

    @After
    public void cutDown(){
        this.showTest =null;
        this.arrayNum=null;
        this.result =null;
    }

    @Test
    public void bubbleSort() {
        assertNotNull(showTest.BubbleSort(arrayNum));
        assertArrayEquals(result,showTest.BubbleSort(arrayNum));


    }
}