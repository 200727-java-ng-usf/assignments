/**
 * inherits three abstract methods from
 * a superclass. Provides the following three implementations in the subclass corresponding to
 * the abstract methods in the superclass:
 */
public class Question18ConcreteClass extends Question18AbstractClass{

    @Override
    public boolean hasUpperCaseCharacter(String str1) {
        String str2 = str1.toLowerCase();
        return !str2.equals(str1);
    }

    @Override
    public String toUpperCase(String str1) {
        String str2 = str1.toUpperCase();
        return str2;
    }

    @Override
    public int fromStringToInt(String str) {
        int integer = Integer.parseInt(str);
        integer += 10;
        return integer;
    }
}
