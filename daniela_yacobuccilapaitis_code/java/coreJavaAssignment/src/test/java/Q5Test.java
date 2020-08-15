import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.revature.questions.Q5;

import static org.junit.Assert.*;

public class Q5Test {

    Q5 sut;

    @Before
    public void setUp() {
        sut = new Q5();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void areFirstFourLettersOfBeanieBean(){
        String expectedResult = "Bean";
        String actualResult = sut.substring("Beanie", 4);
        assertEquals(expectedResult, actualResult);

    }
}
