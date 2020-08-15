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
    public Question13(){
        //no args constructor to print 4 by 4 triangle
        printTriangle(4);
    }
    //parameterized constructor to create triangles of any size
    public Question13(int rows){
        //make sure rows is greater than 1
        if (rows > 1){
            printTriangle(rows);
        }
    }
    public static void printTriangle(int rows){
        int[][] intArray = new int[rows][rows];
        //create boolean value to act as zero or 1
        boolean bitFlip = false;
        //iterate through the rows
        for (int i =rows; i >= 0; i--){
            //iterate through the columns
            for (int j = i; j < rows;j++){
                //set cuurent valu to zero or 1
                if(!bitFlip){
                    intArray[i][j] = 0;
                }else {
                    intArray[i][j] = 1;
                }
                //print this value
                System.out.print(intArray[i][j]);
                //reverse the bit
                bitFlip = !bitFlip;
            }
            //move to next line
            System.out.println();
        }
    }
}
