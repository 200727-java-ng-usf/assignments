package com.revature.assignment1;

public class Q13TriangleDisplay {

    public static void main(String[] args) {

        // Going to use a 2D Array to set up the tree in the specific pattern
        int[][] treeArray = { {0,}, {1, 0 }, {1,0,1 }, {0, 1, 0, 1} };



        // Might be better to use a 2D array instead and print it out that way
        // using a for loop.
        // Used a nested for loop to loop through the 2D Array to print out
        for (int i = 0; i < treeArray.length; i++){
            for (int j = 0; j < treeArray[i].length; j++)
            System.out.print(treeArray[i][j]); // This part prints out the indexes specified by i and j
            System.out.println(" "); // This is a separation buffer during the loops

        }
        // Might be better to use a 2D array instead and print it out that way
        // using a for loop.


    }



}


