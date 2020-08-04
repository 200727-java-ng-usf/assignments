import org.junit.Test;

public class Question18Test {

    @Test
    public void question18ConcreteClass(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.hasUpperCaseCharacter("asdf") == false);
        assert(question18ConcreteClass.hasUpperCaseCharacter("aSdf") == true);
        assert(question18ConcreteClass.toUpperCase("aSDf").equals("ASDF"));
        assert(question18ConcreteClass.fromStringToInt("25") == 35);
    }
}
