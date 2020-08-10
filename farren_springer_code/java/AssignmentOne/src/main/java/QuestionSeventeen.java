import java.util.Scanner;

/**
 * This class has a method that calculates simple interest and a main method to
 * demonstrate that method.
 */

public class QuestionSeventeen {

    /**
     * This method takes in three values: a principal, a rate, and a time, and returns the
     * simple interest.
     * @param principal
     * @param rateDouble
     * @param time
     * @return
     */
    public static double calculateInterest(int principal, double rateDouble, int time) {

        /**
         * This will calculate the simple interest.
         */
        double simpleInterest = principal*rateDouble*time;

        /**
         * This will print the simple interest to the console.
         */
        System.out.println("Interest accrued after " + time + " years is: $" + simpleInterest);

        /**
         * This will return the simple interest.
         */
        return simpleInterest;
    } // end calculateInterest

    /**
     * This main method demonstrates the use of the calculateInterest method.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Three variables are declared: principal, rate, and time.
         */
        int principal, rate, time;

        /**
         * A Scanner object is declared to take in user input.
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * The system asks the user for input and assigns the values to the
         * appropriate variable to use as parameters for the calculateInterest method.
         */
        System.out.print("Enter the principal:");
        principal = scanner.nextInt();
        System.out.print("Enter the rate as a percent without the % sign: ");
        rate = scanner.nextInt();

        /**
         * This will cast the rate to a corresponding double to be used in
         * the calculateInterest method.
         */
        double rateDouble = (double) rate/100;

        System.out.print("Enter the time in years:");
        time = scanner.nextInt();

        /**
         * This will display the input from the console out to the console.
         */
        System.out.println("Principal: " + principal + " rate: " + rate + " time: " + time);

        /**
         * Here, we call the method calculateInterest using variables assigned by
         * user input as parameters.
         */
        calculateInterest(principal, rateDouble, time);

    } // end main

} // end class
// done