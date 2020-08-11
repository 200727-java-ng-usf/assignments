package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Q5Tests {
    private Q5 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q5();
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
    String str = "hello";
    int idx = 4;
    sut.partOfString(str,idx);
    assertEquals("hello", outContent.toString());
    }

    @Test
    public void test2(){
        String str = "hello";
        int idx = 3;
        sut.partOfString(str,idx);
        assertEquals("hell", outContent.toString());
    }

    @Test
    public void test3(){
        String str = "big test";
        int idx = 4;
        sut.partOfString(str,idx);
        assertEquals("big t", outContent.toString());
    }
}
