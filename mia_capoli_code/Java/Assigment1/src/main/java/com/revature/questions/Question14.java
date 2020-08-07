package com.revature.questions;

import com.revature.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Question14 {
    public void switchCase(int java) {
        Assignment1Driver printValues = new Assignment1Driver();
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
