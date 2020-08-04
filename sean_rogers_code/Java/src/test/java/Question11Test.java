import com.revature.package1.Question11;
import org.junit.Test;

public class Question11Test {
    @Test
    public void question11Test(){
        //Question 11 test
        Question11 question11 = new Question11();
        float f1 = question11.getFloat1();
        float f2 = question11.getFloat2();
        // replace System.out.println with assert
        assert(f1 == question11.getFloat1());
        assert(f2 == question11.getFloat2());
    }
}
