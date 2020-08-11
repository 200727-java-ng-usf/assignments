import mainpackage.SubChangeCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaseTests {

    private SubChangeCase sut;
    private final String testString = ("The quick brown Fox");

    @Before
    public void setUp(){
        sut = new SubChangeCase();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void checkUpperCase() {
        assertFalse(sut.checkForUppercase());
    }

    @Test
    public void makeItUppercase() {
        String expectedString = ("THE QUICK BROWN FOX");
        assertEquals("Should return in all caps", expectedString, sut.convertToUppercase());
    }

    @Test
    public void findTheAscii() {
        String newTestString = "fox";
        String newExpectedString = "102111130";
        assertEquals("Should return 102111120 + 10 102111130", newExpectedString, sut.convertToIntPlusTen());
    }
}
