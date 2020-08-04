import mainpackage.BubbleSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BubbleTest {
    private static final int[] test1 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
    private static final int[] sort1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final int[] test2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    private BubbleSort sortMe;

    @Before
    public void before() { sortMe = new BubbleSort(); }

    @Test
    public void test1() {
        //sortMe.setBubbleSorts(sort1);
        assertNotNull("Bubblesort constructed successfully", sortMe);
    }

    @Test
    public void test2() {
        //sortMe.setBubbleSorts();
        //assertArrayEquals(test1, sortMe.getBubbleSorts());
        System.out.println(sortMe);
        sortMe.bubbleSort();
        System.out.println(sortMe);
    }

}
