package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class Q9Tests {
    private Q9 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q9();
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
        int n = 50;
        String test = "[3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]";
        sut.primeNumbers(n);
        assertEquals(test,outContent.toString());
    }

    @Test
    public void test2(){
        int n = 100;
        String test = "[3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]";
        sut.primeNumbers(n);
        assertEquals(test,outContent.toString());
    }
}
