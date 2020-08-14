package com.revature.questions;

import com.revature.*;
import com.revature.questions.extras.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Question14 {
    public String switchCase(int java) {
        Utils printValues = new Utils();
        switch (java) {
            case 1:
                double testNumber = 8;
                double sqRoot = Math.sqrt(testNumber);
                System.out.println(sqRoot);
                return String.valueOf(sqRoot);
            case 2:
                String date = LocalDate.now().toString();
                System.out.println(date);
                return date;
            case 3:
                String javaCore = "I am learning Core Java";
                String[] stringArray = javaCore.split(" ", 5);
                return Arrays.toString(stringArray);
            default:
                return "";
        }
    }
}
