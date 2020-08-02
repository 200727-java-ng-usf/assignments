package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Q8Test {

    @Test // test 'isPalindrome' function
    public void testIsPalindrome(){

        assertTrue(Q8.isPalindrome("taco cat"));
        assertFalse(Q8.isPalindrome("taco ccat"));
    }

    @Test //test that returned list contains all of the palindromes
    public void testIfListContainsAllPalindromes(){

        List<String> originalList = Arrays.asList(
                                                "karan","madam","tom","civic","radar","jimmy",
                                                "kayak","john","refer","billy","did"
                                            );

        List<String> expectedList = Arrays.asList("madam","civic","radar","kayak","refer","did");

        List<String> resultList = Q8.getPalindromes(originalList);

        assertEquals(expectedList,resultList);
    }
    
}