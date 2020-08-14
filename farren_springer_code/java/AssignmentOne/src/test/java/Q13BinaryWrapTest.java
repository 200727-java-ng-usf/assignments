import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Q13BinaryWrapTest {

    private Q13BinaryWrap sut;

    @Before
    public void setUp() throws Exception { sut = new Q13BinaryWrap(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive test
    @Test
    public void correctWrappingOfAbracadabra() {
        String expectedResult = "\n23\n2323\n232323\n";
        String actualResult = sut.wrapTheString("23232323");
        assertEquals(expectedResult, actualResult);
    }

    // Negative test
    @Test (expected = NullPointerException.class)
    public void nullStringPassedToWrapTheStringReturnsNullPointerException() {
        String nullString = null;
        String unexpectedResult = "\n23\n2323\n232323\n";
        String actualResult = sut.wrapTheString(nullString);
        assertNotEquals(unexpectedResult, actualResult);
    }

}