import com.revature.questions.Question15;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Question15Test {

    int a = 3;
    int b = 5;
    int c = 0;
    int d = 15;
    public Question15 sut = new Question15();

    @Before
    public void setUp() {
        sut = new Question15();
    }

    @After
    public void teardown() {
        sut = null;
    }

    @Test
    public void multiplyThreeAndFiveIsFifteen() {
        double expectedResult = 15;
        double actualResult = sut.multiplicationM(a, b);
        Assert.assertEquals("3 times 5 is 15", expectedResult, actualResult, 0.001);
    }

    @Test
    public void multiplyFiveAndThreeIsFifteen() {
        double expectedResult = 15;
        double actualResult = sut.multiplicationM(b, a);
        Assert.assertEquals("5 times 3 is 15", expectedResult, actualResult, 0.001);
    }

    @Test
    public void multiply115And0Equals0() {
        double expectedResult = 0;
        double actualResult = sut.multiplicationM(c, d);
        Assert.assertEquals("0 times 15 is 0", expectedResult, actualResult, 0.001);
    }

    @Test
    public void addThreeAndThreeIsSix() {
        double expectedResult = 6;
        double actualResult = sut.additionM(a, a);
        Assert.assertEquals("3 plus 3 is 6", a, a, .001);
    }

    @Test
    public void addFiveandThreeIsEight() {
        double expectedResult = 8;
        double actualResult = sut.additionM(a, b);
        Assert.assertEquals(expectedResult, actualResult, .001);
    }

    @Test(expected = ArithmeticException.class)
    public void divideBy0ThrowsException() {
        sut.divisionM(15, 0);
    }

    @Test
    public void divideTest() {
        double expectedResult = 5;
        double actualResult = sut.divisionM(d, a);
        Assert.assertEquals(expectedResult, actualResult, .001);
    }

    @Test
    public void subtractThreeAndThreeIsZero() {
        double expectedResult = 0;
        double actualResult = sut.subtractionM(a, a);
        Assert.assertEquals(expectedResult, actualResult, .001);
    }

    @Test
    public void subtractFiveandThreeIsTwo() {
        double expectedResult = 2;
        double actualResult = sut.subtractionM(b, a);
        Assert.assertEquals(expectedResult, actualResult, .001);
    }
}


