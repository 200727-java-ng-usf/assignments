import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class ReadFileTest {
	
	private ReadFile readFile;
	
	@Before
	public void setUp() {
		readFile = new ReadFile();
	}
	
	@Test
	public void readFile() throws FileNotFoundException {
		readFile.main("Data.txt");
		assertEquals("Name:Mickey Mouse Age:35State:Arizona", readFile.getInputDataList().get(0));
	}
	
	@Test(expected = FileNotFoundException.class)
	public void readFileNotFoundException() throws FileNotFoundException {
		readFile.main("Data1.txt");
	}

}
