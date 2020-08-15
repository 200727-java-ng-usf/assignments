import com.revature.questions.Q2;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class Q2Test {

    Q2 sut;

    @Before
    public void setup() {
        sut = new Q2();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testFibonacciListOfFirstSevenBeginingAtCero() {
        int [] expectedResult = {0, 1, 1, 2, 3, 5, 8};
        int [] actualResult = sut.fibonacciList(7);
        assertArrayEquals(expectedResult, actualResult);
    }

}
