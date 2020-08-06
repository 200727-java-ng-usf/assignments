import junit.framework.TestCase;

public class QuestionFifteenTest extends TestCase {

    // call the parameterized constructor for QuestionFifteen Class
    private final QuestionFifteen questionFifteen = new QuestionFifteen(4,7);


    public void testGetNum1() throws Exception {
        assertEquals(questionFifteen.getNum1(), 4);
    }
    public void testGetNum2() throws Exception {
        assertEquals(questionFifteen.getNum2(), 7);
    }

} // "main method that calls the implementing class"