import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Q16StringLengthTest {

    private Q16StringLength sut;

    @Before
    public void setUp() throws Exception { sut = new Q16StringLength(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive test
    @Test
    public void thereAreFiveLettersInHello() {
        String[] actualResult = new String[1];
        actualResult[0] = "Heyoooooo";
        int actualResultNum = sut.numberOfCharactersInString(actualResult);
        assertEquals(9, actualResultNum);
    }

    // Negative test
    @Test (expected = NullPointerException.class)
        public void nullValuePassedToNumberOfCharactersInStringThrowsNullPointerException() {
        String[] actualResult = new String[1];
        actualResult[0] = null;
        int unexpectedResult = 4;
        int actualResultNum = sut.numberOfCharactersInString(actualResult);
        assertNotEquals(unexpectedResult, actualResultNum);
    }


}