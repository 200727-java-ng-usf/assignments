package com.revature;

import static com.revature.AppDriver.defaults;

public class Q13 {
    //Display the triangle on the console as follows using any type of loop.
    // Do NOT use a simple group of print statements to accomplish this.
    //    0
    //    1 0
    //    1 0 1
    //    0 1 0 1

    public Q13(){
        if(!defaults){
            InputHandler input = InputHandler.getInstance();
            System.out.println("Requires total length.");
            int totalCount = input.intInput();
            offbrandTriforce(totalCount);
        } else {
            offbrandTriforce(10);
        }

    }


    public int offbrandTriforce(int totalCount){

        int lineLength = 0; //this sees how many prints were done on current line
        int lineMax = 1; //max amount of prints that can be done on current line
        int printOut = 0; //this flips back and forth b/w 1 and 0
        for(int i = 0; i < totalCount ; i++){
            if(lineLength >= lineMax){
                System.out.println();
                lineMax++;
                lineLength = 0;
            }
            System.out.print(printOut);
            lineLength++;

            if(printOut == 0){ //alternating 0s and 1s
                printOut =1;
            }else{
                printOut = 0;
            }

        }
        int result = 1;
        return result;
    }

}
