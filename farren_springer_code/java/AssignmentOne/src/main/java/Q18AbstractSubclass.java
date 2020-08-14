import java.util.Scanner;

/**
 * This class implements three methods from the abstract class QuestionEighteen and has
 * a main method to demonstrate their execution on a QuestionEighteenSubclass object.
 */
public class Q18AbstractSubclass extends Q18Abstract {

    private String word;

    public Q18AbstractSubclass(String word) {
        this.word = word;
    }

    /**
     * This method will return true if the QuestionEighteenSubclass object's field
     * word has uppercase letters.
     * @return
     */
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

    /**
     * This method will convert QuestionEighteenSubclass object's field
     * word to all uppercase letters.
     * @return
     */
    @Override
    public String convertToUppercase() {

        String result;
        result = word.toUpperCase();
        System.out.println("Here is the string in all upper-case: " + result);
        return result;

    }

    /**
     * This method will return the QuestionEighteenSubclass object's field
     * word converted to an integer value plus 10.
     * @return
     */
    @Override
    public int convertToIntAndAddTen() {
        int result = 0;
        for(int i = 0; i < word.length(); i++) {
            result += Character.getNumericValue(word.charAt(i));
        }
        result += 10;
        System.out.println("Here is the string converted to an integer + 10: " + result);
        return result;

    }

    public static void main(String[] args) {

        // Asks the console to enter a string.
        System.out.println("Enter a string: ");

        // takes the input and assigns it to a userWord string variable.
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();

        // creates an object of the QuestionEighteenSubclass whose value is the userWord.
        Q18AbstractSubclass theWord = new Q18AbstractSubclass(userWord);

        theWord.hasUpperCaseLetters();
        theWord.convertToUppercase();
        theWord.convertToIntAndAddTen();


    } // end main


} // end class
