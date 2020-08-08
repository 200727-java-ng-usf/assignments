import mainpackage.BubbleSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import static org.junit.Assert.*;

public class BubbleTest {

    private BubbleSort sut;

    @Before
    public void setUp() {
        sut = new BubbleSort();
    } // Call to the class being tested

    @After
    public void tearDown() {
        sut = null;
    } // Reset at the end
    @Test
    public void givenArray() {
        String msg = "If randomly sorted array is provided, should return sorted in order";
        int[] testArray = {1,0, 5, 6,3,2,3,7,9,8,4};
        int[] expectedArray = {0,1,2,3,3,4,5,6,7,8,9};
        assertArrayEquals(msg, expectedArray, sut.bubbleSort(testArray));
    }

    @Test
    public void nullArray() {
        String msg2 = "If a null array is passed, should return empty array";
        int [] expectedResult = {};
        int[] actualResult = sut.bubbleSort(null);
        assertNotNull(actualResult);
        assertArrayEquals(msg2, expectedResult, actualResult);
    }

}
