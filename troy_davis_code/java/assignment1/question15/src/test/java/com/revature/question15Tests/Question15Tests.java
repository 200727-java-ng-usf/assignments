/**
 * Q15. Write a program that defines an interface having the following methods:
 *          - addition, subtraction, multiplication, and division.
 *          - Create a class that implements this interface and provides appropriate
 *            functionality to carry out the required operations.
 *          - Hard code two operands in a test class having a main method that calls the implementing class.
 */

package com.revature.question15Tests;

import com.revature.question15.Question15;
import org.junit.Before;
import org.junit.Test;

public class Question15Tests {
    Question15 q1;
    double value1;
    double value2;

    @Before
    public void setup(){
        q1 = new Question15();
    }
    @Test
    public void testMultiplication(){

    }

}
