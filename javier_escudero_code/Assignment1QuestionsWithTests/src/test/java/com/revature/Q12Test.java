package com.revature;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q12Test {
    /*
    *Q12. Write a program to store numbers from 1 to 100 in an array.
    *Print out all the even numbers from the array. Use the enhanced FOR loop for printing out the numbers.
    * */
    private Q12 q12;

    @Before
    public void tSetup(){
        q12 = new Q12();
    }
    // test to check for odd numbers. For example, if (numList % 2 == 1) should be false.
    //q12 = new Q12();
    @Test
    public void all100NumbersSaved(){
        int COUNT = 100;
        int []arr2 = q12.numbersStored();
        assertEquals(COUNT, arr2.length);
}

    @Test
    public void testIfAllNumbersAreEven(){
        //assertEquals(1,1);
        int arr[] = {0,2,4,6,8};
        int i = 0;
        while(i < arr.length){

            System.out.println(i +  " " + arr.length + " " + arr[i]);
           // assert
            i++;
        }
////        boolean isEven = (arr[i] % 2 == 0);
////        assertArrayEquals();
//        assertTrue(isEven);
    }
}

