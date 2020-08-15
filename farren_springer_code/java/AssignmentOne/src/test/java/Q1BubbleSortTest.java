import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Q1BubbleSortTest {

    /**
     * methods to test in QuestionOne
     * bubbleSort(int[] arr)
     */

    /*
     Other possible tests to run
        - testSolutionWithReversedArray ("worst" case)
        - testSolutionWithPresortedArray
        - testSolutionWithEmptyArray
     */

    private Q1BubbleSort sut; // SUT = System Under Test

    @Before
    public void setUp() {
        sut = new Q1BubbleSort();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    /**
     * Examples from demo of unit tests
     */
    @Test
    public void testSolutionWithGivenArray() {
        String msg = "If a randomly sorted array is provided, the impl should return the array sorted.";
        int[] testArray = {1,0,5,6,3,2,3,7,9,8,4};
        int[] expectedResult = {0,1,2,3,3,4,5,6,7,8,9};
        assertArrayEquals(msg, expectedResult, sut.bubbleSort(testArray));
    }

    // Negative test
    @Test (expected = NullPointerException.class)
        public void nullArrayThrowsException() {
            int[] nullArray = null;
        sut.bubbleSort(nullArray);
        }

}
