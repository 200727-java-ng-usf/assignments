import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionSixTest {

    private QuestionSix sut;

    @Before
    public void setUp() { sut = new QuestionSix(); }

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
        boolean unexpectedResult = false;
        boolean actualResult = sut.isEven(4);
        assertNotEquals(unexpectedResult, actualResult);
    }

}