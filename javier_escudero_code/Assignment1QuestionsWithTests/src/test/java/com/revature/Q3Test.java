package com.revature;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertSame;

public class Q3Test {
    private Q3 sut; // SUT = System Under Test
   // delete public static void main(String[] args) {

   @Before
   public void t1Setup(){
       sut = new Q3();
   }

    @Test
    public void expectedString() {
        // string to be passed
      //  String stringToBePassed = sut.reverseString("abc d123");

        // string expected
        String  expectedReversedString= "321d abc";

        assertSame(expectedReversedString, sut.reverseString("abc d123") );
    }
    //}

}