package assignment.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q17 {
    public void interestRate(){
        int principal = 0;
        int rate = 0;
        int time = 0;
        Scanner scanner = new Scanner(System.in);
        try{
            principal = Integer.parseInt(scanner.next());
            System.out.println("Please enter your rate:");
            rate = Integer.parseInt(scanner.next());
            System.out.println("Please enter the amount of time:");
            time = Integer.parseInt(scanner.next());
        } catch (InputMismatchException ime){
            System.out.println("Please enter a valid number");
            interestRate();

        } catch (NumberFormatException nfe){
            System.out.println("Please enter a valid number");
            interestRate();
        }
        int interest = principal * rate * time;
        System.out.println("Your interest is: " + interest);
    }
}
