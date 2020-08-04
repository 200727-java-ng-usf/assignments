import org.junit.Test;

public class Question18Test {

    @Test
    public void question18ConcreteClass(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.hasUpperCaseCharacter("asdf") == false);
    }

    @Test
    public void question18ConcreteClass2(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.hasUpperCaseCharacter("aSdf") == true);
    }

    @Test
    public void question18ConcreteClass3(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.toUpperCase("aSDf").equals("ASDF"));
    }

    @Test
    public void question18ConcreteClass4(){
        //Question 18 test
        Question18ConcreteClass question18ConcreteClass = new Question18ConcreteClass();
        assert(question18ConcreteClass.fromStringToInt("25") == 35);
    }
}
