package com.revature.questions;

import com.revature.*;
import com.revature.questions.extras.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Question14 {
    public String switchCase(int java) {
        switch (java) {
            case 1:
                //if case is one, find the sqrt of a number and print it.
                double testNumber = 8;
                double sqRoot = Math.sqrt(testNumber);
                System.out.println(sqRoot);
                return String.valueOf(sqRoot);
            case 2:
                //if 2, get the date and print it.
                String date = LocalDate.now().toString();
                System.out.println(date);
                return date;
            case 3:
                //if 3, split a phrase by its words and print them.
                String javaCore = "I am learning Core Java";
                String[] stringArray = javaCore.split(" ", 5);
                Utils.printObjs(stringArray);
                return Arrays.toString(stringArray);
            default:
                //default case.
                return "";
        }
    }
}
