import org.junit.Test;

public class Question3Test {


    @Test
    public void question3Test(){
        //Question 3 test
        Question3 question3 = new Question3();

        //Test input
        String input = "This is a Str!ng";

        //Expected output
        StringBuilder expectedOutput = new StringBuilder("gn!rtS a si sihT");
        assert(question3.reverseString(input).toString().equals(expectedOutput.toString()));
    }

    //Negative test. The output should not match unexpected output
    @Test
    public void question3Test2() {
        Question3 question3 = new Question3();
        String input = "This is a Str!ng";
        StringBuilder unExpectedOutput = new StringBuilder("This should not work");
        assert(!question3.reverseString(input).toString().equals(unExpectedOutput.toString()));
    }
}
