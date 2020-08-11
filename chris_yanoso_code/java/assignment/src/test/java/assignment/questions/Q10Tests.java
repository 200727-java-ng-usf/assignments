package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q10Tests {
    private Q10 sut;

    @Before
    public void setup() {
        sut = new Q10();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void test1(){
        int n1 = 8;
        int n2 = 9;
        int expectedResult = 8;
        int actualResult = sut.findMin(n1,n2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test2(){
        int n1 = 10;
        int n2 = 9;
        int expectedResult = 9;
        int actualResult = sut.findMin(n1,n2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test3(){
        int n1 = 5;
        int n2 = 6;
        int expectedResult = 5;
        int actualResult = sut.findMin(n1,n2);
        assertEquals(expectedResult,actualResult);
    }
}