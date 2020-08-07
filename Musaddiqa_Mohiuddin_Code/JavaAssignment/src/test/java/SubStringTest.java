import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubStringTest {

    private String inputData;
    private SubString subString;
    private int idx;

    @Before
    public void setup() {
    	subString = new SubString();
        inputData = "Test World";
        idx = 6;
    }

    //Postive case
    @Test
    public void subString() {
    	subString.main(inputData, idx);
        assertEquals("Test W", subString.getSubString());

    }

    // negative case
    @Test(expected = IndexOutOfBoundsException.class)
    public void negativeSubString() {
    	idx = 100;
    	subString.main(inputData, idx);
    }

}
