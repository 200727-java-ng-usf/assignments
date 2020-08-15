package com.revature;


import static com.revature.AppDriver.defaults;

public class Q4 {
    //Write a program to compute N factorial.

    public Q4(){
        //too lazy to manually call methods in main.
        //will just have constructor auto call them

        int x, count;
        if(!defaults){
            System.out.println("Requires int for factorial.");
            InputHandler input = InputHandler.getInstance();
            x = input.intInput();
        } else {
            x = 5;
        }
        count = factorial(x);
        System.out.println("Factorial " + x + " : ");
        System.out.println(count);
    }

    public int factorial(int num){
        int x = num;
        //factorial n!
        //ex 5! = 1x2x3x4x5 = 120
        int count = 1; //MUST start at 1, otherwise it'll just spam x*0 and spit out zeroes all day. SAD.

        for (int i = 1; i <= x; i++){ //init i at 1 to avoid multiplying by zero
            count *= i;
        }
        return count;
    }

    /*
    public int getLimitingNumber(){



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter factorial count: ");
        int limit = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        return limit;
    }

     */

}
