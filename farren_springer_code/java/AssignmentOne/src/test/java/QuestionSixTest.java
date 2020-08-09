import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    // Negative Test
}