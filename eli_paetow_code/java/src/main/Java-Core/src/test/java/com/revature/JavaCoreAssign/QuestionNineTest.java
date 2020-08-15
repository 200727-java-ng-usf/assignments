package com.revature.JavaCoreAssign;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuestionNineTest {

    private QuestionNine sut;

    @Before
    public void setup() {
        sut = new QuestionNine();
    }

    @Test
    public void primeNumQ9Good() {
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        ArrayList<Integer> actualResult = sut.prime_100_Q9();
        assertEquals(expectedResult, actualResult);


    }

    @Before
    public void tearDown() {
        sut = null;

    }
}
