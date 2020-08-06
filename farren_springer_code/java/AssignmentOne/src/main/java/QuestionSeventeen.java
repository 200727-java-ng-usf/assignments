import java.util.Scanner;

public class QuestionSeventeen {
    /*
    Write a program that calculates the simple interest on the principal, rate of interest and
    number of years provided by the user. Enter principal, rate and time through the console
    using the Scanner class.
        Interest = Principal* Rate* Time
     */

    public static void main(String[] args) {

        int principal, rate, time;
        double simpleInterest;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal:");
        principal = scanner.nextInt();
        System.out.print("Enter the rate as a percent without the % sign: ");
        rate = scanner.nextInt();
        double rateDouble = (double) rate/100;
        System.out.print("Enter the time in years:");
        time = scanner.nextInt();
        System.out.println("Principal: " + principal + " rate: " + rateDouble + " time: " + time);
        simpleInterest = principal*rateDouble*time;
        System.out.println("Interest accrued after " + time + " years is: " + simpleInterest);

    }

} // done