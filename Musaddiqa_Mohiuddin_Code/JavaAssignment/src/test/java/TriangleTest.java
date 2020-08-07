import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	
	private TriangleExample triangleExample;
	
	@Before
	public void setUp() {
		triangleExample = new TriangleExample();
	}
	
	@Test
	public void triangleExample() {
		triangleExample.main(4);
		assertEquals("Triangle successfully Created", triangleExample.getTriangleString());
	}
	
	@Test(expected = NullPointerException.class)
	public void negativetriangleCase() {
		triangleExample.main(null);
	}

}
