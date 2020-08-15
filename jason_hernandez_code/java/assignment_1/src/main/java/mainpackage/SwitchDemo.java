package mainpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SwitchDemo {

    // Number to find the sqrt
    double a = 25;

    // Need to have the datetime available
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();

    // And the string
    String theString = "This is the string";


    // Build the cases in the switcher
    public void buildSwitchDemo(String dataPoint) {

        String result = "";

        switch (dataPoint) {
            case "sqrt":
                double sqrt1 = Math.sqrt(a);
                System.out.println("Original number: " + a + "sqrt: " + sqrt1);;
            break;
            case "date":
                System.out.println("Today's date: " + dtf.format(now));
            break;
            case "split":
                List<String> splitUp = new ArrayList<>(); // initialize a new ArrayList
                System.out.println("String to split: " + theString);
                splitUp = Arrays.asList(theString.split(" ")); // split the sting by spaces, add to ArrayList
                System.out.println(splitUp);
            break;

        }

    }

    // Getters and Setters

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }

    public LocalDateTime getNow() {
        return now;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }

    public String getString() {
        return theString;
    }

    public void setString(String string) {
        this.theString = string;
    }


}
