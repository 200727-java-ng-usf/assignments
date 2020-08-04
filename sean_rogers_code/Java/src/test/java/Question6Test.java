import org.junit.Test;

public class Question6Test {
    @Test
    public void question6Test(){
        //Question 6 test
        Question6 question6 = new Question6();
        int input = 5;
        assert(question6.isEven(input) == false);
    }
}
