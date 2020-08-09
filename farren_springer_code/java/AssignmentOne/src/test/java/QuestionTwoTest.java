import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionTwoTest {

    private QuestionTwo sut;

    @Before
    public void setUp() { sut = new QuestionTwo();}

    @After
    public void tearDown() {sut = null;}

    // Positive test
    @Test
    public void firstThreeFibonacciCorrect() {
        int[] expectedResult = new int[] {0,1,1};
        int[] actualResult = sut.fibonacciGenerator(3);
        assertArrayEquals(expectedResult, actualResult);

    }

    // Negative test
    @Test (expected = NumberFormatException.class)
    public void nullValueThrowsException() {
        int nullValue = Integer.parseInt(null);
        int[] unexpectedResult = {0, 1, 1, 2};
        int[] actualResult = sut.fibonacciGenerator(nullValue);
        assertNotEquals(unexpectedResult, actualResult);
    }

    // Negative test
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void inputOf0ThrowsArrayIndexOutOfBoundsException() {
        int zeroValue = 0;
        int[] unexpectedResult = {0};
        int[] actualResult = sut.fibonacciGenerator(zeroValue);
        assertNotEquals(unexpectedResult, actualResult);
    }



}