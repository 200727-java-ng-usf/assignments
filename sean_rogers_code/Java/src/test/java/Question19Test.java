import org.junit.Test;

import java.util.ArrayList;

public class Question19Test {

    @Test
    public void question19Test(){
        System.out.println("Question 19 running");
        //Question 19 test
        Question19 question19 = new Question19();
        // replace System.out.println with assert
        System.out.println(question19.addEvens() == (2 + 4 + 6 + 8 + 10));
        System.out.println(question19.addOdds() == (1 + 3 + 5 + 7 + 9));
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(4);
        expectedOutput.add(6);
        expectedOutput.add(8);
        expectedOutput.add(9);
        expectedOutput.add(10);
        assert(question19.removePrimesAndDisplay().equals(expectedOutput.toString()));
        System.out.println("Question 19 stopped");
    }
}
