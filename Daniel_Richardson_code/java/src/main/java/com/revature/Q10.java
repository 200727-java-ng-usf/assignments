package com.revature;

public class Q10 {

    public static int min(int x, int y){
        int minNum = (x < y) ? x:y;
        return minNum;

        //checks to see if x is less than y
        //if so, it saves x as the lesser
        //if not, it saves y
        //if they're the same, it doesn't matter which number gets returned
        //unless we somehow depended on specific integer object, then it might get weird

    }

}
