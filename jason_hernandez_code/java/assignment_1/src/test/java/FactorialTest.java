
import mainpackage.Nfactorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private Nfactorial sut;

    @Before
    public void setUp() {
        sut = new Nfactorial();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testHighNumber() {
        String msg = "Should return the factorial result 10! = 3628800";
        double testNumber = 10;
        double expectedResult = 3628800;
        assertEquals(sut.nFactorial(), expectedResult, 0.01);
    }

    @Test
    public void testLowNumber() {
        String msg = "Should return the factorial result 4! = 24";
        double testNumber = 4;
        double expectedResult = 24;
        assertEquals(sut.nFactorial(), expectedResult, 0.01);
    }

    @Test
    public void testZero() {
        String msg = "Should return 1";
        double testNumber = 0;
        double expectedResult = 1;
        assertEquals(sut.nFactorial(), expectedResult, 0.01);
    }

    @Test
    public void testVeryHighNumber() {
        String msg = "Should return infinity";
        double testNumber = 425;
        double expectedResult = Double.POSITIVE_INFINITY;
        assertEquals(sut.nFactorial(), expectedResult, 0.1);
    }
}
