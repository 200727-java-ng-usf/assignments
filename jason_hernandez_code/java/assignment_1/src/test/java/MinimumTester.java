
import mainpackage.FindMinimum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumTester {
    private FindMinimum sut;

    @Before
    public void setUp() {
        sut = new FindMinimum();
    } // Call to the class being tested

    @After
    public void tearDown() {
        sut = null;
    } // Reset at the end

    @Test
    public void checkFirstNumberGreater() {
        int num1 = 6;
        int num2 = 4;
        int expectedOutput = 6;
        assertEquals(sut.findTheMinimum(num1, num2), expectedOutput, 0.01);
    }

    @Test
    public void checkSecondNumberGreater() {
        int num1 = 4;
        int num2 = 6;
        int expectedOutput = 4;
        assertEquals(sut.findTheMinimum(num1, num2), expectedOutput, 0.01);
    }

    @Test
    public void checkNumbersEqual() {
        int num1 = 6;
        int num2 = 6;
        try {
            sut.findTheMinimum(num1, num2);
        } catch (ArithmeticException e) {
            String msg = "Should throw ArithmeticException";
        }
    }
}
