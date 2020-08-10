import java.util.Scanner;

/**
 * This class contains a main method that calls to methods add(),
 * subtract(), multiply(), and divide() in the QuestionFifteen class.
 */
public class QuestionFifteenDriver {

    public static void main(String[] args) {

        System.out.println("Enter your first integer: ");
        Scanner scanner = new Scanner(System.in);
        int yourNum1 = scanner.nextInt();
        System.out.println("Enter your second integer: ");
        int yourNum2 = scanner.nextInt();

        /**
         * This will create a QuestionFifteen object from user input.
         */
        QuestionFifteen yourNum = new QuestionFifteen(yourNum1,yourNum2);

        /**
         * This will call the QuestionFifteen methods.
         */
        yourNum.add();
        yourNum.subtract();
        yourNum.multiply();
        yourNum.divide();


    } // end main
} // end class
// done
