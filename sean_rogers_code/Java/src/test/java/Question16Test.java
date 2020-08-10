import org.junit.Test;

public class Question16Test {
    //Question 16 test?
    @Test
    public void returnArgumentsLengthWith4() {
        String[] arguments = {"This", "is", "a", "string"};
        Question16.main(arguments);
        assert(Question16.argsLength == 4);
    }

    @Test
    public void returnArgumentsLengthWith0() {
        String[] arguments = {""};
        Question16.main(arguments);
        assert(Question16.argsLength == 0);
    }
}
