package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class Q1Tests {

    private Q1 sut;

    @Before
    public void setup(){
        sut = new Q1();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void test1(){
       int[] testArray = {5,1,7,3,5,8,2,9,3,8,0};
       String expectedResult = "[0, 1, 2, 3, 3, 5, 5, 7, 8, 8, 9]";
       String actualResult = sut.sortArray(testArray);
      assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test2(){
        int[] array1 = {1,0,5,6,3,2,3,7,9,8,4};
        String expectedResult = "[0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9]";
        String actualResult = sut.sortArray(array1);
        assertEquals(actualResult,expectedResult);
    }

}
