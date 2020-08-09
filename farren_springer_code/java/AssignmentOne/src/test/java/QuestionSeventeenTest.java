
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionSeventeenTest {

    private QuestionSeventeen sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionSeventeen(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    @Test
    public void interestOn100At5PercentAfterThreeYearsIs15() {
        double expectedResult = 15d;
        double actualResult = sut.calculateInterest(100,0.05d,3);
        assertEquals(expectedResult, actualResult, 0.000000000000000001);
    }
}