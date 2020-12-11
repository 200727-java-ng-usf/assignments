package com.revature.questions;

import com.revature.util.operators.LessThan;
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
    int[] given = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
    int[] reversed = {9, 8, 7, 6, 5, 4, 3, 3, 2, 1, 0};
    Random rand;


    @Before
    public void t1Setup() {
        q1 = new Q1BubbleSort();
        shuffle(given);
    }

    private void shuffle(int[] arr) {
        rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
        arr = Arrays.copyOf(sorted, sorted.length);
        //ensure that an odd amount of cards are shuffled, so that it is guaranteed at least two will be out of order.
        int len = arr.length;
        len = len % 2 == 0 ? len - 1 : len;
        for (int i = 0; i < len; i++) {
            int index = rand.nextInt() % arr.length;
            // get absolute value; make sure the index is positive.
            index = index < 0 ? -index : index;
            // make sure you're not swapping a card with itself,
            // otherwise the previous assurances for an odd length is pointless
            //     and you can (unlikely, but possible) get a perfectly sorted array from random.
            if(index == i){
                index = i == 0 ? i+1 : i-1;
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    @After
    public void t1tearDown(){
        q1 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t1NotNull(){
        assertNotNull(q1);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t1GSolutionWithGivenArray(){
        // testSolutionWithGivenArray
        int[] given = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        bubbles = q1.bubbleSort(given);
        assertArrayEquals(Arrays.toString(bubbles), sorted, bubbles);
    }
    @Test
    public void t1GSolutionWithGivenArrayReverseOrder(){
        // testSolutionWithGivenArray
        int[] given = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        q1.setComparison(new LessThan());
        bubbles = q1.bubbleSort(given);
        assertArrayEquals(Arrays.toString(bubbles), reversed, bubbles);
    }
    @Test
    public void t1SolutionUnsorted(){
        bubbles = q1.bubbleSort(given);
        assertFalse(Arrays.toString(bubbles), Arrays.equals(given, bubbles));
    }
    @Test
    public void t1SolutionReversed(){
    // testSolutionsWithReversedArray / worst case scenario
        bubbles = q1.bubbleSort(reversed);
        assertArrayEquals(Arrays.toString(bubbles), sorted, bubbles);
    }
    @Test
    public void t1SolutionPresorted(){
    // testSolutionsWithPresortedArray / best case scenario
        bubbles = q1.bubbleSort(sorted);
        assertArrayEquals(Arrays.toString(bubbles), sorted, bubbles);
    }

    // other test case examples:
    // Parameterized junit tests

    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t1BubbleSortEmptyArray(){
    // testSolutionWithEmptyArray
        String msg = "If a null array is provided, the impl should return an empty array.";
        int[] expectedResult = {};
        assertArrayEquals(msg, expectedResult, q1.bubbleSort(new int[] {}));
    }
    @Test
    public void t1BubbleSortNullArray(){
        // testSolutionWithNull
        String msg = "If a null array is provided, the impl should return an empty array.";
        int[] expectedResult = {};
        assertArrayEquals(msg, expectedResult, q1.bubbleSort(null));
    }
    @Test
    public void t1BubbleSortOneElementArray(){
        // testSolutionWithNull
        String msg = "If a null array is provided, the impl should return an empty array.";
        int[] expectedResult = {1};
        assertArrayEquals(msg, expectedResult, q1.bubbleSort(new int[] {1}));
    }
    @Test
    public void t1BubbleSortMaxMinArray(){
        // testSolutionWithNull
        String msg = "If a null array is provided, the impl should return an empty array.";
        int[] expectedResult = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(msg, expectedResult, q1.bubbleSort(new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE}));
    }
    @Test
    public void t1BubbleSortMinMaxArray(){
        // testSolutionWithNull
        String msg = "If a null array is provided, the impl should return an empty array.";
        int[] expectedResult = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(msg, expectedResult, q1.bubbleSort(new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE}));
    }
    //endregion

}
