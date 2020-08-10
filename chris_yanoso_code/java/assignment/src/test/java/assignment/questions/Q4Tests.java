package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q4Tests {
    private Q4 sut;

    @Before
    public void setup(){
        sut = new Q4();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void test1(){
        int n = 5;
        int expectedResult = 120;
        int actualResult = sut.nFactorial(n);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test2(){
        int n = 10;
        int expectedResult = 3628800;
        int actualResult = sut.nFactorial(n);
        assertEquals(expectedResult,actualResult);
    }
}
