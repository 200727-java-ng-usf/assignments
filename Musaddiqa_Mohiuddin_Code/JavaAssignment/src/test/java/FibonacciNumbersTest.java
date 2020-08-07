import com.sun.media.sound.InvalidDataException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciNumbersTest {

    private FibonacciNumbers fibonacciNumbers;
    private int count;
    @Before
    public void setup() {
        fibonacciNumbers = new FibonacciNumbers();
        count = 25;
    }

    //positive case
    @Test
    public void fibonacci() throws InvalidDataException {
        fibonacciNumbers.main(count);
        Assert.assertEquals("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368", fibonacciNumbers.getOutputData());
    }

    @Test(expected = InvalidDataException.class)
    public void negativeFibonacci() throws InvalidDataException {
        fibonacciNumbers.main(-1);
    }
}
