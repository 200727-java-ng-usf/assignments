package com.revature;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class Q8Test {

    private Q8 q8;
    @Before
    public void T1SetUp(){
        //q8 = new Q8();
        ArrayList p_arr = new ArrayList(); // Palindrome strings
        // add all string in arr1
        Q8.arr1.add("karan"); //0
        Q8.arr1.add("madam");
        Q8.arr1.add("tom");
        Q8.arr1.add("civic");
        Q8.arr1.add("radar");
        Q8.arr1.add("jimmy"); // 5
        Q8.arr1.add("kayak");
        Q8.arr1.add("john");
        Q8.arr1.add("refer");
        Q8.arr1.add("billy");
        Q8.arr1.add("did"); //  10
    }

    @Test
    public void truePalindrome() { //
        // is the word at index 1: madam a palindrome?
        assertTrue(true == Q8.isPalindrome((String) (Q8.arr1.get(1))));
    }

    @Test
    public void falsePalindrome(){ //
        // is the word at index 5: jimmy a palindrome?
        assertFalse( false == Q8.isPalindrome( (String)(Q8.arr1.get(5))  ) );
    }
}