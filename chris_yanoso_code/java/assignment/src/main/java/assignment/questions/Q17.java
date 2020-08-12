package assignment.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q17 {
    public void interestRate(){
        // initializes principal, rate and time as doubles
        double principal = 0.00;
        double rate = 0.00;
        double time = 0.00;
        //creates a new scanner to get info
        Scanner scanner = new Scanner(System.in);
        //sets condition to false
        boolean success = false;
        // if user inputs string or invalid number the do-while/try block will catch it and ask the user again
        do {
            try {
                System.out.print("\nPlease enter your principal:");
                principal = Double.parseDouble(scanner.next());
                System.out.print("\nPlease enter your rate:");
                rate = Double.parseDouble(scanner.next());
                System.out.print("\nPlease enter the amount of time:");
                time = Double.parseDouble(scanner.next());
                // if it reaches here than the user has enter valid numbers
                success = true;
            } catch (InputMismatchException | NumberFormatException ime) {
                System.out.println("Please enter a valid number");

            }
        }while (!success);
        // finds interest and prints it out
        double interest = principal * rate * time;
        System.out.print("\nYour interest is: " + interest);
    }
}
