import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionFiveTest {

    private QuestionFive sut;

    @Before
    public void setUp()  {
        sut = new QuestionFive();
    }

    @After
    public void tearDown() { sut = null; }

    // Positive test
    @Test
    public void theFirstThreeLettersOfHelloIsHel() {
        String expectedResult = "Hel";
        String actualResult = sut.substring("Hello", 3);
        assertEquals(expectedResult, actualResult);
    }

    // Negative test
    @Test (expected = NullPointerException.class)
    public void nullStringThrowsNullPointerException() {
        String nullString = null;
        String unexpectedResult = "nul";
        String actualResult = sut.substring(nullString, 3);
        assertNotEquals(unexpectedResult, actualResult);
    }
}