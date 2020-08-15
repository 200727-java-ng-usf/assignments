import com.revature.questions.Q4;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class Q4Test {

    Q4 sut;

    @Before
    public void setup() {
        sut = new Q4();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testCeroFactorialIsOne() {
        int expectedResult = 1;
        int actualResult = sut.calcFactorial(0);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testFourFactorialIsTwentyFour() {
        int expectedResult = 24;
        int actualResult = sut.calcFactorial(4);
        assertEquals(expectedResult, actualResult);
    }

}
