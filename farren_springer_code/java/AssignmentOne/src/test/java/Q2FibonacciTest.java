import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Q2FibonacciTest {

    private Q2Fibonacci sut;

    @Before
    public void setUp() { sut = new Q2Fibonacci();}

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
        sut.fibonacciGenerator(nullValue);
    }

    // Negative test
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void inputOf0ThrowsArrayIndexOutOfBoundsException() {
        int zeroValue = 0;
        sut.fibonacciGenerator(zeroValue);
    }
}