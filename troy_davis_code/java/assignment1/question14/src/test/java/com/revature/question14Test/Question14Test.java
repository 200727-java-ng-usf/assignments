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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class Question14Test {
    Question14 sut;
    InputStream inContent;
    String input;
//    @Before
//    public void setup(){
//        sut = new Question14();
//    }
    @After
    public void tearDown(){
        sut = null;
        inContent = null;
        input = null;
    }
    @Test
    public void case1Test(){
        String msg = "case 1: when given a number, it should find the known square root";
        input = "1\n64\n";
        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        sut = new Question14();
        Assert.assertTrue(msg, sut.getCaseOne() == 8);
    }
    @Test
    public void case3Test(){
        String msg = "case3: when given a String, the class should store it in a split string array";
        String[] proof = {"i", "am", "learning", "core", "java"};
        input = "3\n i am learning core java \n";
        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        sut = new Question14();
        Assert.assertArrayEquals(msg,proof, sut.getSplitStringArray());
    }

}
