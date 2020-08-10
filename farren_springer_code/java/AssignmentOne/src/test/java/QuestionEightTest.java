import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionEightTest {

    private QuestionEight sut;

    @Before
    public void setUp() {  sut = new QuestionEight();   }

    @After
    public void tearDown() { sut = null; }

    // Positive test
    @Test
    public void reverseOfHeYIsYeH() {
        String expectedResult = "yeH";
        String actualResult = sut.reverseIt("Hey");
        assertEquals(expectedResult, actualResult);
    }

    // Positive test
    @Test
    public void reverseofYayIsNotYay() {
        String unexpectedResult = "Yay";
        String actualResult = sut.reverseIt("Yay");
        assertNotEquals(unexpectedResult, actualResult);
    }

    // Negative test
    @Test (expected = NullPointerException.class)
    public void nullPassedToReverseItResultsInNullPointerException() {
        String nullString = null;
        String actualResult = sut.reverseIt(nullString);
        assertNotEquals(nullString, actualResult);
    }
}