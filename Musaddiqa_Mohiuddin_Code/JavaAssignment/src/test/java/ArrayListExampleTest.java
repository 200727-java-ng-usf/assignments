import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ArrayListExampleTest {
	
	private ArrayListExample arrayListExample;
	private List<Integer> numberList;
	
	@Before
	public void setUp() {
		arrayListExample = new ArrayListExample();
		numberList = new ArrayList<Integer>();
	}
	
	@Test
	public void arrayListExample () {
		for (int i = 1; i <= 10; i++) {
            numberList.add(i);
        }
		arrayListExample.main(numberList);
		assertTrue(30 == arrayListExample.getEvenSumAmount());
		assertTrue(25 == arrayListExample.getOddSumAmount());
	}
	
	@Test(expected = NullPointerException.class)
	public void arrayListExampleException () {
		arrayListExample.main(null);
	}

}
