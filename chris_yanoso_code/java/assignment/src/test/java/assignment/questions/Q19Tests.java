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

public class Q19Tests {
    private Q19 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q19();
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
        //class does one thing, no input required
        String expectedResult = "\nThe sum of even numbers in 1-10 is: " + 30 +
                "\nThe sum of odd numbers in 1-10 is: " + 25 +
                "\nAn Array of 1-10 without prime numbers: [1, 2, 4, 6, 8, 9, 10]";
        sut.oneToTenArray();
        assertEquals(expectedResult, outContent.toString());
    }
}
