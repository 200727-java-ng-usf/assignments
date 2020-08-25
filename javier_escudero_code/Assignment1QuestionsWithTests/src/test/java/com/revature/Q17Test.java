package com.revature;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class Q17Test {
    private Q17 q17;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setup() {
        q17 = new Q17();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }


    @Test
    public void testInput1() {
        //simulating a users input
        String s = "10000\n2.0\n10";
        // InputStream is used to read data from a source
        InputStream inContent = new ByteArrayInputStream(s.getBytes());
        System.setIn(inContent);
        double interest = (10000 * 2.0 * 10);
        String expectedResult = "Enter principal amount : " +
                "Enter the annual rate, i.e. 6.5% is 6.5: " +
                "Enter time in years: " +
                "Simple interest of the amount is : " + interest;
        q17.calculateRate();
        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testInput2(){
        String s = "1000\n2.5\n5";
        InputStream inContent = new ByteArrayInputStream(s.getBytes());
        System.setIn(inContent);
        double interest = (1000 * 2.5 * 5);
        String expectedResult = "Enter principal amount : " +
                "Enter the annual rate, i.e. 6.5% is 6.5: " +
                "Enter time in years: " +
                "Simple interest of the amount is : " + interest;
        q17.calculateRate();
        assertEquals(expectedResult, outContent.toString());
    }
}
//   data can be retrieved using toByteArray() and toString(). Here toString() is used
