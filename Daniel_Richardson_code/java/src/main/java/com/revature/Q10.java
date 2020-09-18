package com.revature;

import static com.revature.AppDriver.defaults;

public class Q10 {

    public Q10(){
        int x,y;
        if(!defaults){
            InputHandler input = InputHandler.getInstance();
            System.out.println("Requires int x and int y.");
            x = input.intInput();
            y = input.intInput();
        } else {
            x = 5;
            y = 10;
        }
        int minNum = min(x, y);
        System.out.println("Minimum number: " + minNum);
    }


    public int min(int x, int y){
        return (x < y) ? x:y; //i could've used Math.min, but that sounds GROSS and BORING
        //ternary expression

        //checks to see if x is less than y
        //if so, it saves x as the lesser
        //if not, it saves y
        //if they're the same, it doesn't matter which number gets returned
        //unless we somehow depended on the hash or reference of a specific integer object,
        //then it might get weird

    }

}
