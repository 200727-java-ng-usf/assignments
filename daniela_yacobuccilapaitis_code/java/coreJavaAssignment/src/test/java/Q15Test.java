
/*
    Q15. Write a program that defines an interface having the following methods:
    addition, subtraction, multiplication, and division.

    Create a class that implements this interface and provides appropriate functionality
    to carry out the required operations.

    Hard code two operands in a test class having a
    main method that calls the implementing class.
 */

import com.revature.Q15;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q15Test {

    double num1 = 8.0;
    double num2 = 4.0;

    Q15 newObj = new Q15();

    @Test
    public void testingAddition(){
        assertEquals("msg", 12.0,(newObj.addition(num1, num2)), 0.001);
    }
    @Test
    public void testingSubtraction(){
        assertEquals(4.0,(newObj.subtraction(num1, num2)), 0.001);
    }

    @Test
    public void testingMultiplication(){
        assertEquals(32.0, (newObj.multiplication(num1, num2)), 0.001);
    }

    @Test
    public void testingDivision(){
        assertEquals(2.0, (newObj.division(num1, num2)), 0.001);
    }

}
