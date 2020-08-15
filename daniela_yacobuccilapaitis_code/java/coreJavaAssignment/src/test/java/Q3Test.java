import com.revature.questions.Q3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Q3Test {

    Q3 sut;

    @Before
    public void setUp() {
        sut = new Q3();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void is_beanie_ReversedLowerCase_einab_(){
        String expectedResult = "einaeb";
        String actualResult = sut.reverseString("beanie");
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void as_Two_Words_Reversed_sdroW_owT_(){
        String expectedResult = "sdroW owT";
        String actualResult = sut.reverseString("Two Words");
        assertEquals(expectedResult, actualResult);

    }
}