import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionFiveTest {

    private QuestionFive sut;

    @Before
    public void setUp()  {
        sut = new QuestionFive();
    }

    @After
    public void tearDown() { sut = null; }

    @Test
    public void theFirstThreeLettersOfHelloIsHel() {
        String expectedResult = "Hel";
        String actualResult = sut.substring("Hello", 3);
        assertEquals(expectedResult, actualResult);
    }
}