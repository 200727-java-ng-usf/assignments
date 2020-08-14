package assignment.questions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Q11Tests {
    private Q11 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q11();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        sut = null;
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

//floats are accessed
    @Test
    public void test1(){
        float f1 = 1.25f;
        float f2 = 123.56f;
        String test = ("f1: " + f1 + "\nf2: " + f2);
        sut.accessFloats();
        assertEquals(test, outContent.toString());
    }
    //tests to see it doesn't print out the wrong floats
    @Test
    public void test2(){
        float f1 = 50.03f;
        float f2 = 1234.06f;
        String test = ("f1: " + f1 + "\nf2: " + f2);
        sut.accessFloats();
        assertNotEquals(test, outContent.toString());
    }
}
