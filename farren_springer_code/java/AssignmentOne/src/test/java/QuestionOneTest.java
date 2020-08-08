import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuestionOneTest {

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

    private QuestionOne sut; // SUT = System Under Test

    @Before
    public void setUp() {
        sut = new QuestionOne();
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
    @Test
    public void testSolutionWithNullArray() {
        String msg = "IF a null array is provided, then impl should return an empty array.";
        int[] expectedResult = {};
        assertArrayEquals(msg, expectedResult, sut.bubbleSort(null));
    }



}
