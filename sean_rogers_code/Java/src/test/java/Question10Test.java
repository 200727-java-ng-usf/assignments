import org.junit.Test;

public class Question10Test {
    @Test
    public void question10Test(){
        //Question 10 test
        Question10 question10 = new Question10();
        // replace System.out.println with assert
        assert(question10.findMin(8, 4) == 4);
        assert(question10.findMin(2, 3) == 2);
        assert(question10.findMin(1, 1) == 1);
    }
}
