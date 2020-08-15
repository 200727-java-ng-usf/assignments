import com.revature.questions.Q17;
import com.revature.questions.Q8;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class Q17Test {

    Q17 sut;
    double interest = 2.0;
    double rateOfInterest = 0.2;
    int years = 7;
    double delta = 0.001;

    @Before
    public void setup() {
        sut = new Q17();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testInterestRateGivenDummyValues() {
        double expectedResult = 2.8;
        double actualResult = sut.calculateInterestRate(interest, rateOfInterest, years);
        assertEquals(expectedResult, actualResult, delta);
    }

}