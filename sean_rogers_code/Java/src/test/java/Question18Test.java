import org.junit.Test;

public class Question18Test {

    @Test
    public void asdfHasNoUpperCaseCharacters(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.hasUpperCaseCharacter("asdf") == false);
    }

    @Test
    public void aSdfHasUpperCaseCharacter(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.hasUpperCaseCharacter("aSdf") == true);
    }

    @Test
    public void asdfToUpperCase(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.toUpperCase("aSDf").equals("ASDF"));
    }

    @Test
    public void enter25AsStringConvertToIntThenAdd10(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.fromStringToInt("25") == 35);
    }
}
