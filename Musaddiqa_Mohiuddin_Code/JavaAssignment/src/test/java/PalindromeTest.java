import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
	
	private Palindrome palindrome;
	private List<String> stringList;
	private List<String> palindromeList;
	
	@Before
	public void setUp() {
		palindrome = new Palindrome();
		stringList = new ArrayList<String>();
		palindromeList = new ArrayList<String>();
        stringList.add("karan");
        stringList.add("madam");
        stringList.add("tom");
        stringList.add("civic");
        stringList.add("radar");
        stringList.add("jimmy");
        stringList.add("kayak");
        stringList.add("john");
        stringList.add("refer");
        stringList.add("billy");
        stringList.add("did");
        palindromeList.add("madam");
        palindromeList.add("civic");
        palindromeList.add("radar");
        palindromeList.add("kayak");
        palindromeList.add("refer");
        palindromeList.add("did");
	}
	
	@Test
	public void palindromeTest() {
		palindrome.main(stringList);
		assertEquals(palindromeList.get(0), palindrome.getStringList().get(0));
	}
	
	@Test(expected = NullPointerException.class)
	public void negativePalindromeTest() {
		palindrome.main(null);
	}

}
