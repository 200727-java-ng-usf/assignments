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
    public void t7setupTest() {
        q8 = new Q8Palindrome();
        q8.sortAndStore(words);
        System.out.println();
    }

    @After
    public void t7tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t7SortByNotNull(){
        assertNotNull(q8);
    }
    //endregion

    //region POSITIVE


    @Test
    public void t8ArrayList(){
        assertArrayEquals(words, q8.getAllStr().toArray());
    }

    @Test
    public void t8Palindrome(){
        assertArrayEquals(pals, q8.getPalindromes().toArray());
    }
    //endregion

    //region NEGATIVE

    //endregion

}
