import org.junit.Test;

public class Question13Test {
    @Test
    public void question13Test(){
        //Question 13 test
        Question13 question13 = new Question13();
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("0 \n");
        expectedOutput.append("1 0 \n");
        expectedOutput.append("1 0 1 \n");
        expectedOutput.append("0 1 0 1 \n");

        assert(question13.displayTriangle().toString().equals(expectedOutput.toString()));
    }

    @Test
    public void question13Test2(){
        //Question 13 negative test
        Question13 question13 = new Question13();
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("1 \n");
        expectedOutput.append("1 0 \n");
        expectedOutput.append("1 0 1 \n");
        expectedOutput.append("0 1 0 1 \n");

        assert(!question13.displayTriangle().toString().equals(expectedOutput.toString()));
    }
}
