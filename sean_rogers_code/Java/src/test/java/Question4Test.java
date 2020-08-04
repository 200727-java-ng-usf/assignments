import org.junit.Test;

public class Question4Test {
    @Test
    public void question4Test(){
        //Question 4 test
        Question4 question4 = new Question4();
        assert(question4.factorial(5) == 120);
    }

    //make sure 5 factorial does NOT equal 121
    @Test
    public void question4Test2(){
        //Question 4 test
        Question4 question4 = new Question4();
        assert(question4.factorial(5) != 121);
    }
}
