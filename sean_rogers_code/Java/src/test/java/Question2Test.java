import org.junit.Test;

public class Question2Test {
    @Test
    public void question2Test(){
        //Question 2 test
        StringBuilder expectedOutput = new StringBuilder("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 ");
        Question2 question2 = new Question2();
        assert(question2.fibonacci(25).toString().equals(expectedOutput.toString()));
    }

    @Test
    public void question2Test2(){
        //Question 2 test

        //The 5th iteration should be 3 instead of 5 in order for the unExpectedOutput to match the expectedOutput
        StringBuilder unExpectedOutput = new StringBuilder("0 1 1 2 5 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 ");
        Question2 question2 = new Question2();
        assert(!question2.fibonacci(25).toString().equals(unExpectedOutput.toString()));
    }
}
