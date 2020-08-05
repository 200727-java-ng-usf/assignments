package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T1BubbleSort {
    Q1BubbleSort q1;
    int[] bubbles;
    int[] sorted = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
    int[] reversed = {9, 8, 7, 6, 5, 4, 3, 3, 2, 1, 0};
    int[] unsorted = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
    Random rand;

    T1BubbleSort(){
        rand = new Random();
    }

    @Before
    public void t1setupTest() {
        q1 = new Q1BubbleSort();
        bubbles = new int[]{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
        for (int i = 0; i < unsorted.length; i++) {
            int index = rand.nextInt() % unsorted.length;
            int temp = unsorted[i];
            unsorted[i] = unsorted[index];
            unsorted[index] = temp;
        }
        System.out.println();
    }

    @After
    public void t1tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t1BubbleSortNotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q1);
    }
    //endregion

    //region POSITIVE
    @Test
    public void t1BubbleSortSorted(){
//        Collections.shuffle(bubbles);
        q1.BubbleSort(bubbles);
        System.out.println(Arrays.toString(bubbles));
        assertArrayEquals(sorted, bubbles);
    }

    //endregion

    //region NEGATIVE
    @Test
    public void t1BubbleSortNotUnsorted(){
//        Collections.shuffle(bubbles);
        q1.BubbleSort(bubbles);
        System.out.println(Arrays.toString(bubbles));
        assertArrayEquals(sorted, bubbles);
    }
    //endregion

}
