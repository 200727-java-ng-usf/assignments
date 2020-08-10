import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class QuestionThirteenTest {

    private QuestionThirteen sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionThirteen(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    @Test
    public void correctWrappingOfAbracadabra() {
        String expectedResult = "\n23\n2323\n232323\n";
        String actualResult = sut.wrapTheString("23232323");
        assertEquals(expectedResult, actualResult);
    }
}