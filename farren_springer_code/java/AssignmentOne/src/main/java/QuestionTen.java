import java.util.Scanner;

public class QuestionTen {

    public static void main(String[] args) {

        int num1, num2, temp;
        /* Scanner is used for getting user input.
         * The nextInt() method of scanner reads the
         * integer entered by user.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        num2 = scanner.nextInt();

        scanner.close();

        /* In first step we are comparing only num1 and
         * num2 and storing the smallest number into the
         * temp variable and then comparing the temp and
         * num3 to get final result.
         */

        temp = num1 < num2 ? num1:num2;
        System.out.println("Smallest Number is: "+temp);

    }

} // done