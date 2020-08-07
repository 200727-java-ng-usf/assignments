import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InterestExampleTest {
	
	private InterestExample interestExample;
	
	@Before
	public void setUp() {
		interestExample = new InterestExample();
	}
	
	@Test
	public void interestExample() {
		interestExample.main();
		assertEquals("Interest calculated", interestExample.getInterestCalculation());
	}
	
	

}
