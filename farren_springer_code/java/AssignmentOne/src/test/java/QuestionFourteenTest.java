import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class QuestionFourteenTest {

    private QuestionFourteen sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionFourteen(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive test
    @Test
    public void splitMethodPrintsSeparatedBySpaceIAmLearningCoreJava() {
        String[] expectedResult = {"I", "am", "learning", "Core", "Java"};
        String[] actualResult = sut.splitTheString("I am learning Core Java", " ");
        assertEquals(expectedResult, actualResult);
    }

    // Positive test
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

    // TODO test Scanner input from method(?)
//    // Negative test
//    @Test (expected = InputMismatchException.class)
//    public void StringPassedToSwitchCaseReturnsInputMismatchException() {
//        int stringTryingToBeAnInt = Integer.parseInt("notAString");
//        int unexpectedResult = 7;
//        int actualResult = sut.squareRoot(stringTryingToBeAnInt);
//        assertNotEquals(unexpectedResult, actualResult);
//
//    }
}