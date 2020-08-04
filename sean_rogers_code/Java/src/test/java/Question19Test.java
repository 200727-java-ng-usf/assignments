import org.junit.Test;

import java.util.ArrayList;

public class Question19Test {

    @Test
    public void question19Test(){
        System.out.println("Question 19 running");
        //Question 19 test
        Question19 question19 = new Question19();
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(4);
        expectedOutput.add(6);
        expectedOutput.add(8);
        expectedOutput.add(9);
        expectedOutput.add(10);

        //expectedOutput should now contain {4, 6, 8, 9, 10}

        assert(question19.removePrimesAndDisplay().equals(expectedOutput.toString()));
    }

    @Test
    public void question19Test2(){
        //Question 19 negative test
        Question19 question19 = new Question19();
        ArrayList<Integer> unExpectedOutput = new ArrayList<Integer>();
        unExpectedOutput.add(3);
        unExpectedOutput.add(6);
        unExpectedOutput.add(8);
        unExpectedOutput.add(9);
        unExpectedOutput.add(10);

        //unExpectedOutput should now contain {3, 6, 8, 9, 10}

        //assert should be false since unExpectedOutput contains a prime number, which is 3

        assert(!question19.removePrimesAndDisplay().equals(unExpectedOutput.toString()));
        System.out.println("Question 19 stopped");
    }

    @Test
    public void question19TestAddEvens(){
        System.out.println("Question 19 running");
        //Question 19 test
        Question19 question19 = new Question19();
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();

        System.out.println(question19.addEvens());
        assert(question19.addEvens() == 2 + 4 + 6 + 8 + 10);
    }

    @Test
    public void question19TestAddOdds(){
        Question19 question19 = new Question19();
        assert(question19.addOdds() == 1 + 3 + 5 + 7 + 9);
    }
}
