import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    private int[] inputData;
    private BubbleSort bubblesort;

    @Before
    public void setup() {
        bubblesort = new BubbleSort();
        inputData = new int[] {1,0,5,6,3,2,3,7,9,8,4};//have different input data
        //avoid null, return empty array
    }

    //Postive case
    @Test
    public void bubbleSort() {
        bubblesort.bubbleSort(inputData);
        assertArrayEquals(new int[] {0,1,2,3,3,4,5,6,7,8,9}, bubblesort.getArr());

    }

    // negative case
    @Test(expected = NullPointerException.class)
    public void negativeBubbleSort() {
        bubblesort.bubbleSort(null);
    }

}
