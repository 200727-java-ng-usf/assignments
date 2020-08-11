import static org.junit.Assert.*;
import mainpackage.IntEven;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenNumberTests {

    private IntEven sut;

    @Before
    public void setUp() {
        sut = new IntEven();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void tryEvenNumber() {
        float testNumber = 8;
        assertTrue(sut.determineIfEven(testNumber));
    }

    @Test
    public void tryOddNumber() {
        float testNumber = 7;
        assertFalse(sut.determineIfEven(testNumber));
    }
}
