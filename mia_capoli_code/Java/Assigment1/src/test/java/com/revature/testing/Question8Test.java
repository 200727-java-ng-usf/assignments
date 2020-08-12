package com.revature.testing;

import com.revature.questions.Question8;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Question8Test {

    private Question8 question8;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question8 = new Question8();

    }

    @Test
    public void testForPalindromes() {
        String msg = "This is all of the palindromes in the ArrayList";
        ArrayList<String> initialArray = new ArrayList<String>();
        ArrayList<String> itIs = new ArrayList<String>();
        initialArray.add("karan");
        initialArray.add("madam");
        initialArray.add("tom");
        initialArray.add("civic");
        initialArray.add("radar");
        initialArray.add("jimmy");
        initialArray.add("kayak");
        initialArray.add("john");
        initialArray.add("refer");
        initialArray.add("billy");
        initialArray.add("did");
        initialArray = question8.Palindromes(initialArray);
        ArrayList<String> correct = new ArrayList<String>();
        correct.add("madam");
        correct.add("civic");
        correct.add("radar");
        correct.add("kayak");
        correct.add("refer");
        correct.add("did");
        assertEquals(msg, correct, initialArray);


    }

    @Test
    public void testNoPalindromes() {
        String msg = "This is all of the palindromes in the ArrayList";
        ArrayList<String> initialArray = new ArrayList<String>();
        initialArray.add("karan");
        initialArray.add("tom");
        initialArray.add("jimmy");
        initialArray.add("john");
        initialArray.add("billy");
        initialArray = question8.Palindromes(initialArray);
        ArrayList<String> correct = new ArrayList<String>();
        assertEquals(msg, correct, initialArray);

    }


    @After
    public void tearDown() {
        question8 = null;
    }
}
