/**
 * Q16. Write a program to display the number of characters for a string input.
 *      The string should be entered as a command line argument using (String [ ] args).
 */
package com.revature.question16Tests;

import com.revature.question16.Question16;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;

public class Question16Tests {
    Question16 sut;
    int characterCount;

    @Before
    public void setup(){
        sut = new Question16();
        characterCount = 0;
    }

    @After
    public void tearDown(){
        sut = null;

    }

    @Test
    public void testWhiteSpaces(){
        String msg = "when given a string with white spaces, does the class remove them?";
        String stringWithSpaces = "he llo w rold ";

    }
}
