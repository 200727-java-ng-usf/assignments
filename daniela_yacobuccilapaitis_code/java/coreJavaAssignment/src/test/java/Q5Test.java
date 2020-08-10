import com.revature.Q15;
import org.junit.Test;
import com.revature.Q5;

import static org.junit.Assert.*;


public class Q5Test {

    Q5 newObj = new Q5();

    @Test
    public void substringTest(){
    assertEquals("new", newObj.substring("newer", 3));

    }
}
