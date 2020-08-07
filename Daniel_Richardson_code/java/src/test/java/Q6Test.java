
import com.revature.Q6;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Q6Test {


    @Test
    public void q6Test1(){
        int maybeEven = 1;
        System.out.println("Even? " + Q6.evenOrNot(maybeEven));
        assertEquals(false, Q6.evenOrNot(maybeEven));
    }
    @Test
    public void q6Test2(){
        int maybeEven = 3;
        System.out.println("Even? " + Q6.evenOrNot(maybeEven));
        assertEquals(false, Q6.evenOrNot(maybeEven));
    }
    @Test
    public void q6Test3(){
        int maybeEven = 5070;
        System.out.println("Even? " + Q6.evenOrNot(maybeEven));
        assertEquals(true, Q6.evenOrNot(maybeEven));
    }

}