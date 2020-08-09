import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionSixteenTest {

    private QuestionSixteen sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionSixteen(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    @Test
    public void thereAreFiveLettersInHello() {
        int expectedResult = 5;
        int actualResult = sut.numberOfCharactersInString("Hello");
        assertEquals(expectedResult, actualResult);
    }
}