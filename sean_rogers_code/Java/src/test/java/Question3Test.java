import org.junit.Test;

public class Question3Test {
    @Test
    public void question3Test(){
        //Question 3 test
        System.out.println("Test 3 running");
        Question3 question3 = new Question3();
        String input = "This is a Str!ng";
        StringBuilder expectedOutput = new StringBuilder(input);
        expectedOutput.reverse(); // THE REVERSE METHOD IS NOT USED IN THE ACTUAL SOLUTION! JUST THE TEST CASE!
        assert(question3.reverseString(input).toString().equals(expectedOutput.toString()));
        System.out.println("Test 3 stopped");
    }
}
