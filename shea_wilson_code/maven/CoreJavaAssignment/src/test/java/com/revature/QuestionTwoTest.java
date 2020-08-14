package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class QuestionTwoTest {

    private QuestionTwo sut;

    @Before
    public void setUp(){
        sut = new QuestionTwo();
    }

    @Test
    public void testFib(){
        String msg = "Which a given number, provide the fibonacci sequence up to that number.";
        int num = 5;
//        List<Integer> expectedResult = new ArrayList<>() {1, 2, 3, 5, 8};
//        assertArrayEquals(msg, expectedResult, List.toArray(sut.fib(num)));

    }

    @After
    public void tearDown(){
        sut = null;
    }
}
