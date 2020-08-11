import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class Question17Test {
    @Test
    public void principle56point3rate20point6years4() {
        Question17 question17 = new Question17();
        String s = "56.3\n20.6\n4";
        InputStream inContent = new ByteArrayInputStream(s.getBytes());
        System.setIn(inContent);
        assertEquals(question17.calculateInterest(), 4639.12, .0001);

    }

    @Test
    public void principle5rate4years3() {
        Question17 question17 = new Question17();
        String s = "5.0\n4.0\n3";
        InputStream inContent = new ByteArrayInputStream(s.getBytes());
        System.setIn(inContent);
        assertEquals(question17.calculateInterest(), 60.0, .0001);

    }

    @Test
    public void principle6rate4years3() {
        Question17 question17 = new Question17();
        String s = "6.0\n4.0\n3";
        InputStream inContent = new ByteArrayInputStream(s.getBytes());
        System.setIn(inContent);
        assertEquals(question17.calculateInterest(), 72.0, .0001);

    }

    @Test
    public void negativeTestPrincipleIsLetterFRateIs4point0YearIs3() {
        Question17 question17 = new Question17();
        String s = "6.0\n4.0\n3";
        InputStream inContent = new ByteArrayInputStream(s.getBytes());
        System.setIn(inContent);
        assertEquals(question17.calculateInterest(), 72.0, .0001);

    }
}
