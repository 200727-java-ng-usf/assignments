import com.revature.Q2;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Q2Test {



    @Test
    public void q2LengthTest(){ //testing for final length of array
        Q2 q2TestCl = new Q2();
        int targetNumber = 10;
        int[] testArray = q2TestCl.fSeq(targetNumber);
        assertEquals(targetNumber, testArray.length);
    }
    @Test
    public void q2ElementTest2(){ //testing for precision on certain element
        Q2 q2TestCl = new Q2();
        int targetNumber = 5;
        //0,1,1,2,3,5...
        //element 4 should == 3
        int[] testArray = q2TestCl.fSeq(targetNumber);
        assertEquals(3, testArray[4]);
    }

}