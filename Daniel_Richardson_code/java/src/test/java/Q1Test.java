import com.revature.AppDriver;
import com.revature.Q1;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.manipulation.Sorter;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;


public class Q1Test {
    private Q1 sut;
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Rule
    public Timeout maximumTime = Timeout.seconds(3);
    @Before
    public void setup() {
        sut = new Q1();
    }
    @After
    public void tearDown() {
        sut = null;
    }
    @Test
    public void test1() {
        String msg = "If a randomly sorted array is provided, should return the array sorted.";
        int[] testArray = {1,0,5,6,3,2,3,7,9,8,4};
        int[] expectedResult = {0,1,2,3,3,4,5,6,7,8,9};
        assertArrayEquals(msg, expectedResult, sut.bSort(testArray));
    }
    @Test
    public void test2() {
        String msg = "If a randomly sorted array is provided, should return the array sorted.";
        int[] testArray = {9,9,1,2};
        int[] expectedResult = {1,2,9,9};
        assertArrayEquals(msg, expectedResult, sut.bSort(testArray));
    }

    @Test
    public void test3() {
        String msg = "If a randomly sorted array is provided, should return the array sorted.";
        int[] testArray = {9};
        int[] expectedResult = {9};
        assertArrayEquals(msg, expectedResult, sut.bSort(testArray));
    }
    @Test
    public void test4() {
        String msg = "If a randomly sorted array is provided, should return the array sorted.";
        int[] testArray = {};
        int[] expectedResult = {};
        assertArrayEquals(msg, expectedResult, sut.bSort(testArray));
    }
//ORIGINAL
//    @Test
//    public void q1Testerino(){
//        int[] q1tArray = {10, 9, 7, 1};
//        int[] q1tArrayCheck = {1, 7, 9, 10};
//        Q1 testQ1 = new Q1();
//
//        //Q1.arrayDisplay(q1tArray, true);
//        q1tArray = Q1.bSort(q1tArray);
//        //Q1.arrayDisplay(q1tArray, false);
//
//        for(int i=1; i < q1tArray.length -1; i++){
//            assertEquals(q1tArray[i], q1tArrayCheck[i]);
//        }
//
//        /* ----why does this not work??---
//        for (int element: q1tArray){
//            assertEquals(q1tArray[element], q1tArrayCheck[element]);
//        }
//        */
//
//    }
//

}