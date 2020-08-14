package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class Q20Tests {
    private Q20 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q20();
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
        String expectedResult = "\nName: Mickey Mouse\n" +
                "age: 35\n" +
                "state: Arizona\n" +
                "Name: Hulk Hogan\n" +
                "age: 50\n" +
                "state: Virginia\n" +
                "Name: Roger Rabbit\n" +
                "age: 22\n" +
                "state: California\n" +
                "Name: Wonder Woman\n" +
                "age: 18\n" +
                "state: Montana";
        sut.readData();
        assertEquals(expectedResult,outContent.toString());
    }

    @Test
    public void test2(){
        //test to make sure data is read
        String expectedResult = "\nName: \n" +
                "age: \n" +
                "state: \n" +
                "Name: \n" +
                "age: \n" +
                "state: \n" +
                "Name: \n" +
                "age: \n" +
                "state: \n" +
                "Name: \n" +
                "age: \n" +
                "state: ";
        sut.readData();
        assertNotEquals(expectedResult,outContent.toString());
    }

}
