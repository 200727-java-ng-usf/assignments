import org.junit.Test;

import java.util.ArrayList;

public class Question9Test {
    @Test
    public void question9Test(){
        //Question 9 test
        Question9 question9 = new Question9();
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        int[] ints = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for(int num : ints) {
            expectedOutput.add(num);
        }
        assert(question9.displayPrimeNumbers().toString().equals(expectedOutput.toString()));
    }
}
