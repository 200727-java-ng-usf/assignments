import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionSevenTest {

    private QuestionSeven sut;

    @Before
    public void setUp() {  sut = new QuestionSeven();  }

    @After
    public void tearDown() {  sut = null;  }

    // Positive test
    @Test
    public void defaultConstructorSetsDepartmentToHumanResources() {
        String expectedResult = "Human Resources";
        String actualResult = sut.getDepartment();
        assertEquals(expectedResult, actualResult);
    }
}