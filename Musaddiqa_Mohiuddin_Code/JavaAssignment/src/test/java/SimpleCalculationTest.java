import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SimpleCalculationTest {
	
	private SimpleCalculation simpleCalculation;
	
	@Before
	public void setUp() {
		simpleCalculation = new SimpleCalculation();
	}
	
	@Test
	public void simpleCalculation() {
		Integer value = simpleCalculation.addition(10, 10);
		assertEquals("20", String.valueOf(value));
		
		value = simpleCalculation.subtraction(10, 10);
		assertEquals("0", String.valueOf(value));
		
		value = simpleCalculation.multiplication(10, 10);
		assertEquals("100", String.valueOf(value));
		
		value = simpleCalculation.division(10, 10);
		assertEquals("1", String.valueOf(value));
	}
	
	@Test(expected = ArithmeticException.class)
	public void simpleCalculationException() {
		simpleCalculation.division(10, 0);
	}

}
