import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Q19IntegerCalcOnAnArrayListTest {

    private Q19IntegerCalcOnAnArrayList sut;

    @Before
    public void setUp() throws Exception { sut = new Q19IntegerCalcOnAnArrayList(); }

    @After
    public void tearDown() throws Exception { sut = null; }

    // Positive test
    @Test
    public void testingArrayOf4And5And6EvensAddedIs10() {
        ArrayList<Integer> theIntArrayList = new ArrayList<>();
        theIntArrayList.add(4);
        theIntArrayList.add(5);
        theIntArrayList.add(6);
        int expectedResult = 10;
        int actualResult = sut.addEvenNumbers(theIntArrayList);
    }

    // Negative test
    @Test (expected = NumberFormatException.class)
    public void stringArrayListPassedToAddEvenNumbersThrowsNumberFormatException() {
        ArrayList<Integer> nullValueArrayList = new ArrayList<>();
        nullValueArrayList.add(Integer.parseInt(null));
        int unexpectedResult = 4;
        int actualResult = sut.addEvenNumbers(nullValueArrayList);
    }


//    public void testAddOddNumbers() {
//    }
//
//    public void testAddPrimeNumbers() {
//    }
}