import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuestionThreeTest {

    private QuestionThree sut;

    @Before
    public void setUp() {  sut = new QuestionThree();   }

    @After
    public void tearDown()  {  sut = null;  }

    @Test
    // Positive test
    public void HeyReversedIsYeh() {
        String expectedResult = "Yeh";
        String actualResult = sut.reverseIt("Hey");
    }
}