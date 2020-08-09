import java.util.Scanner;

public class QuestionEighteenSubclass extends QuestionEighteen {

    String word;

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
            System.out.println("The string has " + counter + " upper-case letters.");
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

    public static void main(String[] args) {

        // displays a message to the user to enter a string.
        System.out.println("Enter a string: ");

        // takes the input from the user and assigns it to a userWord string variable.
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();

        // create an object of the QuestionEighteenSubclass whose value is the userWord.
        QuestionEighteenSubclass theWord = new QuestionEighteenSubclass(userWord);

        System.out.println(theWord.hasUpperCaseLetters());
        System.out.println(theWord.convertToUppercase());
        System.out.println(theWord.convertToIntAndAddTen());


    }


}
