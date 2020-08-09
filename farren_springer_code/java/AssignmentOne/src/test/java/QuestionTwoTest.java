import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

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

    @Test (expected = NumberFormatException.class)
    public void nullIntThrowsException() {
        int nullInt = Integer.parseInt(null);
        sut.fibonacciGenerator(nullInt);
    }



}