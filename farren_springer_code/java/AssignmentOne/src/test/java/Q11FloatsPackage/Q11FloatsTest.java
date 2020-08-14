package Q11FloatsPackage;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q11FloatsTest {

    private Q11Floats sut;

    @Before
    public void setUp() throws Exception { sut = new Q11Floats(1.32f, 1.57f); }

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
        assertEquals(expectedResult, sut.getFloat2(), 0.000000000000000000001);
    }

}