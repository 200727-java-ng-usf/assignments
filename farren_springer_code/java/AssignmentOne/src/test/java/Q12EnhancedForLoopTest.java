import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q12EnhancedForLoopTest {

    private Q12EnhancedForLoop sut;

    @Before
    public void setUp() throws Exception { sut = new Q12EnhancedForLoop(); }

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
        sut.arrayOperations(nullValue);
    }
}