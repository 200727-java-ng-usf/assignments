import com.revature.Q15;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Q15Test {

    Q15 q15 = new Q15();
    @Test
    public void q13Test(){
        assertEquals(17.0, q15.add(15,2));
    }
    @Test
    public void q13Test2(){
        assertEquals(13.0, q15.sub(15,2));
    }
    @Test
    public void q13Test3(){
        assertEquals(30.0, q15.mult(15,2));
    }
    @Test
    public void q13Test4(){
        assertEquals(7.5, q15.div(15,2));
    }

}
