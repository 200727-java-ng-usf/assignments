import org.junit.After;
import org.junit.Before;

public class QuestionEighteenSubclassTest {

    private QuestionEighteenSubclass sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionEighteenSubclass("hEllo"); }

    @After
    public void tearDown() throws Exception { sut = null; }

//    @Test
//    public void hElloHasUpperCaseLetters() {
//        boolean expectedResult = true;
//        boolean actualResult = sut.hasUpperCaseLetters();
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void helloConvertedToUppercaseIsHELLO() {
//        String expectedResult = "HELLO";
//        String actualResult = sut.convertToUppercase();
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void testConvertToIntAndAddTen() {
//    }
}

