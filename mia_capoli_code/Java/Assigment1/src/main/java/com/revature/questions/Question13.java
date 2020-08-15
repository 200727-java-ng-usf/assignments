package com.revature.questions;

public class Question13 {
    public String pyramid() {
        //Wezley, looking at the prompt, this was not the goal. It's late at the moment, so I'll look at this again on Sunday.
        String[] evenNumbers = new String[10];
        String finalPyramid = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                evenNumbers[i] = "0";
            } else {
                evenNumbers[i] = "1";
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                finalPyramid = finalPyramid.concat(evenNumbers[i]);
            } else if (i == 1) {
                finalPyramid = finalPyramid.concat("\n" + evenNumbers[i]);
                finalPyramid = finalPyramid.concat(evenNumbers[i + 1]);
            } else if (i == 3) {
                finalPyramid = finalPyramid.concat("\n" + evenNumbers[i]);
                finalPyramid = finalPyramid.concat(evenNumbers[i + 1]);
                finalPyramid = finalPyramid.concat(evenNumbers[i + 2]);
            } else if (i == 6) {
                finalPyramid = finalPyramid.concat("\n" + evenNumbers[i]);
                finalPyramid = finalPyramid.concat(evenNumbers[i + 1]);
                finalPyramid = finalPyramid.concat(evenNumbers[i + 2]);
                finalPyramid = finalPyramid.concat(evenNumbers[i + 3]);
            }
        }
        System.out.println(finalPyramid);
        return finalPyramid;
    }
}
