import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q20CharacterDriverTest {

    private Q20CharacterDriver sut = new Q20CharacterDriver();

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}

    @Test
    public void objectCreatedToStringMatchesExpected() {
        Q20Character sutCharacter = new Q20Character("Mickey", "Mouse", 35, "Arizona");
        String expectedResult = sutCharacter.toString();
        String actualResult = "Name: Mickey Mouse" + "\nAge: 35 years\n" + "State: Arizona";
        assertEquals(expectedResult, actualResult);
    }

    // TODO Negative test (for no file found)
//    @Test (expected = FileNotFoundException.class)
//    public void invalidFilePathThrowsFileNotFoundException() {
//        File notAFile = new File("notAFilePath");
//        sut.makeQuestionTwentyCharactersOutOf(notAFile);
//    }
}