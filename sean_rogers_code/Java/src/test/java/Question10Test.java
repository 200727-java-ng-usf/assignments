import org.junit.Test;

public class Question10Test {
    @Test
    public void question10Test(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(8, 4) == 4);
    }

    @Test
    public void question10Test2(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(2, 3) == 2);
    }

    @Test
    public void question10Test3(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(1, 1) == 1);
    }

    @Test
    public void question10Test4(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(1, 1) != 2);
    }

    @Test
    public void question10Test5(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(1, 1) != 0);
    }
}
