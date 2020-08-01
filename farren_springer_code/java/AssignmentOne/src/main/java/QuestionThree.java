import jdk.internal.util.xml.impl.Input;
import java.util.Scanner;

public class QuestionThree {

    static String rev = "";

    public static void reverseIt(String str) {
        for(int i = str.length() -1; i >= 0; i--) {

            rev += str.charAt(i);
        }
        System.out.println("This is the string backwards: " + rev);
    }

    public static void main(String[] args) {

        System.out.println("Enter your word: ");
        Scanner scanner = new Scanner(System.in);
        String yourWord = scanner.next();
        System.out.println("Here is what you typed: " + yourWord); // test
        reverseIt(yourWord);

    }

} // done