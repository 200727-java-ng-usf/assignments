package com.revature;

public class Q10 {
    /**
     *
     * @param x an integer value
     * @param y an integer value
     * @return the minimum value, otherwise return zero
     */
     public int minimumOfTwoNumbers(int x, int y){
        int min;
        if (x != y) {
            min = (x > y) ?  y  :  x ;}
        else {
            System.out.println("Numbers are the same");
            min = 0;
        }
         return min;
     }
}

