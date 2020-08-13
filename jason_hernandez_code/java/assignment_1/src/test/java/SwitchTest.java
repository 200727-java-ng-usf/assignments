import static org.junit.Assert.*;
import mainpackage.SwitchDemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SwitchTest {
    private SwitchDemo sut;

    @Before
    public void setUp() {
        sut = new SwitchDemo();
    }

    @After
    public void teardown() {
        sut = null;
    }

    @Test
    public void case1() { // Returns the square root
        String dataPoint = "sqrt";
        double a = 25;
        String expectedResult = "5";
        String  actualResult = sut.s;
        assertEquals(expectedResult, actualResult, 0.01);
    }

    @Test
    public void case2() { // Returns current date
        String dataPoint = "date";

    }

    @Test
    public void case3() { // Splits a string
        String dataPoint = "split";
        String theString = "I am learning Core Java";

    }
}

