import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionFifteenTest {

    private QuestionFifteen sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionFifteen(2, 3); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive Tests
    @Test
    public void twoPlus3Is5() {
        int expectedResult = 5;
        int actualResult = sut.add();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void twoMinus3IsNegative1() {
        int expectedResult = -1;
        int actualResult = sut.subtract();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void twoTimes3Is6() {
        double expectedResult = 6;
        double actualResult = sut.multiply();
        assertEquals(expectedResult, actualResult, 0.0000001);
    }

    @Test
    public void twoDividedBy3IsPoint67() {
        double expectedResult = sut.getNum1()/sut.getNum2();
        double actualResult = sut.divide();
        assertEquals(expectedResult, actualResult, 0.0000001);
    }

    //Negative test
    @Test (expected = NumberFormatException.class)
            public void nullValuePassedToAddThrowsNumberFormatException() {
        int nullValue = Integer.parseInt(null);
        int unexpectedResult = 5;
        QuestionFifteen sut2 = new QuestionFifteen(2, nullValue);
        int actualResult = sut2.add();
        assertNotEquals(unexpectedResult, actualResult);
    }

    @Test (expected = NumberFormatException.class)
    public void nullValuePassedToSubtractThrowsNumberFormatException() {
        int nullValue = Integer.parseInt(null);
        int unexpectedResult = 5;
        QuestionFifteen sut2 = new QuestionFifteen(2, nullValue);
        int actualResult = sut2.subtract();
        assertNotEquals(unexpectedResult, actualResult);
    }

    @Test (expected = NumberFormatException.class)
    public void nullValuePassedToMultiplyThrowsNumberFormatException() {
        int nullValue = Integer.parseInt(null);
        int unexpectedResult = 3;
        QuestionFifteen sut2 = new QuestionFifteen(2, nullValue);
        int actualResult = (int) sut2.multiply();
        assertNotEquals(unexpectedResult, actualResult);
    }

    @Test (expected = NumberFormatException.class)
    public void nullValuePassedToDivideThrowsNumberFormatException() {
        int nullValue = Integer.parseInt(null);
        int unexpectedResult = 5;
        QuestionFifteen sut2 = new QuestionFifteen(2, nullValue);
        int actualResult = (int) sut2.divide();
        assertNotEquals(unexpectedResult, actualResult);
    }




} // "main method that calls the implementing class"