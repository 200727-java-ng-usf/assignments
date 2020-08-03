package com.revature;
import java.util.Scanner;

public class Question6 {

    private static void answer() {
        // Constructing input, assigning it, and closing it.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to see if it's even or odd.");
        int num = input.nextInt();
        input.close();

        // Formulas to set 2 variables equal to each other
        // Since this is for integers, setting the type to int
        // will ensure any decimal drops off, and we multiply it back
        int result = num/2;
        int result2 = result*2;

        // The For Loop; this will compare the two values, and tell
        // us whether our input number is odd or even.
        if (result2 == num) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        answer();
    }
}
