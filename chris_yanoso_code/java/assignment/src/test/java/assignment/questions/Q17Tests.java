package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Q17Tests {
    private Q17 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q17();
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
        //simulating a users input
        String s = "102\n2.05\n4";
        InputStream inContent = new ByteArrayInputStream(s.getBytes());
        System.setIn(inContent);
        double interest = 102 * 2.05 * 4;
        String expectedResult = "\nPlease enter your principal:" +
                "\nPlease enter your rate:" +
                "\nPlease enter the amount of time:" +
                "\nYour interest is: " + interest;
        sut.interestRate();
        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void test2(){
        String s = "20\n1.05\n10";
        InputStream inContent = new ByteArrayInputStream(s.getBytes());
        System.setIn(inContent);
        double interest = 20 * 1.05 * 10;
        String expectedResult = "\nPlease enter your principal:" +
                "\nPlease enter your rate:" +
                "\nPlease enter the amount of time:" +
                "\nYour interest is: " + interest;
        sut.interestRate();
        assertEquals(expectedResult, outContent.toString());
    }
}
