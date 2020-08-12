package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Q14Tests {
    private Q14 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q14();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        sut = null;
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void test1(){
        //testing case 1, square root
        String expectedResult = "The square root of 4 is 2.0\n";
        sut.switchMethod(1);
        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void test2(){
        //testing case 2, current date
        Date today = new Date();
        String expectedResult = "Today is " + today + "\n";
        sut.switchMethod(2);
        assertEquals(expectedResult,outContent.toString());
    }

    @Test
    public void test3(){
        //testing case 3, storing string in an array
        String expectedResult = "[I, am, learning, Core, Java, ]";
        sut.switchMethod(3);
        assertEquals(expectedResult,outContent.toString());
    }
}
