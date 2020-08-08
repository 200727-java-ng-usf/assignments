import java.util.Scanner;

public class QuestionTen {

    public static int smallerInt(int a, int b) {
        int temp = a < b ? a:b;
        return temp;
    }

    public static void main(String[] args) {

        /* Scanner is used for getting user input.
         * The nextInt() method of scanner reads the
         * integer entered by user.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = scanner.nextInt();

        scanner.close();

        /* In first step we are comparing only num1 and
         * num2 and storing the smallest number into the
         * temp variable and then comparing the temp and
         * num3 to get final result.
         */

        System.out.println("Smallest Number is: "+ smallerInt(num1, num2));

    }

} // done