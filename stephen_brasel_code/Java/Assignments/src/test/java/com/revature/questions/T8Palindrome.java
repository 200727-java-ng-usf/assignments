package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T8Palindrome {
    Q8Palindrome q8;
    String[] words = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
    String[] pals = {"madam", "civic", "radar", "kayak", "refer", "did"};

    @Before
    public void t7Setup() {
        q8 = new Q8Palindrome();
        q8.sortAndStore(words);
    }

    @After
    public void t7TearDown(){
        q8 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t7NotNull(){
        assertNotNull(q8);
    }
    //endregion

    //region POSITIVE_TESTS


    @Test
    public void t8ArrayList(){
        assertArrayEquals(words, q8.getAllStr().toArray());
    }

    @Test
    public void t8Palindrome(){
        assertArrayEquals(pals, q8.getPalindromes().toArray());
    }
    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t8Null(){
        q8.sortAndStore(null);
        assertArrayEquals(new String[]{}, q8.getPalindromes().toArray());
    }

    //endregion

}
