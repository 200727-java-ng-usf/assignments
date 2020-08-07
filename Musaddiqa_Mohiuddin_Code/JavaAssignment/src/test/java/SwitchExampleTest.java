import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class SwitchExampleTest {
	
	private SwitchExample switchExample;

	@Before
	public void setUp() {
		switchExample = new SwitchExample();
	}
	
	@Test
	public void switchExample() {
		switchExample.main(1);
		assertEquals(String.valueOf(Math.sqrt(10)), switchExample.getOutput());
		
		switchExample.main(2);
		assertEquals(String.valueOf(new Date()), switchExample.getOutput());
		
		switchExample.main(3);
		assertEquals("I am learning Core Java", switchExample.getOutput());
	}
	
	@Test(expected = NullPointerException.class)
	public void negativeSwitchExample() {
		switchExample.main(4);
	}
}
