import org.junit.Test;

public class Question10Test {
    @Test
    public void findMinimumOf8And4(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(8, 4) == 4);
    }

    @Test
    public void findMinimumOf3And2(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(3, 2) == 2);
    }

    @Test
    public void findMinimumOf2And3(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(2, 3) == 2);
    }

    @Test
    public void findMinimumOf1And1(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(1, 1) == 1);
    }

    @Test
    public void findMinimumOfNegative1And1(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(-1, 1) == -1);
    }

    @Test
    public void findMinimumOfNegative3AndNegative4(){
        //Question 10 test
        Question10 question10 = new Question10();
        assert(question10.findMin(-3, -4) == -4);
    }

}
