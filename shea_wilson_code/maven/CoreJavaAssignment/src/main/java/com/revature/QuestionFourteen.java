package com.revature;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourteen {

    public static void main(String[] args) {

        Scanner blah = new Scanner(System.in);
        System.out.println("Please enter your selection: \n"
                            +"1. Will ask for a number and return a square root.\n"
                            +"2. Will present you with todays date.\n"
                            +"3. Will return a special message.");
        int user = blah.nextInt();

        switch (user){

            case 1:
                System.out.print("Please enter the number you want the square:");
                 int num = blah.nextInt();
                System.out.println("The square root of the int you entered is " + (int)Math.sqrt(num));
                break;

            case 2:
                System.out.println(java.time.LocalDate.now());
                break;

            case 3:
                String s = "I am learning Core Java";
                String[] msg = s.split(" ");
                System.out.println(Arrays.toString(msg));
        }

    }
}
