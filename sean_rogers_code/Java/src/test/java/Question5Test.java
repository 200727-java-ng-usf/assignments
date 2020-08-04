import org.junit.Test;

public class Question5Test {
    @Test
    public void question5Test(){
        //Question 5 test
        Question5 question5 = new Question5();
        String input = "Revature";
        assert(question5.subString(input, 4).toString().equals(input.substring(0, 3).toString()));
    }
}
