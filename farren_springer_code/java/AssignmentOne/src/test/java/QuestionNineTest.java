import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionNineTest {

    private QuestionNine sut;

    @Before
    public void setUp() { sut = new QuestionNine(); }

    @After
    public void tearDown() { sut = null; }

    // Positive test
    @Test
    public void sevenIsPrime() {
        boolean expectedResult = true;
        boolean actualResult = sut.isPrime(7);
        assertEquals(expectedResult, actualResult);
    }

    // Positive test
    @Test
    public void eightIsNotPrime() {
        boolean actualResult = sut.isPrime(8);
        assertNotEquals(true, actualResult);
    }

    // Negative test
    @Test (expected = NumberFormatException.class)
    public void decimalNumberResultsInNumberFormatException() {
        int nullValue = Integer.parseInt(String.valueOf(1.0));
        boolean unexpectedResult = true;
        boolean actualResult = sut.isPrime(nullValue);
    }
}