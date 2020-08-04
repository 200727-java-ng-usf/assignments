import org.junit.Test;

public class Question15Test {
    @Test
    public void question15Test(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.add(2, 5) == 2 + 5);
        assert(question15.subtract(5, 3) == 5 - 3);
        assert(question15.multiply(10, 5) == 10 * 5);
        assert(question15.divide(10, 5) == 10 / 5);
    }

    @Test
    public void question15Test2(){
        //Question 15 negative test
        Question15 question15 = new Question15();
        assert(question15.add(2, 5) != 6);
        assert(question15.subtract(5, 3) != 8);
        assert(question15.multiply(10, 5) != 23);
        assert(question15.divide(10, 5) != 3);
    }
}
