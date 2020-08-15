package com.revature.assignment1;
/* Done */
import java.util.Scanner;

public class Q4Nfactorial {

    public static void main(String[] args) {

        // Need to make it so that the console prompts the user for a number
        // Using an input scanner for the number entered
        Scanner scanner = new Scanner(System.in);
        // Variables that will hold the number input and other numbers as necessary

        int result = 1;
        int number;



        System.out.print("Please enter a number: ");
        // Input Stream reader to taking in numerical numbers.
        number = scanner.nextInt();
        // Need to use an if loop to check if the number is not equal to 0
        // Then need to use a for loop to start calculating the N factorial
        // The N factorial is the addition of a given number and adding all previous
        // numbers before it

        if (number <= 0){
            result = 1;
            System.out.println("The number you entered is less than 1. Changed value to 1");
        } else{
            // for loop will start at 0 and count up to the number that was the input
            // and multiply each other until the loop reaches the input number.
            for (int i = 1; i <= number; i++){
                result = result * i;
            }

        }
        System.out.println("The factorial of the number you've entered is: " + result);


    }
}
