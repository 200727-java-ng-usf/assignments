import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    private String inputData;
    private ReverseString reverseString;

    @Before
    public void setup() {
    	reverseString = new ReverseString();
        inputData = "Testing World";
    }

    //Postive case
    @Test
    public void reverseString() {
    	reverseString.main(inputData);
        assertEquals("dlroW gnitseT", reverseString.getReverseString());

    }

    // negative case
    @Test(expected = NullPointerException.class)
    public void negativeReverseString() {
    	reverseString.main(null);
    }

}
