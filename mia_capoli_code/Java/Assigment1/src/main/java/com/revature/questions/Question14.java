package com.revature.questions;

import com.revature.*;
import com.revature.questions.extras.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Question14 {
    public void switchCase(int java) {
        Utils printValues = new Utils();
        switch (java) {
            case 1:
                double testNumber = 8;
                double sqRoot = Math.sqrt(testNumber);
                System.out.println(sqRoot);
            case 2:
                System.out.println(LocalDate.now());
            case 3:
                String javaCore = "I am learning Core Java";
                String[] stringArray = javaCore.split(" ", 5);
                printValues.printObjs(stringArray);

            }
        }
    }
