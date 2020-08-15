import com.revature.questions.Q1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Q1Test {

    Q1 sut;
    int[] unsortedArray = {1,0,5,6,3,2,3,7,9,8,4};

    @Before
    public void setup() {
        sut = new Q1();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testBubbleSortArray() {
        int[] expectedResult = {0,1,2,3,3,4,5,6,7,8,9};
        int[] actualResult = sut.bubbleSortArray(unsortedArray);
        assertArrayEquals(expectedResult, actualResult);
    }

}
