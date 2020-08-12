package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class Q13Tests {
    private Q13 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q13();
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
        int b = 4;
        String expectedResult = "0\n" +
                "10\n" +
                "010\n" +
                "1010\n";
        sut.trianglePrint(b);
        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void test2(){
        int b = 3;
        String expectedResult = "0\n" +
                "10\n" +
                "010\n";
        sut.trianglePrint(b);
        assertEquals(expectedResult, outContent.toString());
    }

}