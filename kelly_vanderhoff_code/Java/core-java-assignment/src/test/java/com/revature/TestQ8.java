package com.revature;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestQ8 {

    private final String[] wordList = {"karan", "madam", "tom", "civic", "radar", "Jimmy", "kayak", "john", "refer", "billy", "did"};
    private PalindromeQ8 pal = new PalindromeQ8();

    @Before
    public void beforeEach() {
        pal = new PalindromeQ8(wordList);
    }

    @Test
    public void test1() {
        assertArrayEquals("When a list of words is passed to the constructor, they are properly initialized",
                wordList, pal.getWords());
    }

    @Test
    public void test2() {
        assertFalse("A non-palindrome string is correctly recognized as not a palindrome",
                PalindromeQ8.isPalindrome("hat"));
    }

    @Test
    public void test3() {
        assertTrue("A palindrome string is correctly recognized as a palindrome",
                PalindromeQ8.isPalindrome("tat"));
    }

    @Test
    public void test4() {
        assertTrue("A single-character string is correctly recognized as a palindrome",
                PalindromeQ8.isPalindrome("I"));
    }

    @Test
    public void test5() {
        assertTrue("A palindrome is recognized as a palindrome regardless of capitalization",
                PalindromeQ8.isPalindrome("Civic"));
    }

    @Test
    public void test6() {
        String[] testArr = {"pick", "trip", "civic", "pop", "reviver"};
        pal.setWords(testArr);
        assertArrayEquals("A new word list can be inserted properly into our Palindrome",
                testArr, pal.getWords());
    }

    @Test
    public void test7() {
        String[] testArr = {"pick", "trip", "civic", "pop", "reviver"};
        String[] resultArr = {"civic", "pop", "reviver"};
        pal.setWords(testArr);
        pal.isPalindrome();
        assertArrayEquals("After a new word list is inserted, our Palindrome can correctly filter the new list for palindromes",
                resultArr, pal.getWords());
    }

    @Test
    public void test8() {
        String[] testArr = {"deed"};
        pal.setWords("deed");
        assertArrayEquals("Even a single String can be inserted as a new list of words",
                testArr, pal.getWords());
    }

    @Test
    public void test9() {
        String[] testArr = {"deed"};
        pal.setWords("deed");
        pal.isPalindrome();
        assertArrayEquals("Even with a single String, our Palindrome can properly filter the word list for palindromes",
                testArr, pal.getWords());
    }

    @Test
    public void test10() {
        String[] testArr = new String[0];
        pal.setWords();
        assertNotNull(pal.getWords());
        assertArrayEquals("Properly empties our word list when we call setWords with no parameters",
                testArr, pal.getWords());
    }

    @Test
    public void test11() {
        String[] testArr = new String[0];
        pal.setWords();
        pal.isPalindrome();
        assertArrayEquals("Allows us to call isPalindrome when no words are in the list, and returns an empty array",
                testArr, pal.getWords());
    }

    @Test
    public void test12() {
        String testOut = "PalindromeQ8{words=" + Arrays.toString(wordList) + "}";
        assertEquals("Test to ensure toString() produces the correct output",
                testOut, pal.toString());
    }

    @Test
    public void test13() {
        PalindromeQ8 pal2 = pal;
        assertEquals("Two Palindromes referencing the same Palindrome object will be equal",
                pal2, pal);
    }

    @Test
    public void test14() {
        PalindromeQ8 pal2 = new PalindromeQ8(wordList);
        assertEquals("Two Palindrome objects containing lists of the same Strings in the same order will be equal",
                pal2, pal);
    }

    @Test
    public void test15() {
        PalindromeQ8 pal2 = new PalindromeQ8("madam", "karan", "tom", "civic", "radar", "Jimmy", "kayak", "john", "refer", "billy", "did");
        assertNotEquals("Two Palindrome objects containing lists of the same Strings in different order will not be equal",
                pal2, pal);
    }

    @Test
    public void test16() {
        PalindromeQ8 pal2 = new PalindromeQ8("peep");
        assertNotEquals("Two Palindrome objects with String lists of different lengths will not be equal",
                pal, pal2);
    }

    @Test
    public void test17() {
        String testStr = "kayak";
        assertNotEquals("A Palindrome cannot be equal to any object other than another Palindrome",
                pal, testStr);
    }

    @Test
    public void test18() {
        PalindromeQ8 pal2 = pal;
        assertEquals("Two Palindromes referencing the same object will have the same hashcode",
                pal2.hashCode(), pal.hashCode());
    }

    @Test
    public void test19() {
        PalindromeQ8 pal2 = new PalindromeQ8(wordList);
        assertEquals("Two Palindromes whose lists of Strings have the same values will have the same hashcode",
                pal2.hashCode(), pal.hashCode());
    }

    @Test
    public void test20() {
        PalindromeQ8 pal2 = new PalindromeQ8("sunshine", "rain", "peep");
        assertNotEquals("No Palindromes whose lists of Strings have different values will have the same hashcode",
                pal2.hashCode(), pal.hashCode());
    }
}
