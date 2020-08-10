import org.junit.Test;

import java.util.Arrays;

public class Question1Test {
    @Test
    public void bubbleSortTest(){
        //Question 1 test
        Question1 question1 = new Question1();
        int[] ar1 = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        int[] expectedOutput = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
        question1.bubbleSort(ar1);
        boolean isSorted = true;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != expectedOutput[i]) {
                isSorted = false;
                break;
            }
        }
        assert(isSorted);
    }

    @Test
    public void bubbleSortEmptyArray(){
        //Question 1 test
        Question1 question1 = new Question1();
        int[] ar1 = {};
        int[] expectedOutput = {};
        question1.bubbleSort(ar1);
        boolean isSorted = true;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != expectedOutput[i]) {
                isSorted = false;
                break;
            }
        }
        assert(isSorted);
    }

    @Test
    public void bubbleSortWithNegativeValues(){
        //Question 1 test
        Question1 question1 = new Question1();
        int[] ar1 = {-1, 0, -5, 6, 3, 2, -3, 7, 9, 8, -4};
        int[] expectedOutput = {-5, -4, -3, -1, 0, 2, 3, 6, 7, 8, 9};
        question1.bubbleSort(ar1);
        System.out.println(Arrays.toString(ar1));
        boolean isSorted = true;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != expectedOutput[i]) {
                isSorted = false;
                break;
            }
        }
        assert(isSorted);
    }

    @Test
    public void bubbleSortAReversedArrayWithNegativeNumbers(){
        //Question 1 test
        Question1 question1 = new Question1();
        int[] ar1 = {9, 8, 7, 6, 3, 2, 0, -1, -3, -4, -5};
        int[] expectedOutput = {-5, -4, -3, -1, 0, 2, 3, 6, 7, 8, 9};
        question1.bubbleSort(ar1);
        boolean isSorted = true;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != expectedOutput[i]) {
                isSorted = false;
                break;
            }
        }
        assert(isSorted);
    }
}
