import org.junit.Test;

public class Question16Test {
    //Question 16 test?
    @Test
    public void question16Test() {
        String[] arguments = {"This", "is", "a", "string"};
        Question16.main(arguments);
        assert(Question16.argsLength == 4);
    }

    @Test
    public void question16NegativeTest() {
        String[] arguments = {"This", "is", "a", "string"};
        Question16.main(arguments);
        assert(Question16.argsLength != 3);
    }
}
