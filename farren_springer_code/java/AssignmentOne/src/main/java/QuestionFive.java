import java.util.Scanner;

public class QuestionFive {

    static void concatIt(String str, int idx) {
        System.out.println("Here is the word '" + str + "' concatenated to " + idx + " letters: ");
        for(int i = 0; i < idx; i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {

        // take in a value from the scanner
        System.out.println("Enter your word: ");
        Scanner scanner = new Scanner(System.in);
        String yourWord = scanner.next();
        System.out.println("Enter the number of letters from the word that you would like to be displayed: ");
        int yourNumber = scanner.nextInt();
        concatIt(yourWord, yourNumber);

    }
} // done