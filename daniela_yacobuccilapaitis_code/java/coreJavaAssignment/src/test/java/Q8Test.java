import com.revature.questions.Q8;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class Q8Test {

    Q8 sut;

    @Before
    public void setup() {
        sut = new Q8();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testRadarIsPalindrome() {
        boolean expectedResult = true;
        boolean actualResult = sut.isPalindrome("radar");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKaranIsNotPalindrome() {
        boolean expectedResult = false;
        boolean actualResult = sut.isPalindrome("karan");
        assertEquals(expectedResult, actualResult);
    }

}