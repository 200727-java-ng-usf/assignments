import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionTwelveTest {

    private QuestionTwelve sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionTwelve(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive test
    @Test
    public void testThatEvenNumbersAreReturnedByArrayOperations() {
        int[] expectedResult = {2,4,6,8,10};
        int[] actualResult = sut.arrayOperations(10);
        assertEquals(expectedResult[2], actualResult[2]);
    }

    // Negative test
    @Test (expected = NumberFormatException.class)
    public void nullIntArrayPassedToArrayOperationsReturnsNullPointerException() {
        int nullValue = Integer.parseInt(null);
        int[] unexpectedResult = {2,4,6,8,10};
        int[] actualResult = sut.arrayOperations(nullValue);
        assertNotEquals(unexpectedResult, actualResult);
    }
}