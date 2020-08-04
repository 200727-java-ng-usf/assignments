/*
    Q12. Write a program to store numbers from 1 to 100 in an array.
            Print out all the even numbers from the array.
            Use the enhanced FOR loop for printing out the numbers.
 */

package com.revature.question12;

import com.revature.question12.Question12;
import org.junit.Assert;
import org.junit.Test;

public class Question12Test {


    //create an instance of the class to test
    Question12 q = new Question12(1,100);

    @Test
    public void notNullTest(){
        //make sure neither array is not null
        Assert.assertTrue(q.getInitialArray() != null);
    }


}
