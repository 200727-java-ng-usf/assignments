import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    private Integer inputData;
    private Factorial factorial;

    @Before
    public void setup() {
    	factorial = new Factorial();
        inputData = 5;
    }

    //Postive case
    @Test
    public void factorial() {
    	factorial.main(inputData);
        assertEquals(120, factorial.getFactorialValue());

    }

    // negative case
    @Test(expected = NullPointerException.class)
    public void negativeFactorial() {
    	factorial.main(null);
    }

}
