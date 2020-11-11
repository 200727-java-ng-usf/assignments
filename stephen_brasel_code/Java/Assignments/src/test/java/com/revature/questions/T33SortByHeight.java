package com.revature.questions;

import com.revature.util.LessThan;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T33SortByHeight {
    Q33SortByHeight sut;
    int[] bubbles;
    int[] sorted = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
    int[] given = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
    int[] reversed = {9, 8, 7, 6, 5, 4, 3, 3, 2, 1, 0};

    int[] trees = {-1};
    Random rand;


    @Before
    public void t1Setup() {
        sut = new Q33SortByHeight();
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
        sut = null;
    }

    //region UTILITYTESTS
    @Test
    public void t1NotNull(){
        assertNotNull(sut);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t1GSolutionWithGivenArray(){
        // testSolutionWithGivenArray
        int[] given = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        bubbles = sut.sortByHeight(given, trees);
        assertArrayEquals(Arrays.toString(bubbles), sorted, bubbles);
    }
    @Test
    public void t1SolutionUnsorted(){
        bubbles = sut.sortByHeight(given, trees);
        assertFalse(Arrays.toString(bubbles), Arrays.equals(given, bubbles));
    }
    @Test
    public void t1SolutionReversed(){
    // testSolutionsWithReversedArray / worst case scenario
        bubbles = sut.sortByHeight(reversed, trees);
        assertArrayEquals(Arrays.toString(bubbles), sorted, bubbles);
    }
    @Test
    public void t1SolutionPresorted(){
    // testSolutionsWithPresortedArray / best case scenario
        bubbles = sut.sortByHeight(sorted, trees);
        assertArrayEquals(Arrays.toString(bubbles), sorted, bubbles);
    }
    @Test
    public void t1GSolutionWithGivenTreeArray(){
        // testSolutionWithGivenArray
        int[] given = {-1, 150, 190, 170, -1, -1, 160, 180};
        sorted = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};
        bubbles = sut.sortByHeight(given, trees);
        assertArrayEquals(Arrays.toString(bubbles), sorted, bubbles);
    }
    @Test
    public void t1GSolutionWithGivenTreeArray7(){
        // testSolutionWithGivenArray
        int[] given = {150, 190, 170, -1, -1, 160, 180, -1};
        sorted = new int[]{150, 160, 170, -1, -1, 180, 190, -1};
        bubbles = sut.sortByHeight(given, trees);
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
        assertArrayEquals(msg, expectedResult, sut.sortByHeight(new int[] {}, trees));
    }
    @Test
    public void t1BubbleSortNullArray(){
    // testSolutionWithNull
        String msg = "If a null array is provided, the impl should return an empty array.";
        int[] expectedResult = {};
        assertArrayEquals(msg, expectedResult, sut.sortByHeight(null, trees));
    }
    //endregion

}
