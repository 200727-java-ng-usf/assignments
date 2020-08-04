/*
    Reverse a string without using a temporary variable.
    Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
 */
package com.revature.question3Test;

import com.revature.question3.Question3;
import org.junit.Assert;
import org.junit.Test;

public class Question3Test {
    String testString1 = "hello";
    String proofString1 = "olleh";
    Question3 q = new Question3(testString1);


    @Test
    public void notNullTest(){
        //make sure we are not getiing null values
        Assert.assertTrue(q.getInitialString() != null);
        Assert.assertTrue(q.getReversedString() != null);
    }
    @Test
    public void canItReverseTest(){
        //can the class return the reversed string based on proof string?
        Assert.assertTrue(q.getReversedString().equalsIgnoreCase(proofString1));
    }


}
