package com.revature;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q14Main {

    private static int choice;
    private double sqrt;
    private String[] stringArray;


    public Q14Main() {

        // Constructor fields
        double sqrt;
        String[] stringArray;
        int choice;
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
                                e.printStackTrace();
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
                        input2.close();
                        break;
                }
    }



    public static void main(String[] args) {

        Q14Main test2 = new Q14Main();

        test2.switchCase(1);
        System.out.println("+----------------------------+");
        test2.switchCase(2);
        System.out.println("+----------------------------+");
        test2.switchCase(3);
        System.out.println("+----------------------------+");
        test2.switchCase(4);
        // case 4 demonstrates that if 1-3 aren't entered,
        // the switch-case just gets ignored.





    }
}
