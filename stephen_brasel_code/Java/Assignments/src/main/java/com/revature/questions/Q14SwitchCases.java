package com.revature.questions;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import static java.time.LocalDate.now;

public class Q14SwitchCases {
//    Q14. Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
//    Case 1: Find the square root of a number using the Math class method.
//    Case 2: Display today’s date.
//    Case 3: Split the following string and store it in a string array.
//           	“I am learning Core Java”

    private double sqrnum = 16;
    private double sqrrt = 4;
    private LocalDate now;
    private String splitter = "I am learning Core Java";
    private String[] splits;

    public Q14SwitchCases() {
        now = now();
    }

//    public Q14SwitchCases(double sqrnum) {
//        this();
//        this.sqrnum = sqrnum;
//    }
//
//    public Q14SwitchCases(String splitter) {
//        this();
//        this.splitter = splitter;
//    }
//
//    public Q14SwitchCases(double sqrnum, String splitter) {
//        this();
//        this.sqrnum = sqrnum;
//        this.splitter = splitter;
//    }

//    public double getSqrnum() {
//        return sqrnum;
//    }

    public void setSqrnum(double sqrnum) {
        this.sqrnum = sqrnum;
    }

    public double getSqrrt() {
        return sqrrt;
    }

//    public LocalDate getToday() {
//        return now;
//    }
//
//    public String getSplitter() {
//        return splitter;
//    }

    public void setSplitter(String splitter) {
        this.splitter = splitter;
    }

    public String[] getSplits() {
        return splits;
    }

    public void switcher(int i){
        switch (i){
            case 1:
//    Case 1: Find the square root of a number using the Math class method.
                sqrrt = Math.sqrt(sqrnum);
                break;
            case 2:
//    Case 2: Display today’s date.
                System.out.print(now);
                break;
            case 3:
//    Case 3: Split the following string and store it in a string array.
                splits = splitter.split(" ");
                break;
            default:
                System.out.print("This is supposed to do nothing.");
                break;
        }
    }
}
