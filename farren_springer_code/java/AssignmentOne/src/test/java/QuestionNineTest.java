import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionNineTest {

    private QuestionNine sut;

    @Before
    public void setUp() { sut = new QuestionNine(); }

    @After
    public void tearDown() { sut = null; }

    @Test
    public void sevenIsPrime() {
        boolean expectedResult = true;
        boolean actualResult = sut.isPrime(7);
        assertEquals(expectedResult, actualResult);
    }
}