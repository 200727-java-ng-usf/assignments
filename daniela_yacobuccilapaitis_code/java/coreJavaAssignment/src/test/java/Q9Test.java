import com.revature.questions.Q6;
import com.revature.questions.Q9;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class Q9Test {

    Q9 sut;

    @Before
    public void setup() {
        sut = new Q9();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testSevenIsPrime() {
        boolean expectedResult = true;
        boolean actualResult = sut.isPrime(7);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testTenIsNotPrime() {
        boolean expectedResult = false;
        boolean actualResult = sut.isPrime(10);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCeroIsNotPrime() {
        boolean expectedResult = false;
        boolean actualResult = sut.isPrime(0);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeSevenIsNotPrime() {
        boolean expectedResult = false;
        boolean actualResult = sut.isPrime(-7);
        assertEquals(expectedResult, actualResult);
    }
}
