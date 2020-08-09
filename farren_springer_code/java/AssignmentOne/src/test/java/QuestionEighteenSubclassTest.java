import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class QuestionEighteenSubclassTest {

    private QuestionEighteenSubclass sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionEighteenSubclass("hElloooooooooooooooooooo"); }

    @After
    public void tearDown() throws Exception { sut = null; }

    @Test
    public void hElloHasUpperCaseLetters() {
        boolean expectedResult = true;
        boolean actualResult = sut.hasUpperCaseLetters();
    }
//
//    @Test
//    public void testConvertToUppercase() {
//    }
//
//    @Test
//    public void testConvertToIntAndAddTen() {
//    }
}

