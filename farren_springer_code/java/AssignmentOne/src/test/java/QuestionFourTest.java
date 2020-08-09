import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionFourTest  {

    private QuestionFour sut;

    @Before
    public void setUp() {
        sut = new QuestionFour();
    }
    @After
    public void tearDown() { sut = null;
    }

    // Positive Test
    @Test
    public void threeFactorialIsSix() {
        int expectedResult = 6;
        int actualResult = sut.factorial(3);
        assertEquals(expectedResult, actualResult);
    }

    // Negative Test
    @Test (expected = NumberFormatException.class)
    public void nullValuePassedToFactorialThrowsNumberFormatException() {
        int nullValue = Integer.parseInt(null);
        int unexpectedResult = 4;
        int actualResult = sut.factorial(nullValue);
        assertNotEquals(unexpectedResult, actualResult);

    }
}