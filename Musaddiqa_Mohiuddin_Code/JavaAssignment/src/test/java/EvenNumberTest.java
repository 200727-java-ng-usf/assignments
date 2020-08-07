import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EvenNumberTest {
	
	private EvenNumber evenNumber;
	private List<Integer> numberList;
	
	@Before
	public void setUp() {
		evenNumber = new EvenNumber();
		numberList = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++)  {
            numberList.add(i);
        }
	}
	
	@Test
	public void evenNumber() {
		evenNumber.main(numberList);
		assertTrue(1 == evenNumber.getNumberList().get(0));
	}
	
	@Test(expected = NullPointerException.class)
	public void negativeEvenNumberTest() {
		evenNumber.main(null);
	}

}
