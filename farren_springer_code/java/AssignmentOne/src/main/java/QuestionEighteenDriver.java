public class QuestionEighteenDriver {

    public static void main(String[] args) {

        QuestionEighteenSubclass theWord = new QuestionEighteenSubclass("ThisistheSTRING");

        System.out.println("+----------------+");

        System.out.println(theWord.hasUpperCaseLetters());
        System.out.println(theWord.convertToUppercase());
        System.out.println(theWord.convertToIntAndAddTen());


    }

}
