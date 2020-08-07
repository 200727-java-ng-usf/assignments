import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinimumTwoNumberTest {
	
	private MinimumTwoNumber minimumTwoNumber;
	
	@Before
	public void setUp() {
		minimumTwoNumber = new MinimumTwoNumber();
	}
	
	@Test
	public void minimumTwoNumberTest() {
		minimumTwoNumber.main(10, 81);
		assertEquals(10, minimumTwoNumber.getResult());
	}
	
	@Test(expected = NullPointerException.class)
	public void negativeMinimumTwoNumberTest() {
		minimumTwoNumber.main(null, 12);
	}
	

}
