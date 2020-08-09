public abstract class QuestionEighteen {

    // declares the abstract methods

    public String word = "Howdy Hi Hello";

    public QuestionEighteen() {
        super(); // do not need this. Implicit
    }

    public QuestionEighteen(String astring) { word = astring; }

    public String getWord() { return word; }

    public abstract boolean hasUpperCaseLetters();
    public abstract String convertToUppercase();
    public abstract int convertToIntAndAddTen();

}
