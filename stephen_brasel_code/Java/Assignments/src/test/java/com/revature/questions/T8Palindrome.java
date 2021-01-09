package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T8Palindrome {
    Q8Palindrome sut;
    String[] words = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
    boolean[] palindromes = {false, true, false, true, true, false, true, false, true, false, true};
    String[] pals = {"madam", "civic", "radar", "kayak", "refer", "did"};

    @Before
    public void t7Setup() {
        sut = new Q8Palindrome();
        sut.sortAndStore(words);
    }

    @After
    public void t7TearDown(){
        sut = null;
    }

    //region UTILITYTESTS
    @Test
    public void t7NotNull(){
        assertNotNull(sut);
    }
    //endregion

    //region POSITIVE_TESTS


    @Test
    public void t8ArrayList(){
        assertArrayEquals(words, sut.getAllStr().toArray());
    }

    @Test
    public void t8Palindrome(){
        assertArrayEquals(pals, sut.getPalindromes().toArray());
    }

    @Test
    public void t8KPalindrome(){
        for (int i = 0; i < words.length; i++) {
            assertEquals(palindromes[i], sut.isKPalindrome(words[i], 0));
        }
    }

    @Test
    public void isKPalindrome(){
        String[] tests = {"radar", "radcar", "racecar", "racercar", "banal"};
        boolean[] results = {true, true, true, true, false};
        for (int i = 0; i < tests.length; i++) {
            assertEquals(results[i], sut.isKPalindrome(tests[i], 1));
        }
    }
    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t8Null(){
        sut.sortAndStore(null);
        assertArrayEquals(new String[]{}, sut.getPalindromes().toArray());
    }

    //endregion

}
