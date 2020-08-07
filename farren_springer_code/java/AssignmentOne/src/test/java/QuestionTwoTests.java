import org.junit.After;
import org.junit.Before;

public class QuestionTwoTests {
    /**
     * methods to test in QuestionTeo
     * fibonacciGenerator(int n)
     */

    /*
     Tests to run in this class
        - fibonacciGenerator passed a negative number
        - argument is a double
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
