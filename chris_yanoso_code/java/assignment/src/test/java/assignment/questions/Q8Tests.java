package assignment.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class Q8Tests {
    private Q8 sut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setup() {
        sut = new Q8();
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
        ArrayList<String> stringList = new ArrayList<>(6);
        stringList.add("racecar");
        stringList.add("madam");
        stringList.add("tom");
        stringList.add("civic");
        stringList.add("tenet");
        stringList.add("chris");
        String test = "These are palindromes: [racecar, madam, civic, tenet]";
        sut.palindromeTest(stringList);
        assertEquals(test, outContent.toString());
    }

    @Test
    public void test2(){
        ArrayList<String> stringList = new ArrayList<>(11);
        stringList.add("karan");
        stringList.add("madam");
        stringList.add("tom");
        stringList.add("civic");
        stringList.add("radar");
        stringList.add("jimmy");
        stringList.add("kayak");
        stringList.add("john");
        stringList.add("refer");
        stringList.add("billy");
        stringList.add("did");
        String test = "These are palindromes: [madam, civic, radar, kayak, refer, did]";
        sut.palindromeTest(stringList);
        assertEquals(test, outContent.toString());
    }
}