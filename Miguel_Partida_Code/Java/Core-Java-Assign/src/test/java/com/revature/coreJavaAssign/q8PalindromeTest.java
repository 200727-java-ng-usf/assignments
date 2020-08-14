package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class q8PalindromeTest {
    private q8Palindrome sut;

    @Before
    public void setUp() throws Exception {
            sut = new q8Palindrome();
        }


    @After
    public void tearDown() throws Exception {
        sut = null;
    }

    @Test
    public void palindromeAndStingList() {
        String[] actual = {"karen","madam","tom","civic"};
        ArrayList<String> justString = new ArrayList<>();
        ArrayList<String> justplaindrome = new ArrayList<>();
        justString.add("karen");
        justString.add("tom");
        justplaindrome.add("madam");
        justplaindrome.add("civic");
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        expected.add(justString);
        expected.add(justplaindrome);
        assertEquals(expected,sut.q8PalindromeO(actual));
    }

    @Test
    public void emptyStringarray(){
        String[] actual = new String[0];
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        assertEquals(expected,sut.q8PalindromeO(actual));

    }

}