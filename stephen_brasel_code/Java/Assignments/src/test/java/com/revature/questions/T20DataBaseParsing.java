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
    public void t20setupTest() {
    }

    @After
    public void t20tearDownTest(){

    }

    //region UTILITYTESTS
    @Test
    public void t20DataBaseParsingNotNull(){
//        Collections.shuffle(bubbles);
        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\util\\data.txt");
        assertNotNull(q20);
    }
    //endregion

    //region POSITIVE
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

    //region NEGATIVE
    @Test
    public void t20DataBaseParsingThrowException()
    {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\util\\data.md");
        assertEquals("The file was not found at the specified location.\r\n", outContent.toString());

        System.setOut(originalOut);
        System.setErr(originalErr);
        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\util\\data.md");
    }
    //endregion

}
