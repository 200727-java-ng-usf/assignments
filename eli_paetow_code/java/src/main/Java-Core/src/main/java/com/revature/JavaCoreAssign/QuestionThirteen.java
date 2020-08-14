package com.revature.JavaCoreAssign;

//Display the triangle on the console as follows using any type of loop.  Do NOT use a simple group of print statements to accomplish this.
//        0
//        1 0
//        1 0 1
//        0 1 0 1


public class QuestionThirteen {

    public static void pyramidQ13() {
        int num0 = 0;
        int num1 = 1;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < num1; j++) {

                if (num0 == 0) {
                    System.out.print(num0 + " ");
                    num0 = 1;
                } else {
                    System.out.print(num0 + " ");
                    num0 = 0;
                }

            }
            num1++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramidQ13();
    }
}
