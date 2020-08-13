package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class q20NotepadTest {
    private q20Notepad sut;

    @Before
    public void setUp() throws Exception {
        sut = new q20Notepad();
    }


    @After
    public void tearDown() throws Exception {
        sut = null;
    }

    @Test
    public void printDataTxT() {
        File actual = new File("src/main/resources/Data.txt");
        boolean expected = true;

        assertEquals(expected,sut.printFile(actual));
    }

    @Test
    public void printNothingGetFalse(){
        File actual = new File("src/main/resources/caseEdge.txt");
        boolean expected = false;

        assertEquals(expected,sut.printFile(actual));
    }
}