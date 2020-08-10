import org.junit.Test;

public class Question5Test {
    @Test
    public void subString0to3Revature(){
        //Question 5 test
        Question5 question5 = new Question5();
        String input = "Revature";
        assert(question5.subString(input, 4).toString().equals(input.substring(0, 3).toString()));
    }


    @Test
    public void subStringOfEmptyString(){
        //Question 5 negative test
        Question5 question5 = new Question5();
        String input = "";

        //question5.subString(input, 4).toString() should return "Rev", not "Reva"
        //Make sure it doesn't equal "Reva"
        assert(question5.subString(input, 1).toString().equals(""));
    }

    @Test (expected = StringIndexOutOfBoundsException.class)
    public void subStringNegativeTestOutOfBounds(){
        //Question 5 negative test
        Question5 question5 = new Question5();
        String input = "";

        //question5.subString(input, 4).toString() should return "Rev", not "Reva"
        //Make sure it doesn't equal "Reva"
        assert(question5.subString(input, 2).toString().equals(""));
    }
}
