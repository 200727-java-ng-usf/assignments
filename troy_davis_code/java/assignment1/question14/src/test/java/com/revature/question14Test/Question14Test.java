/*
    Q14. Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
        Case 1: Find the square root of a number using the Math class method.
        Case 2: Display today’s date.
        Case 3: Split the following string and store it in a string array.
           	“I am learning Core Java”
 */
package com.revature.question14Test;

import com.revature.question14.Question14;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Question14Test {
    Question14 sut;

    @Before
    public void setup(){

    }
    @After
    public void tearDown(){
        sut = null;
    }
    @Test
    public void notNullTest(){
        String msg = "case 1: when given a number, it should find the known square root";

        sut = new Question14();
    }
}
