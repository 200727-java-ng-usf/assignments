package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2Tests {
    private Q2 sut;

    @Before
    public void setup(){
        sut = new Q2();
    }

    @After
    public void tearDown() {
        sut = null;
    }

   @Test
    public void test1(){
        int n = 5;
        String expectedResult = "[1, 1, 2, 3, 5]";
        String actualResult = sut.nFib(n);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test2(){
        int n = 10;
        String expectedResult = "[1, 1, 2, 3, 5, 8, 13, 21, 34, 55]";
        String actualResult = sut.nFib(n);
        assertEquals(expectedResult, actualResult);
    }

   @Test
    public void test3(){
        int n = 25;
        String expectedResult = "[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025]";
        String actualResult = sut.nFib(n);
        assertEquals(expectedResult, actualResult);
    }

}
