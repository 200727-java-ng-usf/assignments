import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    // Negative test
    @Test (expected = NullPointerException.class)
    public void nullObjectsPassedToOverriddenCompareMethodThrowNullPointerException() {
        QuestionSeven o1 = new QuestionSeven();
        o1 = null;
        QuestionSeven o2 = new QuestionSeven();
        o2 = null;
        int unexpectedResult = 1;
        assertNotEquals(1, sut.compare(o1, o2));
    }

}