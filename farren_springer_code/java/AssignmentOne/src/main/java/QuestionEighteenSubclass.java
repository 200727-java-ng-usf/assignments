public class QuestionEighteenSubclass extends QuestionEighteen {

    private String word;

    public QuestionEighteenSubclass() {
        this.word = "Hey thErE how yoU DoIn";
    }

    public QuestionEighteenSubclass(String word) {
        this.word = word;
    }

    @Override
    public boolean hasUpperCaseLetters() {
        int counter = 0;
        for(int i = 0; i < word.length(); i++) {

            if(Character.isUpperCase(word.charAt(i))) {
                counter++;
            }
        }
        if(counter == 0) {
            System.out.println("The string does not have upper-case letters.");
            return false;
        }
        else {
            System.out.println("The string does have upper-case letters.");
            return true;
        }
    }

    @Override
    public String convertToUppercase() {

        String result;
        result = word.toUpperCase();
        System.out.println("Here is the string in all upper-case: ");
        return result;

    }


    @Override
    public int convertToIntAndAddTen() {
        int result = 0;
        for(int i = 0; i < word.length(); i++) {
            result += Character.getNumericValue(word.charAt(i));
        }
        result += 10;
        System.out.println("Here is the string converted to an integer + 10: ");
        return result;

    }


}
