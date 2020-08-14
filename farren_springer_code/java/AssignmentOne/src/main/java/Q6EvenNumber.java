import java.util.Scanner;

/**
 * This class has a method that shows if a number is even and
 * a main method that calls the isEven method.
 */
public class Q6EvenNumber {

    /**
     * The isEven method takes in an integer value and
     * returns true if the integer is even and false
     * if the integer is odd.
     * @param n
     * @return
     */
    public static boolean isEven(int n) {
        return ((n / 2) * 2 == n);
    }

    public static void main(String[] args) {
        /**
        * Asks the console for a an integer.
        */
        System.out.print("Enter your integer: ");

        /**
         * Creates a Scanner object to take input from the console.
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Assigns the input to an integer reference.
         */
        int yourNumber = scanner.nextInt();

        /**
         * Calls the isEven method and prints the result.
         */
        System.out.println("The number is " + yourNumber);
        if(isEven(yourNumber)) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

    } // end main

} // end class
// done