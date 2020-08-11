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
//        boolean actualResult = sut.hasUpperCaseLetters();
//        assertEquals(true, actualResult);
//    }
//
//    @Test
//    public void hElloConvertedToUppercaseIsHELLO() {
//        String expectedResult = "HELLO";
//        String actualResult = sut.convertToUppercase();
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void hElloConvertedToAnIntPlus10Is107() {
//        int actualResult = sut.convertToIntAndAddTen();
//        assertEquals(107, actualResult);
//    }
}

