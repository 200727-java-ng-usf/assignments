package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q16Tests {
    private Q16 sut;

    @Before
    public void setup() {
        sut = new Q16();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    //scanner is set up in AssignmentDriver
    // tests will input strings itself
    @Test
    public void test1(){
        String test = "hello";
        int expectedResult = 5;
        int actualResult = sut.charactersInString(test);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test2(){
        String test = "test";
        int expectedResult = 4;
        int actualResult = sut.charactersInString(test);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test3(){
        //class will count whitespaces and numbers
        String test = " 70 ";
        int expectedResult = 4;
        int actualResult = sut.charactersInString(test);
        assertEquals(expectedResult,actualResult);
    }
}
