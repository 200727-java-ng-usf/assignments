import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Q7EmployeeTest {

    private Q7Employee sut;

    @Before
    public void setUp() {  sut = new Q7Employee();  }

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
        Q7Employee o1 = new Q7Employee();
        o1 = null;
        Q7Employee o2 = new Q7Employee();
        o2 = null;
        int unexpectedResult = 1;
        assertNotEquals(1, sut.compare(o1, o2));
    }

}