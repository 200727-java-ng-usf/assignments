import java.util.Scanner;

public class Q17 {
    /*
    Write a program that calculates the simple interest on the principal, rate of interest and
    number of years provided by the user. Enter principal, rate and time through the console
    using the Scanner class.
        Interest = Principal* Rate* Time
     */

    public static void main(String[] args) {

        int simpleInterest, principal, rate, time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal:");
        principal = scanner.nextInt();
        System.out.println("Enter the rate:");
        rate = scanner.nextInt();
        System.out.println("Enter the time:");
        time = scanner.nextInt();
        System.out.println("Principal: " + principal + " rate: " + rate + " time: " + time);
        simpleInterest = principal*rate*time;
        System.out.println("Interest is: " + simpleInterest);

    }

}
