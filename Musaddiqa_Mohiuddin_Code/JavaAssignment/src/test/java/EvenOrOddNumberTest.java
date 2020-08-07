import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOrOddNumberTest {

    private Integer inputData;
    private EvenOrOddNumber evenOrOddNumber;

    @Before
    public void setup() {
    	evenOrOddNumber = new EvenOrOddNumber();
        inputData = 5;
    }

    //Postive case
    @Test
    public void oddNumber() {
    	evenOrOddNumber.main(inputData);
        assertEquals("Odd", evenOrOddNumber.getOutputValue());

    }
    
    @Test
    public void evenNumber() {
    	inputData = 10;
    	evenOrOddNumber.main(inputData);
        assertEquals("Even", evenOrOddNumber.getOutputValue());

    }

    // negative case
    @Test(expected = NullPointerException.class)
    public void negativeEvenOrOddNumber() {
    	evenOrOddNumber.main(null);
    }

}
