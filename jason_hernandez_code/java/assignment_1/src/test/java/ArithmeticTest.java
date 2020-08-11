import mainpackage.ArithmeticImpl;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArithmeticTest {

    private ArithmeticImpl sut;
    float firstNumber = 5;
    float secondNumber = 3;

    @Before
    public void setUp() {
        sut = new ArithmeticImpl();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void tryAdding() {
        String msg = "Should return 5 + 3 = 8";
        int expectedNum = 8;
        assertEquals(sut.addUp(), expectedNum, 0.01);
    }

    @Test
    public void trySubtracting() {
        String msg = "Should return 5 - 3 = 2";
        int expectedNum = 2;
        assertEquals(sut.subtractIt(), expectedNum, 0.01);
    }

    @Test
    public void tryMutiplying() {
        String msg = "Should return 5 * 3 = 15";
        int expectedNum = 15;
        assertEquals(sut.multiplyIt(), expectedNum, 0.01);
    }

    @Test
    public void tryDividing() {
        String msg = "Should return 5 / 3 = 2";
        double expectedNum = 1.667;
        assertEquals(sut.divideBy(), expectedNum, 0.01);
    }

    @Test
    public void cantDivideByZero() {
        try {
            secondNumber = 0;
            sut.divideBy();
        } catch (ArithmeticException e) {
            String msg = "Should throw ArithmeticException";
        }
    }
}

