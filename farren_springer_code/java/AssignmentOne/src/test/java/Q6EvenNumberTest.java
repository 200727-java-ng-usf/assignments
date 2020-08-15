import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Q6EvenNumberTest {

    private Q6EvenNumber sut;

    @Before
    public void setUp() { sut = new Q6EvenNumber(); }

    @After
    public void tearDown() {  sut = null;  }

    // Positive Test
    @Test
    public void fiveReturnsFalse() {
        boolean expectedResult = false;
        boolean actualResult = sut.isEven(5);
        assertEquals(expectedResult, actualResult);
    }

    // Positive Test
    @Test
    public void fourDoesNotReturnFalse() {
        boolean actualResult = sut.isEven(4);
        assertNotEquals(false, actualResult);
    }

    // Negative test
    @Test (expected = NumberFormatException.class)
    public void decimalNumberResultsInNumberFormatException() {
        int nullValue = Integer.parseInt(String.valueOf(1.0));
        sut.isEven(nullValue);
    }
}