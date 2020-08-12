package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q18Tests {
    private Q18 sut;

    @Before
    public void setup() {
        sut = new Q18();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void test1(){
        //test uppercase true
        String test = "upPer";
        boolean expectedResult = true;
        boolean actualResult = sut.checkForUpperCase(test);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test2(){
        //test lowercase false
        String test = "lower";
        boolean expectedResult = false;
        boolean actualResult = sut.checkForUpperCase(test);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test3(){
        //tests uppercase string
        String test = "lower";
        String expectedResult = "LOWER";
        String actualResult = sut.stringToUpperCase(test);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test4(){
        //tests string to int values
        String test = "test";
        int expectedResult = 458;
        int actualResult = sut.stringToInt(test);
        assertEquals(expectedResult,actualResult);
    }
}
