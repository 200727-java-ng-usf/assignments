/**
 * Q13. Display the triangle on the console as follows using any type of loop.
 * Do NOT use a simple group of print statements to accomplish this.
 *     0
 *     1 0
 *     1 0 1
 *     0 1 0 1
 */
package com.revature.question13;

public class Question13 {
    //an int value to keep track of the last printed element

    public static void printTriangle(){
        int bit = 0;
        int rowCount = 1;
        for (int i =0; i <4; i++){
            for (int j = 0; j <4; j++){
                if(bit != 0){
                    System.out.print(0 + " ");
                    bit = 0;
                }else {
                    System.out.print(1 + " ");
                    bit = 1;
                }

            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Question13.printTriangle();
    }
}
