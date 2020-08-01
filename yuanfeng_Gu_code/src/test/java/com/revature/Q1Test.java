package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1Test {

    Q1 showTest = new Q1();
    int[] arrayNum = new int[]{5,4,3,2,1,};


    @Test
    public void bubbleSort() {

        int[] result = showTest.BubbleSort(arrayNum);
        assertArrayEquals(result,showTest.BubbleSort(arrayNum));
        for(int i = 0; i < arrayNum.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}