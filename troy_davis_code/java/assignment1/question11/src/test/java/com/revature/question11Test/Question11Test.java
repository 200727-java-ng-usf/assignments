/**
 * Q11.
 * Write a program that would access two float-variables from a class that exists in another package.
 * Note, you will need to create two packages to demonstrate the solution.
 */

package com.revature.question11Test;

import com.revature.question11.question11AccessorPackage.Question11FloatAccessor;
import com.revature.question11.question11StoragePackage.Question11FloatStorage;
import org.junit.*;


public class Question11Test {
    Question11FloatStorage sutStorage;
    Question11FloatAccessor sutAccessor;
    String msg;

    @After
    public void tearDown(){
        sutAccessor = null;
        sutStorage = null;
        msg = null;
    }

    @Test
    public void sameValuesTestFloat1(){
        msg = "The first float in the storage class must match the first float from the accessor class";
        sutStorage = new Question11FloatStorage();
        sutAccessor = new Question11FloatAccessor();
        Assert.assertEquals(msg,sutStorage.getFloat1(), sutAccessor.getAccessedFloat1(), .001);
    }
    @Test
    public void sameValuesTestFloat2(){
        msg = "The second float in the storage class must match the second float from the accessor class";
        sutStorage = new Question11FloatStorage();
        sutAccessor = new Question11FloatAccessor();
        Assert.assertEquals(msg,sutStorage.getFloat2(), sutAccessor.getAccessedFloat2(), .001);
    }
    @Test
    public void negativeMatchTest1(){
        msg = "The float values should never be the same since they will be based on random values";
        sutStorage = new Question11FloatStorage();
        sutAccessor = new Question11FloatAccessor();
        Assert.assertNotEquals(msg,sutStorage.getFloat1(), sutAccessor.getAccessedFloat2(), .001);
    }
    @Test
    public void negativeMatchTest2(){
        //testing the opposite floats from the previous test
        msg = "The float values should never be the same since they will be based on random values";
        sutStorage = new Question11FloatStorage();
        sutAccessor = new Question11FloatAccessor();
        Assert.assertNotEquals(msg,sutStorage.getFloat2(), sutAccessor.getAccessedFloat1(), .001);
    }
}
