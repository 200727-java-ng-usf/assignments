import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AbstractMainClassTest {
	
	private SampleUpperCase sampleUpperCase;
	
	@Before
	public void setUp() {
		sampleUpperCase = new SampleUpperCase();
	}
	
	@Test
	public void sampleUpperCase() {
		assertTrue(sampleUpperCase.checkUppercase("Hello"));
		assertEquals("HELLO", sampleUpperCase.convertUppderCase("Hello"));
		assertTrue(20 == sampleUpperCase.sumString("10"));
	}
	
	@Test(expected = NullPointerException.class)
	public void sampleUpperCaseException() {
		sampleUpperCase.checkUppercase(null);
	}
		
}
