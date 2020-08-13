import java.util.Scanner;

/**
 * This class implements three methods from the abstract class QuestionEighteen and has
 * a main method to demonstrate their execution on a QuestionEighteenSubclass object.
 */
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
            System.out.println("The string has " + counter + " upper-case letter(s).");
            return true;
        }
    }

    @Override
    public String convertToUppercase() {

        String result;
        result = word.toUpperCase();
        System.out.println("Here is the string in all upper-case: " + result);
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

        // Asks the console to enter a string.
        System.out.println("Enter a string: ");

        // takes the input and assigns it to a userWord string variable.
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();

        // creates an object of the QuestionEighteenSubclass whose value is the userWord.
        QuestionEighteenSubclass theWord = new QuestionEighteenSubclass(userWord);

        System.out.println(theWord.hasUpperCaseLetters());
        System.out.println(theWord.convertToUppercase());
        System.out.println(theWord.convertToIntAndAddTen());


    }


}
