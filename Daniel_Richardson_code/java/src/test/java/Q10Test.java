
import com.revature.Q10;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Q10Test {


    @Test
    public void q10Test1(){
        int num1 = 9;
        int num2 = 9;
        System.out.println("The minimum is: "+Q10.min(num1, num2));
        assertEquals(9, Q10.min(num1, num2));
    }
    @Test
    public void q10Test2(){
        int num1 = 2;
        int num2 = 50;
        System.out.println("The minimum is: "+Q10.min(num1, num2));
        assertEquals(2, Q10.min(num1, num2));
    }
    @Test
    public void q10Test3(){
        int num1 = 819;
        int num2 = 999;
        System.out.println("The minimum is: "+Q10.min(num1, num2));
        assertEquals(819, Q10.min(num1, num2));
    }

}