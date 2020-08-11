package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Q6Tests {
    private Q6 sut;

    @Before
    public void setup(){
        sut = new Q6();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void test1(){
        int n = 8;
        boolean expectedResult = true;
        boolean actualResult = sut.isEven(n);
        boolean compared = (actualResult == expectedResult);
        assertTrue(compared);
    }

    @Test
    public void test2(){
        int n = 9;
        boolean expectedResult = false;
        boolean actualResult = sut.isEven(n);
        boolean compared = (actualResult == expectedResult);
        assertTrue(compared);
    }

    @Test
    public void test3(){
        int n = 1;
        boolean expectedResult = false;
        boolean actualResult = sut.isEven(n);
        boolean compared = (actualResult == expectedResult);
        assertTrue(compared);
    }
}
