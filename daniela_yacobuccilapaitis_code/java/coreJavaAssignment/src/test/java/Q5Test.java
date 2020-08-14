import org.junit.Before;
import org.junit.Test;
import com.revature.questions.Q5;

import static org.junit.Assert.*;


public class Q5Test {

    Q5 sut;

    @Before
    public void setUp() {
        sut = new Q5();
    }


    @Test
    public void substringTest(){
    assertEquals("new", sut.substring("newer", 3));

    }
}
