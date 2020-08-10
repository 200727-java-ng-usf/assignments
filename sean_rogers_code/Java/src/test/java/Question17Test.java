import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Question17Test {
    Question17 question17;
    ByteArrayOutputStream outContent;
    ByteArrayOutputStream errContent;
    InputStream inStream;
    PrintStream originalOut;
    PrintStream originalErr;
    InputStream originalIn;


    @BeforeClass
    public void setup() {
        question17 = new Question17();
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        inStream = new ByteArrayInputStream(new byte[100]);
        originalOut = System.out;
        originalErr = System.err;
        originalIn = System.in;
    }
    @Test
    public void question17Test() {
        question17 = new Question17();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        InputStream inStream = new ByteArrayInputStream(new byte[100]);
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        InputStream originalIn = System.in;

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        assert(question17.calculateInterest(5.0, 4.0, 3) == 60);

    }

    @Test
    public void question17NegativeTest() {
        Question17 question17 = new Question17();

        assert(question17.calculateInterest(5.0, 4.0, 3) != 53.4);

    }
}
