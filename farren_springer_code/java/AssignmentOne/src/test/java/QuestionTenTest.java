import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTenTest {

    private QuestionTen sut;

    @Before
    public void setUp() { sut = new QuestionTen(); }

    @After
    public void tearDown() { sut = null; }

    @Test
    // Positive test
    public void threeIsSmallerThanFive() {
        int expectedResult = 3;
        int actualResult = sut.smallerInt(3,5);
        assertEquals(expectedResult, actualResult);
    }

}