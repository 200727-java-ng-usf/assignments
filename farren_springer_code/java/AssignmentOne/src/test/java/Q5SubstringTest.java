import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q5SubstringTest {

    private Q5Substring sut;

    @Before
    public void setUp()  {
        sut = new Q5Substring();
    }

    @After
    public void tearDown() { sut = null; }

    // Positive test
    @Test
    public void theFirstThreeLettersOfHelloIsHel() {
        String expectedResult = "Hel";
        String actualResult = sut.substring("Hello", 3);
        assertEquals(expectedResult, actualResult);
    }

    // Negative test
    @Test (expected = NullPointerException.class)
    public void nullStringThrowsNullPointerException() {
        String nullString = null;
        sut.substring(nullString, 3);
    }
}