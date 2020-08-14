
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Q17InterestTest {

    private Q17SimpleInterest sut;

    @Before
    public void setUp() throws Exception { sut = new Q17SimpleInterest(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive test
    @Test
    public void interestOn100At5PercentAfterThreeYearsIs15() {
        double expectedResult = 15d;
        double actualResult = sut.calculateInterest(100,0.05d,3);
        assertEquals(expectedResult, actualResult, 0.000000000000000001);
    }

    // Negative test
    @Test (expected = NumberFormatException.class)
    public void nullTimePassedToCalculateInterestThrowsNumberFormatException() {
        int nullValue = Integer.parseInt(null);
        double unexpectedResult = 15d;
        double actualResult = sut.calculateInterest(100, 0.05d, nullValue);
        assertNotEquals(actualResult, unexpectedResult);
    }
}