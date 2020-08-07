import org.junit.After;
import org.junit.Before;

public class QuestionTwoTests {
    /**
     * methods to test in QuestionTeo
     * fibonacciGenerator(int n)
     */

    private QuestionTwo sut; // SUT = System Under Test

    @Before
    public void setUp() {
        sut = new QuestionTwo();
    }

    @After
    public void tearDown() {
        sut = null;
    }
}
