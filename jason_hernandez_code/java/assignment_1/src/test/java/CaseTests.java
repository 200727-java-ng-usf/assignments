import mainpackage.SubChangeCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaseTests {

    private SubChangeCase sut;
    private String testString = ("The quick brown Fox");

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

    // How to test fo the conversion to int?
}
