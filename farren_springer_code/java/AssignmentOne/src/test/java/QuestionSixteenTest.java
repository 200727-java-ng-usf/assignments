import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionSixteenTest {

    private QuestionSixteen sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionSixteen(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive test
    @Test
    public void thereAreFiveLettersInHello() {
        int expectedResult = 5;
        int actualResult = sut.numberOfCharactersInString("Hello");
        assertEquals(expectedResult, actualResult);
    }

    // Negative test
    @Test (expected = NullPointerException.class)
        public void nullValuePassedToNumberOfCharactersInStringThrowsNullPointerException() {
        String nullString = null;
        int unexpectedResult = 4;
        int actualResult = sut.numberOfCharactersInString(nullString);
        assertNotEquals(unexpectedResult, actualResult);
    }


}