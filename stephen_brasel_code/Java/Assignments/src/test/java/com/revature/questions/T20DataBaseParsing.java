package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class T20DataBaseParsing {
    Q20DataBaseParsing q20;

    @Before
    public void t20setupTest() {
        System.out.println();
    }

    @After
    public void t20tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t20DataBaseParsingNotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q20);
    }
    //endregion

    //region POSITIVE
    @Test
    public void t20DataBaseParsing()
    {
        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\testHelpers\\data.txt");
        System.out.println(q20.getPeople().get(0));
        assertEquals("Name: Mickey Mouse\n" +
                "Age: 35 years\n" +
                "State: Arizona State", q20.getPeople().get(0));
    }
    //endregion

    //region NEGATIVE
    @Test
    public void t20DataBaseParsingThrowException()
    {
        q20 = new Q20DataBaseParsing("\\src\\main\\java\\com\\revature\\testHelpers\\data.md");
    }
    //endregion

}
