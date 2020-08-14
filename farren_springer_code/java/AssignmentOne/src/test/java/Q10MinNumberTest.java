import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Q10MinNumberTest {

    private Q10MinNumber sut;

    @Before
    public void setUp() { sut = new Q10MinNumber(); }

    @After
    public void tearDown() { sut = null; }

    // Positive test
    @Test
    public void threeIsSmallerThanFive() {
        int expectedResult = 3;
        int actualResult = sut.smallerInt(3,5);
        assertEquals(expectedResult, actualResult);
    }

    // Negative test
    @Test (expected = NumberFormatException.class)
    public void decimalNumberPassedToSmallerIntResultsInNumberFormatException() {
        int nullValue = Integer.parseInt(String.valueOf(1.0));
        int unexpectedResult = 3;
        int actualResult = sut.smallerInt(nullValue,3);
        assertNotEquals(unexpectedResult, actualResult);
    }

}