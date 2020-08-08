import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}