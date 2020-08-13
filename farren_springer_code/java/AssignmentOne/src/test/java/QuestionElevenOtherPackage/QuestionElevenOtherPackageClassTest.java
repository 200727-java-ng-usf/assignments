package QuestionElevenOtherPackage;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionElevenOtherPackageClassTest {

    private QuestionElevenOtherPackageClass sut;

    @Before
    public void setUp() throws Exception { sut = new QuestionElevenOtherPackageClass(1.32f, 1.57f); }

    @After
    public void tearDown() throws Exception { sut = null; }

    @Test
    public void testGetFloat1() {
        float expectedResult = 1.32f;
        float actualResult = sut.getFloat1();
        assertEquals(expectedResult, actualResult, 0.000000000000000000001);
    }

    @Test
    public void testSetFloat1() {
        float expectedResult = 1.77f;
        sut.setFloat1(expectedResult);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expectedResult, sut.getFloat1(), 0.000000000000000000001);
    }

    @Test
    public void testGetFloat2() {
        float expectedResult = 1.57f;
        float actualResult = sut.getFloat2();
        assertEquals(expectedResult, actualResult, 0.000000000000000000001);
    }

    @Test
    public void testSetFloat2() {
        float expectedResult = 1.81f;
        sut.setFloat2(expectedResult);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expectedResult, sut.getFloat2(), 0.000000000000000000001);
    }

}