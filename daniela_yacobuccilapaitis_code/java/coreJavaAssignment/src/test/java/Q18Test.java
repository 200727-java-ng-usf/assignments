import com.revature.questions.Q18;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class Q18Test {

    Q18 sut;

    @Before
    public void setup() {
        sut = new Q18();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void radarDoesntHaveUppercaseLetters() {
        boolean expectedResult = false;
        boolean actualResult = sut.anyUppercaseLetters("radar");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKaranIsNotPalindrome() {
        String expectedResult = "KARAN";
        String actualResult = sut.allLowerCaseToUpperCase("kAran");
        assertEquals(expectedResult, actualResult);
    }

}