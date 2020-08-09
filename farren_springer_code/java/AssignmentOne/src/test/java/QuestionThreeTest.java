import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class QuestionThreeTest {

    private QuestionThree sut;

    @Before
    public void setUp() {  sut = new QuestionThree();   }

    @After
    public void tearDown()  {  sut = null;  }

    // Positive test
    @Test
    public void HeyReversedIsYeh() {
        String expectedResult = "Yeh";
        String actualResult = sut.reverseIt("Hey");
    }

    // Negative test
    @Test (expected = NullPointerException.class)
    public void nullStringPassedToReverseIt() {
        String nullString = null;
        String unexpectedResult = "llun";
        String actualResult = sut.reverseIt(nullString);
        assertNotEquals(unexpectedResult, actualResult);
    }


}