import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticTest {

    private ArithmeticTest sut;

    @Before
    public void setUp() {
        sut = new ArithmeticTest();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void multiplyThreeTimesFive() {
        double expectedResult = 15;
        double actualResult = sut.multiplication(3, 5);
        Assert.assertEquals("3 Times 5 is 15", expectedResult, actualResult, .001);
    }

    public void multiplyFiveTimesThree() {
        double expectedResult = 15;
        double actualResult = sut.multiplication(5, 3);
        Assert.assertEquals("5 Times 3 is 15", expectedResult, actualResult, .001);
    }
}
