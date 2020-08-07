import com.revature.Q1;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Q1Test {



    @Test
    public void q1Testerino(){
        int[] q1tArray = {10, 9, 7, 1};
        int[] q1tArrayCheck = {1, 7, 9, 10};
        Q1 testQ1 = new Q1();

        //Q1.arrayDisplay(q1tArray, true);
        q1tArray = Q1.bSort(q1tArray);
        //Q1.arrayDisplay(q1tArray, false);

        for(int i=1; i < q1tArray.length -1; i++){
            assertEquals(q1tArray[i], q1tArrayCheck[i]);
        }

        /* ----why does this not work??---
        for (int element: q1tArray){
            assertEquals(q1tArray[element], q1tArrayCheck[element]);
        }
        */

    }

}