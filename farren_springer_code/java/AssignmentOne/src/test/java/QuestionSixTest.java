import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuestionSixTest {

    private QuestionSix sut;

    @Before
    public void setUp() { sut = new QuestionSix(); }

    @After
    public void tearDown() {  sut = null;  }

    @Test
    public void fiveReturnsFalse() {
        boolean expectedResult = false;
        boolean actualResult = sut.isEven(5);
    }
}