import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class Q20CharacterDriverTest {

    private Q20CharacterDriver sut = new Q20CharacterDriver();

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}

    // Positive tests
    @Test
    public void objectCreatedToStringMatchesExpected() {
        Q20Character sutCharacter = new Q20Character("Mickey", "Mouse", 35, "Arizona");
        String expectedResult = sutCharacter.toString();
        String actualResult = "Name: Mickey Mouse" + "\nAge: 35 years\n" + "State: Arizona";
        assertEquals(expectedResult, actualResult);
    }

//    @Test
//    public void mainMethodRuns() throws FileNotFoundException {
//        String[] strings = {"Hey", "Hi", "Hello"};
//        sut.main(strings);
//
//    }

    // Negative tests

    @Test (expected = NullPointerException.class)
    public void nullFileReturnsNullPointerException() throws NullPointerException {
            String nullString = null;
            File nullFile = new File(nullString);
            sut.makeQuestionTwentyCharactersOutOf(nullFile);
            System.out.println("No.");

    }
}