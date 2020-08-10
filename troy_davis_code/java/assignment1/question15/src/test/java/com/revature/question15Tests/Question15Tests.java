/**
 * Q15. Write a program that defines an interface having the following methods:
 *          - addition, subtraction, multiplication, and division.
 *          - Create a class that implements this interface and provides appropriate
 *            functionality to carry out the required operations.
 *          - Hard code two operands in a test class having a main method that calls the implementing class.
 */

package com.revature.question15Tests;

import com.revature.question15.Question15;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question15Tests {
    //declare all fields
    Question15 q1;
    double value1;
    double value2;
    double expetedResult;

    @Before
    public void setup(){
        //initialize all fields
        q1 = new Question15();
        value1 = 0;
        value2 = 0;
        expetedResult = 0;
    }
    @After
    public void tearDown(){
        //reset all fields
        q1 = null;
        value1 = 0;
        value2 = 0;
        expetedResult = 0;
    }
    @Test
    public void testMultiplication(){
        String msg = "when given two numbers, the method multiplication method should return the known values";
        value1 = 20;
        value2 = 5;
        expetedResult = 100;
        Assert.assertEquals(msg,expetedResult, q1.multiplication(value1, value2), .001d);;
    }
    @Test
    public void testDivision(){
        String msg = "when given two numbers, the method division method should return the known values";
        value1 = 500;
        value2 = 36;
        //used known calculator
        expetedResult = 13.8888;
        Assert.assertEquals(msg,expetedResult, q1.division(value1, value2), .001d);;
    }


}
