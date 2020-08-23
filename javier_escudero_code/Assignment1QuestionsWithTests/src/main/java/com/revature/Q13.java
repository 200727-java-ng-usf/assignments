package com.revature;

public class Q13 {
    /**
     * Q13. Display the triangle on the console as follows using any type of loop.  Do NOT use a simple group of print statements to accomplish this.
     * 0
     * 1 0
     * 1 0 1
     * 0 1 0 1
     */

    static int[] array0And1 = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
    /**                       [0]
     *                           [1][2]
     *  *                              [3][4][5]
     *  *                                       ...
     */
    static int index = 0;
    static public int[] pattern0And1Printer() {
        int printCount = 1, printCountIncrement = 1;

        while (printCount <= array0And1.length) {
            for (; index < printCount; index++)
                System.out.print(array0And1[index]); // output: printCount times
            System.out.println(); // next line
            printCountIncrement++;
            printCount = printCount + printCountIncrement;
        }
        return array0And1;
    }

    public static void main(String[] args){
        int []arr = Q13.pattern0And1Printer();
        System.out.print(arr);
    }
}
/**
 * static index = 0        < printCount = 1 |
 *                           printCount + printCountIncrement++        |  array0And1[index] output
 *  [0]          index++   <     1                  2                  |       0
 *  [1][2]       index++   <     3                  3                  |       10
 *  [3][4][5]    index++   <     6                  4                  |       101
 *  [6][7][8][9] index++   <     10                 5                  |       0101
 *  ...                    <    ...                ...                 |       ...
 */

