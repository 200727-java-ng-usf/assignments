import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionEighteenSubclassTest {

    private QuestionEighteenSubclass sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionEighteenSubclass("hEllo"); }

    @After
    public void tearDown() throws Exception { sut = null; }

    @Test
    public void hElloHasUpperCaseLetters() {
        boolean actualResult = sut.hasUpperCaseLetters();
        assertEquals(true, actualResult);
    }

    @Test
    public void hElloConvertedToUppercaseIsHELLO() {
        String expectedResult = "HELLO";
        String actualResult = sut.convertToUppercase();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void hElloConvertedToAnIntPlus10Is107() {
        int actualResult = sut.convertToIntAndAddTen();
        assertEquals(107, actualResult);
    }

    // Negative tests
    @Test
    public void hasUpperCaseHandlesEmptyString() {
        String emptyString = "";
        QuestionEighteenSubclass sutWithEmptyString = new QuestionEighteenSubclass(emptyString);
        boolean expectedResult = false;
        assertEquals(sutWithEmptyString.hasUpperCaseLetters(), expectedResult);
    }

    @Test
    public void convertToUpperCaseHandlesEmptyString() {
        String emptyString = "";
        QuestionEighteenSubclass sutWithEmptyString = new QuestionEighteenSubclass(emptyString);
        String expectedResult = "";
        assertEquals(sutWithEmptyString.convertToUppercase(), expectedResult);
    }

    @Test
    public void emptyStringConvertedToAnIntPlus10Is10() {
        String emptyString = "";
        QuestionEighteenSubclass sutWithEmptyString = new QuestionEighteenSubclass(emptyString);
        int expectedResult = 10;
        assertEquals(sutWithEmptyString.convertToIntAndAddTen(), expectedResult);
    }
}

