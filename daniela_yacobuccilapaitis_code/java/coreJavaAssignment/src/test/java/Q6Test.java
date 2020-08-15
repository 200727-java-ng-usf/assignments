import com.revature.questions.Q6;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class Q6Test {

    Q6 sut;

    @Before
    public void setup() {
        sut = new Q6();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testEightIsEven() {
        boolean expectedResult = true;
        boolean actualResult = sut.isEven(8);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSevenIsNotEven() {
        boolean expectedResult = false;
        boolean actualResult = sut.isEven(7);
        assertEquals(expectedResult, actualResult);
    }

}