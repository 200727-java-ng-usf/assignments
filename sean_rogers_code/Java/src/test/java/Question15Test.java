import org.junit.Test;

public class Question15Test {
    @Test
    public void add5To2(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.add(2, 5) == 2 + 5);
    }

    @Test
    public void subtract3From5(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.subtract(5, 3) == 5 - 3);
    }

    @Test
    public void multiply10by5(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.multiply(10, 5) == 10 * 5);
    }

    @Test
    public void divide10By5(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.divide(10, 5) == 10 / 5);
    }

    @Test
    public void addNegative5To2(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.add(2, -5) == 2 + -5);
    }

    @Test
    public void subtract3FromNegative5(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.subtract(-5, 3) == -5 - 3);
    }

    @Test
    public void multiply10byNegative5(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.multiply(10, -5) == 10 * -5);
    }

    @Test
    public void divide10ByNegative5(){
        //Question 15 test
        Question15 question15 = new Question15();
        assert(question15.divide(10, -5) == 10 / -5);
    }
}
