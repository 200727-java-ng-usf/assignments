package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class T20DataBaseParsing {
    Q20DataBaseParsing q20;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void t20Setup() {
    }

    @After
    public void t20TearDown(){
        q20 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t20NotNull(){
//        Collections.shuffle(bubbles);
        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\util\\data.txt");
        assertNotNull(q20);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t20DataBaseParsing()
    {
        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\util\\data.txt");
        System.out.print(q20.getPeople().get(0));
        assertEquals("Name: Mickey Mouse\n" +
                "Age: 35 years\n" +
                "State: Arizona State\n", q20.getPeople().get(0).toString());
    }
    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t20DataBaseParsingIncorrectFilePath()
    {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\util\\data.md");
        assertEquals("The file was not found at the specified location.\r\n", outContent.toString());

        System.setOut(originalOut);
        System.setErr(originalErr);
        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\util\\data.md");
    }
    @Test
    public void t20DataBaseParsingNullFilePath()
    {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        q20 = new Q20DataBaseParsing(null);
        assertEquals("Null filepath was given.\r\n", outContent.toString());

        System.setOut(originalOut);
        System.setErr(originalErr);
        q20 = new Q20DataBaseParsing(null);
    }
    //endregion

}
