import com.revature.Q1;
import com.revature.Q3;
import com.revature.Q4;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Q4Test {



    @Test
    public void q4Test1(){
        int factorialNum = 5;
        factorialNum = Q4.factorial(factorialNum);
        System.out.println(factorialNum);
        assertEquals(120, factorialNum);
    }
    @Test
    public void q4Test2(){
        int factorialNum = 10;
        factorialNum = Q4.factorial(factorialNum);
        System.out.println(factorialNum);
        assertEquals(3628800, factorialNum);
    }
    @Test
    public void q4Test3(){
        int factorialNum = 2;
        factorialNum = Q4.factorial(factorialNum);
        System.out.println(factorialNum);
        assertEquals(2, factorialNum);
    }

}