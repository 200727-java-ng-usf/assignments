import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberTest {
	
	private PrimeNumbers primeNumbers;
	List<Integer> numberList;
	
	@Before
	public void setUp() {
		primeNumbers = new PrimeNumbers();
		numberList = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++)  {
            numberList.add(i);
        }
	}
	
	@Test
	public void primeNumbers() {
		primeNumbers.main(numberList);
		assertEquals("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ", primeNumbers.getPrimeValues());
	}
	
	@Test(expected = NullPointerException.class)
	public void negativePrimeNumbersTest() {
		primeNumbers.main(null);
	}
	

}
