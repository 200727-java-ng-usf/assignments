import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q3ReverseStringTest {

    private Q3ReverseString sut;

    @Before
    public void setUp() {  sut = new Q3ReverseString();   }

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
        String actualResult = sut.reverseIt(nullString);
    }


}