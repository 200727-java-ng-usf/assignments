import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * calculates the simple interest on the principal, rate of interest and
 * number of years provided by the user. Enter principal, rate and time through the console
 * using the Scanner class.
 * Interest = Principal* Rate* Time
 */
public class Question17 {

    // This method uses a scanner object to take in user input
    public double calculateInterest() {
        boolean runLoop = true;
        double principle = 0.0;
        double rate = 0.0;
        int timeInYears = 0;

        while(runLoop) {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter principle");
                principle = scanner.nextDouble(); //store user input into double

                System.out.println("enter rate");
                rate = scanner.nextDouble();

                System.out.println("enter time in years");
                timeInYears = scanner.nextInt();
                runLoop = false;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        //interest is calculated using a helper method
        return calculateInterest(principle, rate, timeInYears);
    }

    /**
     * this is the method that does the interest calculation. The reason it's separate is so it can be tested
     *       using the JUnit testing framework
     * @param principle
     * @param rate
     * @param timeInYears
     * @return
     */

    public double calculateInterest(double principle, double rate, int timeInYears) {

        return principle * rate * timeInYears;
    }
}
