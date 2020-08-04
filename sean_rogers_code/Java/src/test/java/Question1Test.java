import org.junit.Test;

public class Question1Test {
    @Test
    public void question1Test(){
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
}
