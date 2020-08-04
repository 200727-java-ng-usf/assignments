package com.revature;

import com.revature.BubbleSort;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

    private static final int[] sort1 = {0,3,4,27,43,236};
    private static final int[] sort2 = {0,1,2,3,4,5,6,7,8};

    private BubbleSort sortTest;

    @Test
    public void evaluate() {
        sortTest = new BubbleSort(sort1);
    }

    @Test
    public void evaluate2() {
        sortTest = new BubbleSort(sort2);
    }
}
