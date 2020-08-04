import org.junit.Test;

public class Question5Test {
    @Test
    public void question5Test(){
        //Question 5 test
        Question5 question5 = new Question5();
        String input = "Revature";
        assert(question5.subString(input, 4).toString().equals(input.substring(0, 3).toString()));
    }


    @Test
    public void question5Test2(){
        //Question 5 negative test
        Question5 question5 = new Question5();
        String input = "Revature";

        //question5.subString(input, 4).toString() should return "Rev", not "Reva"
        //Make sure it doesn't equal "Reva"
        assert(!question5.subString(input, 4).toString().equals("Reva"));
    }
}
