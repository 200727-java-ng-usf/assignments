
/*
    Q15. Write a program that defines an interface having the following methods:
    addition, subtraction, multiplication, and division.

    Create a class that implements this interface and provides appropriate functionality
    to carry out the required operations.

    Hard code two operands in a test class having a
    main method that calls the implementing class.
 */

import com.revature.questions.Q15;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class Q15Test {

    double num1 = 8.0;
    double num2 = 4.0;
    double delta = 0.001;

    private Q15 sut;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setUp() {
        sut = new Q15();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void addEightAndFourIsTwelve() {
        double expectedResult = 12.0;
        double actualResult = sut.addition(num1, num2);
        assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void subtractEightMinusFourIsFour() {
        double expectedResult = 4;
        double actualResult = sut.subtraction(num1, num2);
        assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void multiplyEightByFourIsThirtyTwo() {
        double expectedResult = 32;
        double actualRestult = sut.multiplication(num1, num2);
        assertEquals(expectedResult, actualRestult, delta);
    }

    @Test
    public void multiplyEightByCeroIsCero() {
        double expectedResult = 0;
        double actualResult = sut.multiplication(num1, 0);
        assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void divideEightByFourIsTwo() {
        double expectedResult = 2;
        double actualResult = sut.division(num1, num2);
        assertEquals(expectedResult, actualResult, delta);
    }


}