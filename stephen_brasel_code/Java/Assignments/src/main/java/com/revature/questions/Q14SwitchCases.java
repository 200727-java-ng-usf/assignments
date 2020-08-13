package com.revature.questions;

import java.time.LocalDate;

import static java.time.LocalDate.now;

/**
 * A <code>Q14SwitchCases</code> does 1 of 4 things: <br>
 *      1. Use the <code>{@link Math#sqrt(double)}</code> operation on <code>{@link #sqrnum}</code><br>
 *      2. print the current Date.<br>
 *      3. Use the <code>{@link String#split(String)}</code> method on <code>{@link #splitter}</code> to populate <code>{@link #splits}</code><br>
 *      or, by default, <br>
 *      4. Print out the phrase: "This is supposed to do nothing."
 * @author stephen.brasel@gmail.com
 */
public class Q14SwitchCases {
//    Q14. Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
//    Case 1: Find the square root of a number using the Math class method.
//    Case 2: Display today’s date.
//    Case 3: Split the following string and store it in a string array.
//           	“I am learning Core Java”

    /**
     * Placeholder variable for the user input of the SquareRoot switch case
     */
    private double sqrnum = 16;
    /**
     * Placeholder value of the result of the <code>{@link Math#sqrt(double)}</code> operation.
     */
    private double sqrrt = 4;
    /**
     * The Current date.
     */
    private LocalDate now;
    /**
     * Placeholder value for the user input of the <code>{@link String#split(String)}</code> operation.
     */
    private String splitter = "I am learning Core Java";
    /**
     * Placeholder value for the result of the <code>{@link String#split(String)}</code> operation.
     */
    private String[] splits;

    /**
     * Constructs this class and, by default,
     * sets the current date <code>{@link #now}</code> to <code>{@link LocalDate#now()}</code>
     */
    public Q14SwitchCases() {
        now = now();
        splits = new String[]{};
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

    /**
     * Sets <code>{@link #sqrnum}</code> to the input {@code sqrnum}.
     * @param sqrnum the number to run through the <code>{@link Math#sqrt(double)}</code> operation.
     */
    public void setSqrnum(double sqrnum) {
        this.sqrnum = sqrnum;
    }

    /**
     * Returns the result of the <code>{@link Math#sqrt(double)}</code> operation.
     * @return by default, 4.
     */
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

    /**
     * Sets the value <code>{@link #splitter}</code> to <code>{@link String}</code> "{@code splitter}".
     * This value is used in the <code>{@link String#split(String)}</code> operation.
     * @param splitter the <code>{@link String}</code> to be split.
     */
    public void setSplitter(String splitter) {
        this.splitter = splitter;
    }

    /**
     * Returns the result of the <code>{@link String#split(String)}</code> operation.
     * @return a <code>{@link String}</code>[] of the split String previously provided.
     */
    public String[] getSplits() {
        return splits;
    }

    /**
     * Given int {@code i}, this method switches on i to do 1 of 4 things: <br>
     *     1. Use the <code>{@link Math#sqrt(double)}</code> operation on <code>{@link #sqrnum}</code><br>
     *     2. print the current Date.<br>
     *     3. Use the <code>{@link String#split(String)}</code> method on <code>{@link #splitter}</code> to populate <code>{@link #splits}</code><br>
     *     or, by default, <br>
     *     4. Print out the phrase: "This is supposed to do nothing."
     * @param i 1 for sqrt, 2 for date, 3 for <code>{@link String#split(String)}</code>, 4 for nothing.
     */
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
                if(splitter == null) splitter = "";
                splits = splitter.split(" ");
                break;
            default:
                System.out.print("This is supposed to do nothing.");
                break;
        }
    }
}
