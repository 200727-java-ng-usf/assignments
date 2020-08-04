import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class Question14Test {
    @Test
    public void question14Test1(){

        Question14 question14 = new Question14();
        String expectedValue = "4.0";
        assert(question14.switchDemo(1, 16).toString().equals(expectedValue.toString()));
    }

    @Test
    public void question14Test2(){
        Date date = Calendar.getInstance().getTime();
        String expectedValue = date.toString();
        Question14 question14 = new Question14();
        assert(question14.switchDemo(2, 16).toString().equals(expectedValue.toString()));
    }

    @Test
    public void question14Test3(){

        Question14 question14 = new Question14();
        String expectedValue = "I am learning core java ";
        assert(question14.switchDemo(3, 16).toString().equals(expectedValue.toString()));
    }
}
