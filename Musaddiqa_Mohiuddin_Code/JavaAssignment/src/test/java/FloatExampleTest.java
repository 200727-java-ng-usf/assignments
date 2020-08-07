import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FloatExampleTest {
	
	
	
	private FloatValues2 floatExample;
	
	@Before
	public void setUp() {
		floatExample = new FloatValues2();
	}
	
	@Test
	public void floatExampleTest() {
		floatExample.main();
		assertTrue(floatExample.getValue() == 10.00f);
	}

}
