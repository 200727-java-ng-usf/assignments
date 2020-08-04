import org.junit.Test;

public class Question17Test {
    @Test
    public void question17Test() {
        Question17 question17 = new Question17();

        assert(question17.calculateInterest(5.0, 4.0, 3) == 60);

    }

    @Test
    public void question17NegativeTest() {
        Question17 question17 = new Question17();

        assert(question17.calculateInterest(5.0, 4.0, 3) != 53.4);

    }
}
