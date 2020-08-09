package com.revature;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q14Main {

    private double sqrt;
    private String[] stringArray;

    private static boolean keepRunning = true;

    // constructor
    public Q14Main() {
        super();
    }

    // print override for the stringArray
    @Override
    public String toString() {
        return Arrays.toString(stringArray);
    }

    // square root method
    public void findSquareRoot(double a) {
        sqrt = Math.sqrt(a);
    }

    // today's date method
    public void findDate() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime date = LocalDateTime.now();
        System.out.println(format.format(date));
    }

    // switch-case method
    public void switchCase(int a) {

                switch (a) {
                    case 1:

                        boolean run = true;

                        while (run) {

                            try {
                                Scanner input = new Scanner(System.in);
                                System.out.println("Enter a number to find it's square root.");
                                findSquareRoot(input.nextDouble());
                                run = false;
                            } catch (InputMismatchException e) {
                                //e.printStackTrace();
                                System.out.println("Please enter a number, not... whatever that was.");
                                System.out.println("+---------------------------------------------------------------+");
                            }
                        }

                        System.out.println("The square root is " + sqrt);
                        break;

                    case 2:
                        System.out.print("Today's date is: ");
                        findDate();
                        break;

                    case 3:
                        Scanner input2 = new Scanner(System.in);
                        System.out.println("Enter the String to be turn into String[]");
                        String stringOne = input2.nextLine();
                        stringArray = stringOne.split(" ");
                        System.out.println(Arrays.toString(stringArray));
                        break;
                }
    }

    // main method
    public static void main(String[] args) {

        // This code takes in user input to handle a full-scale application
        // Nothing needs to be altered, as everything is handled in the switch cases. Based off user input.
        // Just hit play and enjoy.

        Q14Main answer = new Q14Main();
        Scanner input = new Scanner(System.in);

        while (keepRunning) {
            System.out.println("+-----------------------------------+");
            System.out.println("1: Square Root Finder.");
            System.out.println("2: Find today's date.");
            System.out.println("3: Convert a String to a String[].");
            System.out.println("0: Exit program.");
            System.out.println("+-----------------------------------+");


            try {
                int choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    answer.switchCase(choice);
                } else if (choice == 0) {
                    keepRunning = false;
                    input.close();
                    System.out.println("Closing program");
                } else {
                    System.out.println("Please choose a number from the list.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong type of input buddy.");
                System.out.println("Please choose a number from the list.");
                //e.printStackTrace(); // for seeing the stackTrace
                input.next();
            }
        }
    }
}
