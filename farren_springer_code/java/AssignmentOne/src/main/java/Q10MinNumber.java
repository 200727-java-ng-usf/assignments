import java.util.Scanner;
/**
 * This class has a method that calculates which of two integers is the
 * smallest and a main method that calls the smallerInt method.
 */
public class Q10MinNumber {

    /**
     * The smallerInt method will return the smaller of two integers.
     * @param a
     * @param b
     * @return
     */
    public static int smallerInt(int a, int b) {
        int temp = a < b ? a:b;
        return temp;
    }

    public static void main(String[] args) {

        /**
         * Creates a Scanner object and assign input to two integer references.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = scanner.nextInt();

        scanner.close();

        /**
         * Calls the smallerInt method and prints the results.
         */

        System.out.println("Smallest Number is: "+ smallerInt(num1, num2));

    } // end main

} // end class
// done