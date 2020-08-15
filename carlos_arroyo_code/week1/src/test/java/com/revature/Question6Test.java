package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Question6Test {

    private Question6 sut;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setUp() {sut = new Question6();}

    @After
    public void tearDown() {sut = null; }

    @Test
    public void testQuestion6() {

        int num = 101;

        if(sut.isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

    @Test
    public void testForInteger() {
        String num = "102";

        try {
            Integer newNum = Integer.parseInt(num);
            if (sut.isEven(newNum)) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
