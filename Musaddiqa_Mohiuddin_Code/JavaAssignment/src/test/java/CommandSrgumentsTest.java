import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CommandSrgumentsTest {
	
	private CommandArgument commandArgument;
	
	@Before
	public void setUp() {
		commandArgument = new CommandArgument();
	}
	
	@Test
	public void commandArgument() {
		commandArgument.main("Test World");
		assertEquals("Test World", commandArgument.getOutput());
	}
	
	@Test(expected = NullPointerException.class)
	public void commandArgumentException() {
		commandArgument.main(null);
	}

}
