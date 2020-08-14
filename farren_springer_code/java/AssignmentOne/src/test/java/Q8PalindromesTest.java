import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Q8PalindromesTest {

    private Q8Palindromes sut;

    @Before
    public void setUp() {  sut = new Q8Palindromes();   }

    @After
    public void tearDown() { sut = null; }

    // Positive tests
    @Test
    public void heyIsNotAPalindrome() {
        assertEquals(false, sut.isPalindrome("Hey", "yeH"));
    }

    @Test
    public void yayIsAPalindrome() {
        assertNotEquals(true, sut.isPalindrome("yay", "yay"));
    }

    // Negative test
    @Test (expected = NullPointerException.class)
    public void nullPassedToIsPalindromeReturnsNullPointerException() {
        assertNotEquals(true, sut.isPalindrome(null, null));
    }
}