/**
 * Q9. Create an ArrayList which stores numbers from 1 to 100
 *      and prints out all the prime numbers to the console.
 */
package com.revature.question9Tests;

import com.revature.question9.Question9;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Question9Tests {
    Question9 sut;
    String expectedResult;
    private final PrintStream printStream = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    String msg;

    @Before
    public void setup(){
        System.setOut(new PrintStream(outputStream));
    }
    @After
    public void tearDown(){
        System.setOut(printStream);
        sut = null;
        msg = null;
        expectedResult = null;
    }

    @Test
    public void primeOnlyTest(){
        msg = "the method should print the known prime values from 1 to 100";
        expectedResult = "1\r\n2\r\n3\r\n5\r\n7\r\n11\r\n13\r\n17\r\n19\r\n23\r\n29\r\n31\r\n37\r\n41\r\n43\r\n47\r\n53\r\n59\r\n61\r\n67\r\n71\r\n73\r\n79\r\n83\r\n89\r\n97\r\n";
        sut = new Question9();
        Assert.assertEquals(msg,expectedResult,outputStream.toString());
    }
    @Test
    public void notNullTest(){
        msg = "The method should print some values, the print stream should not be null";
        sut = new Question9();
        Assert.assertNotNull(msg,outputStream);
    }
}
