import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionFourteenTest {

    private QuestionFourteen sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionFourteen(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive test for splitTheString
    @Test
    public void splitMethodPrintsSeparatedBySpaceIAmLearningCoreJava() {
        String[] expectedResult = {"I", "am", "learning", "Core", "Java"};
        String[] actualResult = sut.splitTheString("I am learning Core Java", " ");
        assertEquals(expectedResult, actualResult);
    }

    // Positive test for printTheDate
    @Test
    public void printDateMethodPrintsDate() {
        // Create a date format object
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // Create a date object
        Date date = new Date();
        String expectedResult = formatter.format(date);
        String actualResult = sut.printTheDate();
        assertEquals(expectedResult, actualResult);
    }

    // Positive test for squareRoot
    @Test
    public void squareRootOf49Is7() {
        double expectedResult = 7.0;
        double actualResult = sut.squareRoot(49);
        assertEquals(expectedResult, actualResult, 0.000000000000001);

    }

    // TODO test Scanner input from method(?)
    // Negative test
//    @Test (expected = NullPointerException.class)
//    public void splitTheStringPassedNullStringReturnsNullPointerException() {
//        String nullString = null;
//        String[] unexpectedResult = new String[2];
//        unexpectedResult[0] = "Hey";
//        unexpectedResult[1] = "there";
//        String[] actualResult = sut.splitTheString(nullString, ":");
//        assertNotEquals(unexpectedResult, actualResult);
//
//    }
}