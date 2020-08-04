import java.util.Scanner;

public class QuestionEighteenDriver {

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

} // done
