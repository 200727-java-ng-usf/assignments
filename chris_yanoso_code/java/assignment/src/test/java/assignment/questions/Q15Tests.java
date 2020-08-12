package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q15Tests {
    private Q15 sut;

    @Before
    public void setup() {
        sut = new Q15();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void test1(){
        //testing addition
        int n1 = 6;
        int n2 = 10;
        int expectedResult = 16;
        int actualResult = sut.addition(n1,n2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test2(){
        //testing subtraction
        int n1 = 12;
        int n2 = 6;
        int expectedResult = 6;
        int actualResult = sut.subtraction(n1,n2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test3(){
        //testing multiplication
        int n1 = 5;
        int n2 = 5;
        int expectedResult = 25;
        int actualResult = sut.multiplication(n1, n2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test4(){
        //testing division
        int n1 = 5;
        int n2 = 5;
        int expectedResult = 1;
        int actualResult = sut.division(n1,n2);
        assertEquals(expectedResult,actualResult);
    }
}