package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Q3Tests {
    private Q3 sut;

    @Before
    public void setup(){
        sut = new Q3();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void test1(){
        String str = "Look";
        StringBuilder expectedString = new StringBuilder("kooL");
        StringBuilder actualString = new StringBuilder(sut.reverseAString(str));
        boolean result = expectedString.toString().equals(actualString.toString());
        assertTrue(result);
    }

    @Test
    public void test2(){
        String str = "Hello";
        StringBuilder expectedString = new StringBuilder("olleH");
        StringBuilder actualString = new StringBuilder(sut.reverseAString(str));
        boolean result = expectedString.toString().equals(actualString.toString());
        assertTrue(result);
    }

    @Test
    public void test3(){
        String str = "Hello there";
        StringBuilder expectedString = new StringBuilder("ereht olleH");
        StringBuilder actualString = new StringBuilder(sut.reverseAString(str));
        boolean result = expectedString.toString().equals(actualString.toString());
        assertTrue(result);
    }
}
