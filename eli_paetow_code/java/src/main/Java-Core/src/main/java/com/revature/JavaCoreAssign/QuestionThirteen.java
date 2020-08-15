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

        /**
         *while i is less than 3. conitue the second loop.
         * continue the second while j < 1
         * */

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < num1; j++) {

                /**
                 * print out 0 followed by space
                 * then set = to 0 to stop
                 * */

                if (num0 == 0) {
                    System.out.print(num0 + " ");
                    num0 = 1;

                    /**
                     * print out the 0 and keep = 0
                     * */
                } else {
                    System.out.print(num0 + " ");
                    num0 = 0;
                }

            }
            /**
             *check on the second loop
             * */
            num1++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramidQ13();
    }
}
