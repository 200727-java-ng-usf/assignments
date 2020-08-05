import com.revature.questions.Question15;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class Question15Test {
    public static void main(String[] args) {
    }
    Question15 q15 = new Question15();
    int a = 5;
    int b = 8;
    @Test
    public void test(){
        System.out.println(q15.additionM(a, b));
        assertEquals(13, q15.additionM(a, b));
    }
}

